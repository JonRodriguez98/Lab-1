import java.io.Serializable;
import java.util.ArrayList;

public class PlayList implements Serializable {
	
	private String name;
	private ArrayList<Song> playList = new ArrayList<Song>();
	
	
	public PlayList(String name, ArrayList<Song> playList) {
		super();
		this.name = name;
		this.playList = playList;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Song> getPlayList() {
		return playList;
	}
	public void setPlayList(ArrayList<Song> playList) {
		this.playList = playList;
	}
	
	//prints all songs in playlist
	public void songsInPlaylist() {
		
		for(int i = 0; i <= this.playList.size()-1 ; i++) {
			System.out.println(this.playList.get(i).getTitle());	
		}
	}
	
	//loops through arraylist checking if song sent as parameter is present ignoring case.
	public boolean findSong(String song) {

		boolean result = false;

		for (int i = this.playList.size()-1; i >= 0 ; i--) {

			if (song.equalsIgnoreCase(this.playList.get(i).getTitle())) {
				result = true;

			}

			}
		return result;
	}

}
