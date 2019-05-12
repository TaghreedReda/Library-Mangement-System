import java.util.ArrayList;


public class Library {

 
	private String name ,address,ID ;
	private ArrayList<Content> libraryContents = new ArrayList<Content>();
	public void setname(String n)
	{
		name = n;
	}
	public void setAddress(String Add)
	{
		address = Add;
		
	}
	public void setID(String id)
	{
		ID = id;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getID()
	{
		return ID;
	}
	public void AddContent(Content c)
	{
		libraryContents.add(c);
	}
	public ArrayList<Content> showContent() {
		return libraryContents;
	}
	
}
