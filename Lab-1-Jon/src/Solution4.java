/*
 * Jon Rodriguez
 * March 22 2022
 * Write a program to initialize an array of 5 float numbers. 
 * Loop through the array using a for loop and print each number.
 */
public class Solution4 {
	
	public static void main(String[] args) {
		
		Float[] list = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
		
		for(int i = 0; i<=list.length-1;i++) {
			System.out.println(list[i]);
		}
		
	}

}
