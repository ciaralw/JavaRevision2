package javaRevision2;


//missing javadoc 
public class PalindromePractice {

	public boolean isPalindrome(String str){
		boolean result = true;
		
		int start = 0;
		int end = str.length()-1;
		
		/**
		 * Using a while loop
		 * Loops through the String str passed in and if the char at index from start is not equal to the char at index from the end then result is set to false
		 */
		while(start<end) {
			if(str.toLowerCase().charAt(start) != str.toLowerCase().charAt(end)) {
			result = false;
			break;
			}
			start++;
			end--;
		}
		
		return result;
	}
	
//add a 2 to the method name in the JUnit test to test this one
	/**
	 * Using a for loop
	 * Loops through the String str passed in and if the char at index from start is not equal to the char at index from the end then result is set to false
	 */
	public boolean isPalindrome2(String str){
		boolean result = true;
		int end = str.length()-1;
		
		for(int start = 0; start<end ; start++) {
			if(str.toLowerCase().charAt(start) != str.toLowerCase().charAt(end)) {
			result = false;
			break;
			}
			end--;
		}

		return result;
	
	}
	
}