import java.util.ArrayList;
import java.util.List;

public class Admin {

	public String Username;
	private String Password ;
	
    ContentFactory contentFactory = new ContentFactory();
    Content content;
    private List<Library> libraries = new ArrayList<Library>();
    
	public void addContent(String type,String title ,String author, String Publisher,String category,int libID ,int ProductionYear ,int copies) 
	{
		if (type=="Book")
		{
			 content = contentFactory.getContent("Book");
		}
		else if (type == "Journal") 
		{
			 content = contentFactory.getContent("Journal");
		}
		else if (type == "Digital Media")
		{
			 content = contentFactory.getContent("Digital Media");
		}
		content.author=author; content.category=category; content.title=title;
		content.Publisher=Publisher; content.libID=libID; content.ProductionYear=ProductionYear;
		content.copies=copies;
		
		for(Library lib : libraries)
		{
			if(lib.ID==content.libID) 
			{
				lib.libraryContents.add(content);
			}
		}
		
		// hy3ml add fl file hna
	}
	public void editContent()
	{
		//lsa msh 3arfa ha edit eh bzbt
	}
	
	public  void removeContent(int libID , int contentID) 
	{
		
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
		}
		
		// hysheelo mn el file hna
	}
	
	public void addLibrary(int id , String name , String address) 
	{
		Library library=new Library();
		library.address=address; library.name=name; library.ID=id;
		libraries.add(library);
		
		//hktbo fl file hna
	}
	
	public void removeLibrary(int id) 
	{
		for(Library lib : libraries)
		{
			if(lib.ID==id) 
			{
				libraries.remove(lib);
			}
		}
	}
	public void editLibrary(){}
	
	public void addSubscriber() {}
	public void removeSubscriber() {}
	public void editSubscriber(){}


}
