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
	
	public String title ,author,Publisher,category;	
	public  int id, libID , ProductionYear ,copies;
	
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

