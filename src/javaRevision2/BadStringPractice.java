package javaRevision2;

public class BadStringPractice {

	public boolean hasBad(String str) {
		boolean result = false;
		
		/**
		 * if the String str passed in has "bad" at the start of it or starting at the second letter result is true
		 * @return boolean result
		 */
		if(str.substring(0, 3).equals("bad")) {
			result = true;	
		}
		else if(str.substring(1, 4).equals("bad")) {
			result = true;
		}
		
		return result;
	}
	
}
