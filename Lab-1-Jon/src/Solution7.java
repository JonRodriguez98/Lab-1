import java.util.Scanner;

/*
 * Jon Rodriguez
 * March 22 2022
 * This program divides 2 numbers inputed by user and handles exception.
 */
public class Solution7 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers to be divided");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		try {
		System.out.println(num1 / num2);
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch(RuntimeException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Thank You");
			input.close();
		}
		
	}

}
