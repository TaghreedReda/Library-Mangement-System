import java.sql.Date;
public  abstract class Subscriber
{

	public  int fee , balance;
	protected  Content content;
    public String address,phone, email,ID ;
	//private String Password ;
	
	public void browse() {
		
	}
	public  void borrowContent(int id) {
		
	}
	
	public void returnContent() {
		
	}
	
	public int checkBalance() 
	{
		return  balance;
	}
	public abstract String getType();
	
	// for observer pattern
	public void update () {
		
	}
}
 class GoldenSubscriber extends Subscriber
{
   public GoldenSubscriber() {
	   
   }
	 
	public GoldenSubscriber ( Content content ) 
	{
		this.content = content;
	      this.content.attach(this);	
	}
	 @Override
	public void borrowContent(int id) 
	{
		
	}
	 @Override
	public void returnContent()  
	{
		
	}
	 @Override
	public int checkBalance() 
	{
		return  balance;
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
}
 class RegularSubscriber extends Subscriber
{
	public RegularSubscriber(){
		 
	 }

	public RegularSubscriber ( Content content ) 
	{
		this.content = content;
	      this.content.attach(this);	
	}
	 @Override
	public void borrowContent(int id) 
	{
		
	}
	 @Override
	public void returnContent()  
	{
		
	}
	 @Override
	public int checkBalance() 
	{
		return  balance;
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
}