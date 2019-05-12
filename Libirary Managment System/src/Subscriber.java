import java.text.ParseException;
import java.util.Date;

public  abstract class Subscriber
{
	Content content;
	BorrowingRecord borrowingRecord;
   static Data obj = new Data ();
	protected static  int  fee=0;
	private int balance;
	public int getFee() 
	{
		return fee;
	}
	public void setFee(int fee) 
	{
		Subscriber.fee = fee;
	}
    private String address,phone,name,email,ID ;
	//private String Password ;
	
	public void browse() 
	{
		
	}
	public void setID(String id)
	{
		ID=id;
	}
	public void setName(String Name)
	{
		name = Name;
	}
	public void setPhone(String Phone)
	{
		phone = Phone;
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
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getID()
	{
		return ID;
	}
	public String getPhone()
	{
		return phone;
	}
	
	
	public  void borrowContent(String contID ) 
	{ 
		 borrowingRecord = new BorrowingRecord ();
		 
		 borrowingRecord.setContentID(contID);
		 
		 borrowingRecord.setSubscriberID(this.getID());
		 
		 borrowingRecord.setborrowDate((java.sql.Date) new Date());
		 
		for (Content content : Data.Items ) {
			if (content.getID() == contID)
				content.setCopies(content.getCopies()-1);
			if(content.getCopies() == 0)
			{
				State s = new Borrowed();
				content.setState(s);
			}
		}
		Data.BorrowedContents.add(borrowingRecord);
	}
		
		public void returnContent(String contId) throws ParseException 
		{
			
			for (BorrowingRecord borrowingRecord :Data.BorrowedContents ) {
				if (borrowingRecord.getContentID()==contId && borrowingRecord.getSubscriberID()==this.getID()) {
					borrowingRecord.setreturnDate( (java.sql.Date) new Date());
					
					for (Content content : Data.Items ) {
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
			
		}
		
	    public void PayFees () 
	    {
	    	//msgbox show fees
	    	balance -= fee;
			
		}
		
	    public abstract int CalculateFees(Date borrowDate, Date returnDate) throws ParseException;
		
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
		// for observer pattern
		public void update ()
		{
			 content.getState();
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
		// for observer pattern
		public void update ()
		{
			 content.getState();
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
