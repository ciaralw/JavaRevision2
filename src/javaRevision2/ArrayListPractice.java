package javaRevision2;

//Javadoc author comments at start of each page/code segment (personal preference)
/**
 * @author WAR14101792
 */

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListPractice arrayListPractice = new ArrayListPractice();
		System.out.println(arrayListPractice.containsString());
		System.out.println(arrayListPractice.removeString());
	}
	
	public void addStringToArrayList() {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Good");
		myArrayList.add("Morning");
		System.out.println("Size of array: " + myArrayList.size());
		
		/**
		 * for each loop to loop through ArrayList myArrayList and print the elements contained in myArrayList
		 */
		for(String item: myArrayList) {
			System.out.println(item);
		}
		
		/**
		 * for loop to loop through ArrayList myArrayList and print the elements contained in myArrayList
		 * does the same as the above for each
		 */
		for(int index = 0; index < myArrayList.size(); index++) {
			String item = myArrayList.get(index);
			System.out.println(item);
		}
	
	}
	
	/**
	 * creates an ArrayList called myArrayList
	 * adds the values good and morning to the ArrayList
	 * @return returns true if the value good is in the ArrayList, false if not
	 */
	public boolean containsString() {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Good");
		myArrayList.add("Morning");
		
		return myArrayList.contains("Good");
	}

	/**
	 * creates an ArrayList called myArrayList
	 * adds the values good and morning to the ArrayList
	 * removes the value good from the ArrayList
	 * @return returns true if the value good is in the ArrayList, false if not
	 */
	public boolean removeString() {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Good");
		myArrayList.add("Morning");
		
		myArrayList.remove("Good");
		return myArrayList.contains("Good");
	}
}
