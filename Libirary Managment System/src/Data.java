import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

//singelton
public class Data {
	
	 private static Data instance = new Data();
	
	 private Data(){};
	 public static Data getInstance(){
	      return instance;
	   }
	public  ArrayList<Library> libraries = new ArrayList<Library>();
	public  ArrayList<Content> Items = new ArrayList<Content>();
	public  ArrayList<Subscriber> Subs = new ArrayList<Subscriber>();
	public  ArrayList<BorrowingRecord> BorrowedContents = new ArrayList<BorrowingRecord>();
	private ContentFactory CF = new ContentFactory();
	private Scanner x;
	
	public void fillLibraries()
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
		x.close();
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

		x.close();
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
			String Pass = x.next();
			String phone = x.next();
			String email = x.next();
			String address = x.next();
			String fee = x.next();
			String balance = x.next();
			String ItemID = x.next();
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
			s.setPassword(Pass);
			s.setCurrentContent(ItemID);
			s.setName(name);
			s.setPhone(phone);
			s.setEmail(email);
			s.setAddress(address);
			s.setFee(Integer.parseInt(fee));
			s.setBalance(Integer.parseInt(balance));
			s.setNotifications(notify.split("\\s"));
			Subs.add(s);
		}
	}
	catch(Exception e) {
		}
		x.close();
	}
	public void fillBorrowing()
	{
		try {
		x = new Scanner(new File("borrowing.txt"));
		x.useDelimiter(",");
		while(x.hasNext())
		{
			String Subid = x.next();
			String ContID = x.next();
			String fee = x.next();
			String returnDate = x.next();
			String borrowDate = x.next();
			BorrowingRecord Br = new BorrowingRecord();
			Br.setSubscriberID(Subid);
			Br.setContentID(ContID);
			Br.setFee(Integer.parseInt(fee));
			Date dateR=new SimpleDateFormat("dd/MM/yyyy").parse(returnDate);
			Date dateB=new SimpleDateFormat("dd/MM/yyyy").parse(borrowDate);
			Br.setreturnDate(dateR);
			Br.setborrowDate(dateB);
			BorrowedContents.add(Br);
		}
	}
	catch(Exception e){
	}
	x.close();
}
public void WriteLibraries()
	{
		Formatter x ;
		try {
			 x = new Formatter("library.txt");
			for(int i =0 ; i<libraries.size() ;i++)
			{
				x.format("%s%s%s", libraries.get(i).getID()+",",libraries.get(i).getName()+"," , libraries.get(i).getAddress());
			}
			x.close();
		}
		catch(Exception e) {
		}
		
	}
	public void WriteContent()
	{
		Formatter x ;
		try {
			 x = new Formatter("items.txt");
			for(int i =0 ; i<Items.size() ;i++)
			{
				x.format("%s%s%s%s%s%s%s%s%s",Items.get(i).getID()+",",Items.get(i).getLibID()+",",Items.get(i).getCat()+",",
				Items.get(i).getTitle()+",",Items.get(i).getAuthor()+",",Items.get(i).getPub()+",",Items.get(i).getPyear()+",",
				
				Items.get(i).getState().toString()+",",Items.get(i).getScopies());
			}
			x.close();
		}
		catch(Exception e) {
		}
		
	}
	public void WriteSubscribers()
	{
		Formatter x ;
		try {
			 x = new Formatter("subscribers.txt");
			for(int i =0 ; i<Subs.size() ;i++)
			{
				String s ="";
				for(int j = 0 ; j<Subs.get(i).getNotifications().length ; i++)
				{
					s+=Subs.get(i).Notifications[j]+" ";
				}
				x.format("%s%s%s%s%s%s%s%s%s%s%s",Subs.get(i).getID()+",",Subs.get(i).getType()+",",Subs.get(i).getName()+",",
				Subs.get(i).getPassword()+",",Subs.get(i).getPhone()+",",Subs.get(i).getEmail()+",",Subs.get(i).getAddress()+",",
				Subs.get(i).getSfee()+",",Subs.get(i).getSbalance()+","+Subs.get(i).getCurrentContent()+",",s);
			}
			x.close();
		}
		catch(Exception e) {
		}
		
	}
	public void WriteBorrowing()
	{
		Formatter x ;
		try {
			 x = new Formatter("borrowing.txt");
			for(int i =0 ; i<BorrowedContents.size() ;i++)
			{
				x.format("%s%s%s%s%s", BorrowedContents.get(i).getSubscriberID()+",",BorrowedContents.get(i).getContentID()+"," ,
				 BorrowedContents.get(i).getSfee()+",",BorrowedContents.get(i).getreturnDate().toString()+",",
				 BorrowedContents.get(i).getborrowDate().toString());
			}
			x.close();
		}
		catch(Exception e) {
		}
		
	}
}


