package javaRevision2;

/**
 * @author WAR14101792
 */

import java.util.ArrayList;

public class ReturnPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnPractice returnPractice = new ReturnPractice();
		System.out.println(returnPractice.returnInt());
		System.out.println(returnPractice.returnString());		
		System.out.println(returnPractice.returnSum(5,2));	
		System.out.println(returnPractice.returnArray("Hi","There"));	
	}

	/**
	 * @return int 42
	 */
	public int returnInt() {
		return 42;
	}
	
	/**
	 * @return String "Hello World"
	 */
	public String returnString() {
		return "Hello World";
	}
	
	/**
	 * Method which takes 2 ints and returns their sum
	 * @param value1
	 * @param value2
	 * @return sum of the 2 parameter values passed in
	 */
	public int returnSum(int value1, int value2) {
		//int sum = value1 + value2;
		//return sum;
		return value1 + value2;
	}
	
	/**
	 * Method which takes 2 Strings, adds these both as elements of a new ArrayList and return that ArrayList
	 * @param string1
	 * @param string2
	 * @return ArrayList myString
	 */
	public ArrayList<String> returnArray(String string1, String string2) {
		ArrayList<String> myString = new ArrayList<String>();
			myString.add(string1);
			myString.add(string2);	
			
		return myString;		
	}
}
