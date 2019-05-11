//import java.sql.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowingRecord {
    
	Subscriber subscriber ;
	public String  ContentID,SubscriberID;
	int fee;
	public Date borrowDate ,returnDate;
	String Borrow_Date,Return_Date;
	
	// public int calculateFee (String subID , String Borrow_Date, String Return_Date)
    public void calculateFee (String  subscriberID) 
    {
    	//haydwar fl file 3al id w ygeeb el type wl borrow date wl return date as strings 
    	
    	// hna h2ra el dates as strings mn el files w a7otha fl strings ely 3ndy dol 
    	
    
    	//this.borrowDate= new SimpleDateFormat("dd/MM/yyyy").parse(Borrow_Date);
    //	this.returnDate= new SimpleDateFormat("dd/MM/yyyy").parse(Return_Date);
    	
    	long diff = this.returnDate.getTime()- this.borrowDate.getTime();
    	
    	long diffDays = diff / (24 * 60 * 60 * 1000);
        
    	if (subscriber.getType()=="Golden") {
    		if (diffDays>90) {
    			this.fee=30;
    			subscriber.fee+=30;
    		}
    	}
    	else if (subscriber.getType()=="Regular") {
    		if (diffDays>21) {
    			this.fee=50;
    			subscriber.fee+=50;
    		}
    	}	
    }
}
