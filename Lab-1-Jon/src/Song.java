import java.io.Serializable;

public class Song implements Serializable{
	
	private String title;
	private int duration;
	
	
	
	public Song(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	

}
