import java.util.ArrayList;
import java.util.List;
import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream;

 

public class Admin {
	public String Username;
	private String Password ;
	
    ContentFactory contentFactory = new ContentFactory();
    Content content;
    
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
		content.author=author;  
		content.Publisher=Publisher; content.libID=libID; content.ProductionYear=ProductionYear;
		content.copies=Integer.parseInt(copies); content.id=contID;
		
		if(content.copies>0) {
			OnShelf onshelf = new OnShelf();
			onshelf.doAction(content);	
		}
		else if (content.copies==0) {
			Borrowed borrowed = new Borrowed();
			borrowed.doAction(content);	
		}
		

		
		
		// hy3ml add fl file hna l kol attributes bta3t el content 
	}
	public void editContent(String contID,String category,String title ,String author, String Publisher,String libID ,
			String ProductionYear ,String copies)
	{
		//bdal da hyb2a nfs el logic lakn  f file
		 /*
		for(Library lib : libraries)
		{
			if(lib.ID==libID) 
			{
				for (Content cont : lib.libraryContents) 
				{
					if (cont.id==contID) {
						
						content.author=author;  
						content.Publisher=Publisher; 
						content.libID=libID; 
						content.ProductionYear=ProductionYear;
						content.copies=Integer.parseInt(copies);
						
						// hna zy ma dwrna fl list hndwar fl files bl id bardo w n-update
					}
				}
				  
			}
		}
		*/
	}
	
	public  void removeContent(String libID , String contentID) 
	{
		
		//bdal da hyb2a nfs el logic lakn  f file
		 /*
		for(Library lib : libraries)
		{
			if(lib.ID==libID) 
			{
				for (Content cont : lib.libraryContents) 
				{
					if (cont.id==contentID) {
						lib.libraryContents.remove(cont);
					}
				}
				  
			}
		}*/
		
	}
	
	public void addLibrary(String id , String name , String address) 
	{
		Library library=new Library();
		library.address=address; library.name=name; library.ID=id;
		
		//bdal da hyb2a nfs el logic lakn  f file
		//libraries.add(library);
		
	}
	
	public void removeLibrary(String id) 
	{
		//bdal da hyb2a nfs el logic lakn  f file
		 /*
		for(Library lib : libraries)
		{
			if(lib.ID==id) 
			{
				libraries.remove(lib);
			}
		}
		*/
	}
	
public void editLibrary(String id , String name , String address){
		//bdal da hyb2a nfs el logic lakn  f file
		 /*
		for(Library lib : libraries)
		{
			if(lib.ID==id) 
			{
				lib.address=address; lib.name=name;
			}
		}
		*/
	}	
	
public void addSubscriber(String address,String phone,String email,String ID,String balance,String type) {
		Subscriber subscriber;
		if(type=="Golden") {
			subscriber=  new GoldenSubscriber();
				
		}
		else { 
			subscriber=  new RegularSubscriber();
		}
		subscriber.address=address;
		subscriber.phone=phone;
		subscriber.email=email;
		subscriber.ID=ID;
		subscriber.balance=Integer.parseInt(balance);	
	}
	public void removeSubscriber(String ID) {
		//bdal da hyb2a nfs el logic lakn  f file
		 /*
		for(Subscribers sub : Subscribers )
		{
			if(sub.ID==id) 
			{
				Subscribers.remove(sub);
			}
		}
		*/
	}
	public void editSubscriber(String address,String phone,String email,String ID,String balance,String type){
		
		//bdal da hyb2a nfs el logic lakn  f file
		 /*
		for(Subscribers sub : Subscribers )
		{
			if(sub.ID==id) 
			{
				sub.address=address; sub.name=name; .... etc
			}
		}
		*/
	}
	public void addBorrowingRec(int SubscriberID ,int ContentID,int fee) {
		
	}
	public void removeBorrowingRec() {}
	public void editBorrowingRec(){}


}
