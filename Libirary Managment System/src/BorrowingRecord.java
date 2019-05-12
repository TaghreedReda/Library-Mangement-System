//import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowingRecord {
    
	static Data dataObj = new Data ();
	private String  ContentID,SubscriberID;
	 private int fee;
	
	private Date returnDate,borrowDate;
	
	
	
	public void setborrowDate (Date b ) {
		b=borrowDate;
	}
    public Date getborrowDate () {
		
	return borrowDate;
	}
    public void setreturnDate (Date b ) {
		b=returnDate;
	}
    public Date getreturnDate () {
		
	return returnDate;
	}
	
	 String getContentID() {
		return ContentID;
	}
	public void setContentID(String contentID) {
		ContentID = contentID;
	}
	
	 String getSubscriberID() {
		return SubscriberID;
	}

	 public void setSubscriberID(String subscriberID) {
		SubscriberID = subscriberID;
	}
	 
    public void calculateFee (String  subscriberID , Date borrowDate,Date returnDate ) throws ParseException {
      	
    	
    	Subscriber subscriber = null ;
    	
    	for(Subscriber sub : Data.Subs )
		{
			if(sub.getID()== subscriberID) 
			{
				if (sub.getType()=="Golden") {
					subscriber = new GoldenSubscriber();
				}
				else 
					subscriber = new RegularSubscriber();
			}
		}
    	
    	 subscriber.CalculateFees(borrowDate, returnDate);
    }
	/**
	 * @return the fee
	 */
	public int getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}
	

}
