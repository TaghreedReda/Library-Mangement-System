import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public  abstract class Subscriber
{
	//for observer pattern
	protected Content content;
	
	BorrowingRecord borrowingRecord;
  Data  data = Data.getInstance();
   String [] Notifications ; 
	
   private String Password ;
    protected static  int  fee=0;
	private int balance;
	private String CurrentContent,address,phone,name,email,ID ;
	
	public void setNotifications(String [] wl)
	{
		Notifications = wl;
	}
	public  String [] getNotifications()
	{
		return Notifications;
	}
	public String getCurrentContent() {
		return CurrentContent;
	}
	
	public void setCurrentContent(String currentContent) {
		CurrentContent = currentContent;
	}
	public int getFee() 
	{
		return fee;
	}
	public void setFee(int fee) 
	{
		Subscriber.fee = fee;
	}
    public String getSfee() {
    	
    	String Sfee = String.valueOf(getFee());
    	return Sfee;
    }
   
 public String getSbalance() {
    	
    	String Sbalance = String.valueOf(checkBalance());
    	return Sbalance;
    }
   

	
	public void setID(String id)
	{
		ID=id;
	}
	public String getID()
	{
		return ID;
	}

	public void setName(String Name)
	{
		name = Name;
	}
	public String getName()
	{
		return name;
	}
	
public void setPhone(String Phone)
	{
		phone = Phone;
	}

public String getPhone()
{
	return phone;
}

public String getAddress()
	{
		return address;
	}
	
public void setAddress(String Address)
	{
		address = Address;
	}
	public void setEmail(String Email)
	{
		email = Email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public  void borrowContent(String contID ) 
	{ 
		 borrowingRecord = new BorrowingRecord ();
		 
		 borrowingRecord.setContentID(contID);
		 
		 borrowingRecord.setSubscriberID(this.getID());
		 
		 borrowingRecord.setborrowDate((java.sql.Date) new Date());
		 
		for (Content content : data.Items ) {
			if (content.getID() == contID)
				content.setCopies(content.getCopies()-1);
			if(content.getCopies() == 0)
			{
				State s = new Borrowed();
				content.setState(s);
			}
		}
		data.BorrowedContents.add(borrowingRecord);
	}
		
		public void returnContent(String contId) throws ParseException 
		{
			
			for (BorrowingRecord borrowingRecord :data.BorrowedContents ) {
				if (borrowingRecord.getContentID()==contId && borrowingRecord.getSubscriberID()==this.getID()) {
					borrowingRecord.setreturnDate( (java.sql.Date) new Date());
					
					for (Content content : data.Items ) {
						if (content.getID() == contId) 
				{
					content.setCopies(content.getCopies()+1);
					if(content.getCopies() >0)
					{
						State s = new OnShelf();
						content.setState(s);
					}
				}
			}
			}
			}	
			this.setCurrentContent("0");		
		}
		
		public long checkBalance() 
		{
			return  balance;
		}
		
		public void setBalance (int b) 
		{
			 balance=b;
		}
		public abstract String getType();
		
		// for observer pattern
		public void update () 
		{
			 String r= ("Item : "+content.getTitle()+ " ID " +content.getID()+" is Onshelf now again" );
	    this.Notifications[this.Notifications.length-1]=r;
			 
		}
		
	    public void PayFees () 
	    {
	    	//msgbox show fees
	    	balance -= fee;
			
		}
		
	    public abstract int CalculateFees(Date borrowDate, Date returnDate) throws ParseException;
	
		public String getPassword() {
			return Password;
		}
	
		public void setPassword(String password) {
			Password = password;
		}
		
		
		
	}

	 class GoldenSubscriber extends Subscriber
	{

	public GoldenSubscriber()
	   {
		   
	   }
		 
		public GoldenSubscriber ( Content content ) 
		{
			this.content = content;
		      this.content.attach(this);	
		}
			
		 @Override
		public String getType() 
		{
			return "Golden";
		}

	@Override
	public int CalculateFees(Date borrowDate, Date returnDate) throws ParseException 
	{
		// TODO Auto-generated method stub
		
	    
		long diff = returnDate.getTime()- borrowDate.getTime();
		
		long diffDays = diff / (24 * 60 * 60 * 1000);
	    
			if (diffDays>90) 
			{
				Subscriber.fee+=30;
		
			}
	           return fee;	
	}
	}
	 
 class RegularSubscriber extends Subscriber
{
		

		public RegularSubscriber()
		{
			 
		 }

		public RegularSubscriber ( Content content ) 
		{
			this.content = content;
		      this.content.attach(this);	
		}
		
		 @Override
		public String getType() 
		{
			return "Regular";
		}
		 
		@Override
		public int CalculateFees(Date borrowDate, Date returnDate) throws ParseException 
		{
			
			long diff = returnDate.getTime()- borrowDate.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);
		    
				if (diffDays>21) 
			{
					Subscriber.fee+=30;
					 
			}
				return fee;
		}

}
