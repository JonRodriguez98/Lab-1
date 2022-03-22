import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Solution8 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			
			// file location
			File file = new File(
					"C:\\Users\\JonRodriguez-Castill\\OneDrive - Xpanxion\\Desktop\\the_prince_quotes.txt");
			
			// creating the reader
			BufferedReader fr = new BufferedReader(new FileReader(file));

			// String with the current line
			String fileTextReading = fr.readLine();

			// String that will be taking the lines being read
			String fileTextWriting = "";

			// while loop continues adding the read lines to fileTextWriting until there are
			// no lines left.
			while (fileTextReading != null) {

				fileTextWriting += fileTextReading.toLowerCase();
				fileTextReading = fr.readLine();
			}

			// created a hashmap
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			// created a string array splitting the words by spaces from the file
			String[] wordSplit = fileTextWriting.split(" ");

			
			for (int i = 0; i <= wordSplit.length - 1; i++) {
				// counter always starts at 1
				int counter = 1;

				// Checks if map already contains the key in it
				if (map.containsKey(wordSplit[i])) {

					// if it does it assigns the counter to the value of that key
					counter = map.get(wordSplit[i]);

					// finally assigns the key's value to the current counter of that key + 1
					map.put(wordSplit[i], counter + 1);
				}

				// if key isn't present add the key and add the value of 1
				else {
					map.put(wordSplit[i], counter);
				}
			}

			// prints current map
			System.out.println(map);

			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
