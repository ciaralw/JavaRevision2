package javaRevision2;

/**
 * @author WAR14101792
 */

public class SomeStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeStringPractice someStringPractice = new SomeStringPractice();
		System.out.println(someStringPractice.everyNth("Miracle", 2));
		System.out.println(someStringPractice.everyNth("abcdefg", 2));
		System.out.println(someStringPractice.everyNth("abcdefg", 3));
	}
	
	/**
	 * Method which loops through the word passed in
	 * Creates String newWord and sets it equal to the 1st char of word and then every N char of wprd
	 * @param word 
	 * @param N 
	 * @return newWord
	 */
	public String everyNth (String word, int N) {
		String newWord = "";
		
		for (int index = 0; index < word.length(); index+=N) {
			
			newWord += word.charAt(index);
			
		}
				
		return newWord;
	}

}
