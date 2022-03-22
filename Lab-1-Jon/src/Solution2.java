import java.util.Scanner;
/*
 * Jon Rodriguez
 * March 22 2022
 * This program will check if a year entered by user is a leap year
 */
public class Solution2 {
	
	public static boolean isLeapYear(int a) {
		
		if(a%4==0 && a%100!=0 || a%400==0) {
			return true;
		}
		
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("This program will check if the current year is a leap year.\nPlease enter Year:");
		choice = input.nextInt();
		
		System.out.println("The year entered is a leap year: " + isLeapYear(choice));
		
		input.close();
	}
	

}
