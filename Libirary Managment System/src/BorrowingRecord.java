import java.sql.Date;

public class BorrowingRecord {
	public String SubscriberID ,ContentID;
	int fee;
	public Date borrowDate ,returnDate;
	
    public int calculateFee () {
    	
    	return fee;
    }

}
