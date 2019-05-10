
public interface State {
	public void doAction(Content context);
	public String toString();
}
class OnShelf implements State {
	
	public void doAction(Content context) {
	    //  System.out.println("Content is in OnShelf");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "OnShelf";
	   }
}

class Borrowed implements State {
	public void doAction(Content context) {
	     // System.out.println("Content is Borrowed");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Borrowed";
	   }
}