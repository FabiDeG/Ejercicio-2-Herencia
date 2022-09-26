package Documents;

public class Magazine extends Doc{

	public Magazine(int[] _ID, String[] _Title, String[] _Topic, String[] _Copy, String[] _Status){
		super();
		this.setID(_ID);
		this.setTitle(_Title);
		this.setTopic(_Topic);
		this.setCopy(_Copy);
		this.setStatus(_Status);
	}
		
	private int NumberR;
	
	public double getNumberR() {
		return NumberR;
	}
	
	public void setNumberR(int NumberR) {
		this.NumberR = NumberR;
	}
	
	private String DateFormat;

	public String getDateFormat() {
		return DateFormat;
	}
	
	public void setDateFormat(String DateFormat) {
		this.DateFormat = DateFormat;
	}
}
