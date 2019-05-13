import java.util.ArrayList;
import java.util.List;

class ContentFactory {

	public Content getContent (String contentType) {
		 if(contentType == "Book")
		 {
	         return new Book ();
	      }
		 else if(contentType == "Journal")
		 {
	         return new Journal();
	      }
		 else if(contentType == "Digital Media")
		 {
	         return new Digital_Media() ;
	      }
		 else
			 return null;
	}

}
abstract class Content {
	private  State state ;
	private List<Subscriber> Subscribers = new ArrayList<Subscriber>();
	
	private String title ,author,Publisher,category,id, libID , ProductionYear;
	private  int  copies;
	public void setTitle(String t)
	{
		title = t;
	}
	public String getTitle()
	{
		return title;
	}
	public void setAuthor(String a)
	{
		author = a;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setPub(String Pub)
	{
		Publisher = Pub;
	}
	public String getPub()
	{
		return Publisher;
	}
	public void SetCat(String Cat)
	{
		category = Cat;
	}
	public String getCat()
	{
		return category;
	}
	public void setID(String Id)
	{
		id =Id;
	}
	public String getID()
	{
		return id;
	}
	public void setlibID(String LibID)
	{
		libID = LibID;
	}
	public String getLibID()
	{
		return libID;
	}
	public void SetPYear (String Pyear)
	{
		ProductionYear = Pyear;
	}
	public String getPyear()
	{
		return ProductionYear;
	}
	public void setCopies (int C)
	{
		copies = C;
	}
	public int getCopies()
	{
		return copies;
	}
	public String getScopies() {
		String Scopies = String.valueOf(getCopies());
    	return Scopies;
	}
	//for state pattern
	public   Content () {
		state = null;
	}
	public State getState () { 
		
		return state;
	}
	
	public void setState (State state) 
	{
		this.state = state;
		if (state.toString()=="OnShelf")
		{
		notifyAllSubscribers();
		}
	}
	//for observer pattern
	public  void attach(Subscriber subscriber)
	{
		Subscribers.add(subscriber);
	}
	
	public  void notifyAllSubscribers() { }
	//public  void removeSubscriber(Subscriber subscriber) {	}
}

class Journal extends Content {
	public  Journal () {	}
	
	
	
	//for observer pattern
	@Override 
	public  void attach(Subscriber subscriber) { }
	
	@Override 
	public  void notifyAllSubscribers() { }
}

class Digital_Media extends Content {
	public  Digital_Media() {	}
	
	//for observer pattern
	@Override 
	public  void attach(Subscriber subscriber) { }
	
	@Override 
	public  void notifyAllSubscribers() { }
}

class Book extends Content {
	public  Book () {	}	
	//for observer pattern
	@Override 
	public  void attach(Subscriber subscriber) { }
	
	@Override 
	public  void notifyAllSubscribers() { }
}

