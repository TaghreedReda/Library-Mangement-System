import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Data {
	
	public static  ArrayList<Library> libraries = new ArrayList<Library>();
	public static   ArrayList<Content> Items = new ArrayList<Content>();
	public static  ArrayList<Subscriber> Subs = new ArrayList<Subscriber>();
	public static  ArrayList<BorrowingRecord> BorrowedContents = new ArrayList<BorrowingRecord>();
	private  ContentFactory CF = new ContentFactory();
	private Scanner x;
	
	void fillLibraries()
	{
		try {
			x = new Scanner(new File("library.txt"));
			x.useDelimiter(",");
			while(x.hasNext())
			{
				String id = x.next();
				String name = x.next();
				String address = x.next();
				Library lib = new Library();
				lib.setID(id);
				lib.setname(name);
				lib.setAddress(address);
				libraries.add(lib);
				}
			}
		catch(Exception e) {
		}
	}
	public void FillContent()
	{
		try {
			x = new Scanner(new File("items.txt"));
			x.useDelimiter(",");
			while(x.hasNext())
			{
				String id = x.next();
				String LibID = x.next();
				String category = x.next();
				String Tittle = x.next();
				String Author = x.next();
				String Publisher = x.next();
				String PYear = x.next();
				String Status = x.next();
				String Copies = x.next();
				Content c = CF.getContent(category);
				c.setID(id);
				c.setlibID(LibID);
				c.SetCat(category);
				c.setTitle(Tittle);
				c.setAuthor(Author);
				c.setPub(Publisher);
				c.SetPYear(PYear);
				if(Status =="OnShelf")
				{
					c.setState(new OnShelf());
				}
				else
				{
					c.setState(new Borrowed());
				}
				c.setCopies(Integer.parseInt(Copies));
				Items.add(c);
			}
		}
		catch(Exception e) {
			}
		for(int i =0 ; i<Items.size() ; i++)
		{
			for (int j =0 ; j<libraries.size() ; j++)
			{
				if(Items.get(i).getLibID()==libraries.get(j).getID())
				{
					libraries.get(j).AddContent(Items.get(i));
					break;
				}
			}
		}
	}
	public void fillSubscribers()
	{
		try {
		x = new Scanner(new File("subscribers.txt"));
		x.useDelimiter(",");
		while(x.hasNext())
		{
			String id = x.next();
			String type = x.next();
			String name = x.next();
			String phone = x.next();
			String email = x.next();
			String address = x.next();
			String notify = x.next();
			Subscriber s ;
			if(type == "Golden")
			{
				s = new GoldenSubscriber();
			}
			else
			{
				s = new RegularSubscriber();
			}
			s.setID(id);
			s.setName(name);
			s.setPhone(phone);
			s.setEmail(email);
			s.setAddress(address);
			Subs.add(s);
			String[] Notifcation = notify.split(" "); 
					
		}
	}
	catch(Exception e) {
		}
	}
	public void fillBorrowing()
	{
		
	}
	
	void UpdateSubscriber() throws IOException
	{
		try {
			// append = false
			FileWriter fw =new FileWriter("C:/Users/pc/eclipse-workspace/Libirary Managment System/subscribers.txt", false);
			for(Subscriber s : Subs)
			{fw.write(s.getID() + ",");
			
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		


	}
}


