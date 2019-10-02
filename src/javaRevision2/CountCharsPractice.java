package javaRevision2;

/**
 * @author WAR14101792
 */

public class CountCharsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountCharsPractice countCharsPractice = new CountCharsPractice();
//		System.out.println(countCharsPractice.countXX("abcxx"));
//		System.out.println(countCharsPractice.countXX("xxx"));
//		System.out.println(countCharsPractice.countXX("xxxx"));
		
		/**
		 * values passed from the if statement into the countXX method to get their length
		 * if the values passed in are all equal to the numbers specified print correct, else print wrong 
		 */
		if((countCharsPractice.countXX("abcxx") == 5) && ((countCharsPractice.countXX("xxx")) == 3) && ((countCharsPractice.countXX("xxxx")) == 4)){
			System.out.println("Correct");
		}
		else{
			System.out.println("Wrong");
		}
	}

	/**
	 * 
	 * @param word - values are passed in from the above if statement
	 * @return - the length of the value passed in are returned to the if statement 
	 */
	public int countXX(String word) {
		return word.length();
	}
	
	
}
