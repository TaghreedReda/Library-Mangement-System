import java.sql.Date;
public  abstract class Subscriber
{
	BorrowingRecord borrowingRecord;
	public  int fee , balance;
	protected  Content content;
    public String address,phone, email,ID ;
    
	//private String Password ;
	
	public void browse() {
		
	}
	public  void borrowContent(String id , String borrowingDate) {
		 borrowingRecord = new BorrowingRecord ();
	 borrowingRecord.ContentID=id;
	 borrowingRecord.SubscriberID=this.ID;
	 borrowingRecord.Borrow_Date=borrowingDate;
	 
	}
	
	public void returnContent(String id , String returnDate) {
		//hydwar bl id fl file w yndh calculate fees w y-set el fee bta3t 
		//elborrowing rec ly bnfs id el cont w id el customer
		// w yn2s mn el balance
	}
	
	public int checkBalance() 
	{
		return  balance;
	}
	public abstract String getType();
	public abstract void calculateFee ();
	
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
	
	public  void calculateFees (){
		 
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
public  void calculateFee () {
		 
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
	 public  void calculateFee () {
		 
	 }
}