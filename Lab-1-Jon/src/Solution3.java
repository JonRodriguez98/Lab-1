/*
 * Jon Rodriguez
 * March 22 2022
 * Program with a counter, forever loops and break/continue statements.
 */
public class Solution3 {
	public static void main(String[] args) {
		
		int counter = 0;
		
		while(true) {
			counter++;

			if(counter==3) {
				continue;
			}
			
			if(counter==5) {
				break;
			}
			
			System.out.println(counter);
		}
	}

}
