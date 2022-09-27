package Documents;

import javax.swing.Spring;

public abstract class Doc {
	
	protected int[] ID;
	protected String[] Title;
	protected String[] Author;
	protected String[] Publisher ;
	protected String[] Topic;
	protected String[] Copy;
	protected String[] Status;
	
	public void SortingAlgorithm(int[] _ID) {
		this.setID(_ID);
	}
	
	public int[] getID() {
		return ID;
	}
	
	public void setID(int[] id) {
		this.ID = id;
	}
	
	public void SortingAlgorithm1(String[] _Title) {
		this.setTitle(_Title);
	}
	
	public String[] getTitle() {
		return Title;
	}
	
	public void setTitle(String[] title) {
		this.Title = title;
	}
	
	public void SortingAlgorithm2(String[] _Author) {
		this.setAuthor(_Author);
	}
	
	public String[] getAuthor() {
		return Author;
	}
	
	public void setAuthor(String[] author) {
		this.Author = author;
	}
	
	public void SortingAlgorithm3(String[] _Publisher) {
		this.setPublisher(_Publisher);
	}
	
	public String[] getPublisher() {
		return Publisher;
	}
	
	public void setPublisher(String[] publisher) {
		this.Publisher =publisher;
	}
	
	public void SortingAlgorithm4(String[] _Topic) {
		this.setTopic(_Topic);
	}
	
	public String[] getTopic() {
		return Topic;
	}
	
	public void setTopic(String[] topic) {
		this.Topic = topic;
	}
	
	public void SortingAlgorithm5(String[] _Copy) {
		this.setCopy(_Copy);
	}
	
	public String[] getCopy() {
		return Copy;
	}
	
	public void setCopy(String[] copy) {
		this.Copy = copy;
	}
	
	public void SortingAlgorithm6(String[] _Status) {
		this.setStatus(_Status);
	}
	
	public String[] getStatus() {
		return Status;
	}
	
	public void setStatus(String[] status) {
		this.Status = status;
	}
	
}
