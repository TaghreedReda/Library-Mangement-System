//import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowingRecord {
    
	Data  data = Data.getInstance();
	private String  ContentID,SubscriberID;
	 private int fee;
	
	private Date returnDate,borrowDate;
	
	
public String getSfee() {
    	
    	String Sfee = String.valueOf(getFee());
    	return Sfee;
    }
	public void setborrowDate (Date  b ) {
	borrowDate=b;
	}
    public Date getborrowDate () {
		
	return borrowDate;
	}
    public void setreturnDate (Date a ) {
    	returnDate=a;
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
    	
    	for(Subscriber sub : data.Subs )
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
