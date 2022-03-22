/*
 * Jon Rodriguez
 * March 22 2022
 * This Program will reverse the String written
 */
public class Solution1 {
	

	public static void main(String[] args) {
		
		String original = "The first program everyone writes is Hello World";
		String[] originalArray = original.split(" ");
		String reversed = "";
		
		for(int i = originalArray.length-1; i>=0 ; i--) {
			
			reversed += originalArray[i] + " ";
		}
	
		System.out.println(reversed);
	
	}

}
