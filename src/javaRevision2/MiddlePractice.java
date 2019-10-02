package javaRevision2;

public class MiddlePractice {
		
	public String middleTwo(String str) {
		/**
		 * Creates a String called middleChars, sets this equal to the 2 middle chars of the String str passed in
		 */
		String middleChars = str.substring((str.length()/2)-1, (str.length()/2)+1);
		
		
		return middleChars;
	}
	
}
