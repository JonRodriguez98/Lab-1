import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//array list of song class instances
		ArrayList<Song> favSongs = new ArrayList<Song>();
		
		//instance of Playlist class sending the title of the playlist and the ArrayList of Song Objects
		PlayList mySongs = new PlayList("Favorite Songs", favSongs );
		
		//creating song objects
		Song song1 = new Song("Billie Jean", 5);
		Song song2 =new Song("Sweet Child O'Mine", 5);
		Song song3 = new Song("Stayin Alive", 4);
		
		//adding song objects to Array List
		favSongs.add(song1);
		favSongs.add(song2);
		favSongs.add(song3);
		
		//Prints all Songs
		mySongs.songsInPlaylist();
		
		//checks if song written is within the playlist
		System.out.println(mySongs.findSong("SwEeT CHILD o'MiNE"));
		
		//location file to be written
		File file = new File ("C:\\Users\\JonRodriguez-Castill\\OneDrive - Xpanxion\\Desktop\\PlayList.txt");
		try {
		FileOutputStream fr = new FileOutputStream(file);
		ObjectOutputStream ofr = new ObjectOutputStream(fr);
		
		//writing the playlist object onto an object file
		ofr.writeObject(mySongs);
		
		fr.close();
		ofr.close();
		}
		
		catch(IOException e) {
			System.out.println(e);
		}


		
	}

}
