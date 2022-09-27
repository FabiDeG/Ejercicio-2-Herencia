package Documents;

public class Article extends Doc{

	public Article(int[] _ID, String[] _Title, String[] _Author, String[] _Topic, String[] _Copy, String[] _Status){
		super();
		this.setID(_ID);
		this.setTitle(_Title);
		this.setAuthor(_Author);
		this.setTopic(_Topic);
		this.setCopy(_Copy);
		this.setStatus(_Status);
	}
	
	private String Referee;
	
	public String getReferee() {
		return Referee;
	}
	
	public void setReferee(String referee) {
		this.Referee = referee;
	}
}
