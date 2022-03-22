import java.util.ArrayList;
import java.util.Scanner;

/*
 * Jon Rodriguez
 * March 22 2022
 * Adds list of states you have visited, converts it to lowercase list and checks/eliminates dupes.
 */
public class Solution6 {
	
	public static void main(String[] args) {

		String choice;

		Scanner input = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();

		System.out.println("Enter the states you have visited. When you're done, enter 'exit'.");
		while (true) {

			System.out.println("Enter State:");
			choice = input.nextLine().toLowerCase();
			
			if (choice.equals("exit")) {
				break;
			}
			
			if(!list.contains(choice)) {
			list.add(choice);
			}

		}
		
		System.out.println("The states you have visited are:\n" + list);

		input.close();
	}
}

