import java.sql.Date;
public  abstract class Subscriber
{

	public Date  borrowDate , returnDate ;
	public  int fee , ID , balance;
	protected  Content content;
    public String address,phone, email ;
	private String Password ;
	
	public void borrowContent() 
	{
		
	}
	public void returnContent()  
	{
		
	}
	public int checkBalance() 
	{
		return  balance;
	}
	public abstract String getType();
	
	// for observer pattern
	public abstract void update ();


}
 class GoldenSubscriber extends Subscriber
{

	public GoldenSubscriber ( Content content ) 
	{
		this.content = content;
	      this.content.attach(this);	
	}
	 @Override
	public void borrowContent() 
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

	public RegularSubscriber ( Content content ) 
	{
		this.content = content;
	      this.content.attach(this);	
	}
	 @Override
	public void borrowContent() 
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