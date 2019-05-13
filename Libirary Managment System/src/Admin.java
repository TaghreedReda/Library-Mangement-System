import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Admin {
	public String Username;
	private String Password ;
	
	Data  data = Data.getInstance();

	//static data dataObj = new data ();
	Subscriber subscriber;
	ContentFactory contentFactory = new ContentFactory();
    Content content;
    Library library;
    BorrowingRecord  borrowingRecord ;
    
    Date change ( String bDate) throws ParseException {
		Date b_date;
		b_date=new SimpleDateFormat("dd/MM/yyyy").parse( bDate);
		return b_date;
	}
    
    public void addContent(String contID,String category,String title ,String author, String Publisher,String libID ,
    		String ProductionYear ,String copies) 
	{
		//System.out.println(category);
		if (category=="Book")
		{
			 content = contentFactory.getContent("Book");
		}
		else if (category == "Journal") 
		{
			 content = contentFactory.getContent("Journal");
		}
		else if (category == "Digital Media")
		{
			 content = contentFactory.getContent("Digital Media");
		}
		content.setAuthor(author);  
		content.setPub(Publisher); 
		content.setlibID(libID);
		content.SetPYear(ProductionYear);
		content.setCopies(Integer.parseInt(copies)); 
		content.setID(contID);
		
		if(content.getCopies()>0) {
			OnShelf onshelf = new OnShelf();
			onshelf.doAction(content);	
		}
		else if (content.getCopies()==0) {
			Borrowed borrowed = new Borrowed();
			borrowed.doAction(content);	
		}
		data.Items.add(content);
		
	}
	public void editContent(String contID,String category,String title ,String author, String Publisher,String libID ,
			String ProductionYear ,String copies)
	{
				for (Content cont : data.Items) 
				{
					if (cont.getID()==contID) {
						
						content.setAuthor(author);  
						content.setPub(Publisher); 
						content.setlibID(libID);
						content.SetPYear(ProductionYear);
						content.setCopies(Integer.parseInt(copies)); 
						content.setID(contID);					
					}
				}
				  
	}
	public  void removeContent(String libID , String contentID) 
	{
				for (Content cont :data.Items) 
				{
					if (cont.getID()==contentID) {
						data.Items.remove(cont);
					}
				}	
	}
	
	public void addLibrary(String id , String name , String address) 
	{
		 library=new Library();
		library.setAddress( address); library.setname(name); library.setID(id);
		data.libraries.add(library);		
	}
	
	public void removeLibrary(String id) 
	{
		
		for(Library lib : data.libraries)
		{
			if(lib.getID()==id) 
			{
				data.libraries.remove(lib);
			}
		}
		
	}
	
public void editLibrary(String id , String name , String address){
		
	for(Library lib : data.libraries)
	{
		if(lib.getID()==id) 
		{
			lib.setAddress( address); lib.setname(name); lib.setID(id);
		}
	}	
}

public void addSubscriber(String address,String phone,String email,String ID,String balance,String type) {
		
		if(type=="Golden") {
			subscriber=new GoldenSubscriber();
				
		}
		else { 
			subscriber=new RegularSubscriber();
		}
		subscriber.setAddress(address);
		subscriber.setPhone(phone);
		subscriber.setEmail(email);
		subscriber.setID(ID);
		subscriber.setBalance(Integer.parseInt(balance));
		
		data.Subs.add(subscriber);
		
	}
	public void removeSubscriber(String ID) {
		
		for(Subscriber sub : data.Subs )
		{
			if(sub.getID()==ID) 
			{
				data.Subs.remove(sub);
			}
		}
		
	}
	public void editSubscriber(String address,String phone,String email,String ID,String balance,String type){
		for(Subscriber subscriber : data.Subs )
		{
			if(subscriber.getID()==ID) 
			{
				subscriber.setAddress(address);
		subscriber.setPhone(phone);
		subscriber.setEmail(email);
		subscriber.setID(ID);
		subscriber.setBalance(Integer.parseInt(balance));
			}
		}

	}
	
	public void addBorrowingRec(String SubscriberID ,String ContentID,int fee,Date b_date, Date r_date) {
		 
		  borrowingRecord =new BorrowingRecord();
		  borrowingRecord.setborrowDate(b_date);
		  borrowingRecord.setContentID(ContentID);
		  borrowingRecord.setFee(fee);
		  borrowingRecord.setreturnDate(r_date);
		  borrowingRecord.setSubscriberID(SubscriberID);
		  
			data.BorrowedContents.add(borrowingRecord);		
	}
	public void removeBorrowingRec(String SubscriberID ,String ContentID) {
		for (BorrowingRecord  borrowingRecord :data.BorrowedContents ) {
			if (borrowingRecord.getSubscriberID()== SubscriberID && borrowingRecord.getContentID()==ContentID) {
				data.BorrowedContents.remove(borrowingRecord);
			}
		}
	}
	public void editBorrowingRec(String SubscriberID ,String ContentID,int fee,Date b_date, Date r_date){
		for (BorrowingRecord  borrowingRecord :data.BorrowedContents ) {
			if (borrowingRecord.getSubscriberID()== SubscriberID && borrowingRecord.getContentID()==ContentID) {
				borrowingRecord =new BorrowingRecord();
				  borrowingRecord.setborrowDate(b_date);
				  borrowingRecord.setContentID(ContentID);
				  borrowingRecord.setFee(fee);
				  borrowingRecord.setreturnDate(r_date);
				  borrowingRecord.setSubscriberID(SubscriberID);
			}
	}

	}
}
