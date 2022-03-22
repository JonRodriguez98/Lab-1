import java.util.Scanner;

/*
 * Jon Rodriguez
 * March 22 2022
 * This program will ask for a decimal and provide the ceil,floor, and round of the decimal
 *
 */
public class Solution5 {
	public static void main(String[] args) {
		
		double choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will provide you with the ceil, floor and round of a decimal number.\nPlease enter decimal number: ");
		
		choice = input.nextDouble();
		
		System.out.println("The ceil of the decimal is " + Math.ceil(choice) + "\nThe floor of the decimal is " + Math.floor(choice) + "\nThe decimal rounds to " + Math.round(choice));
		
		input.close();
	}

}
