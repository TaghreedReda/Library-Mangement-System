
public class main {

	public static void main(String[] args) {
		Data  data = Data.getInstance();
		data.fillBorrowing();
		data.FillContent();
		data.fillLibraries();
		data.fillSubscribers();
		
		for (Content c: data.Items) {
			if(c.getCat()=="Book")
				//comboBox.addItem(c.getCat());
			 System.out.println(c.getCat());
			
		}
		
	}

}
