package javaRevision2;

/**
 * @author WAR14101792
 */
import java.util.ArrayList;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * instantiating - creating an object of the class
		 */
		ArrayListPractice2 arrayListPractice2 = new ArrayListPractice2();
		
		/**
		 * assigning the values in the myAnimals ArrayList (in the createAnimals method) to the new ArrayList existingAnimals
		 * creating a new ArrayList existingAnimals and passing values in to it from the ArrayList myAnimals
		 * (which is in the createAnimals method)
		 */
		ArrayList<String> existingAnimals = arrayListPractice2.createAnimals();
		System.out.println(existingAnimals);
		
		/**
		 * creating a new ArrayList addedAnimals and passing values in to it from the ArrayList existingAnimals
		 * after it's been updated in the addAnimals method (aka had Dog and Cat added in)
		 */
		ArrayList<String> addedAnimals = arrayListPractice2.addAnimals(existingAnimals);
		System.out.println(existingAnimals);
		
		/**
		 * creating a new ArrayList removeAnimal and passing values in to it from the ArrayList exstingAnimals
		 * after it's been updated in the removeAnimal method (aka had Elephant removed)
		 */
		ArrayList<String> removeAnimal = arrayListPractice2.removeAnimal(existingAnimals);
		System.out.println(existingAnimals);
		
		/**
		 * creating a new ArrayList removeAnimals and passing values in to it from the ArrayList exstingAnimals
		 * after it's been update in the removeAnimals method (aka had all elements removed)
		 */
		ArrayList<String> removeAnimals = arrayListPractice2.removeAnimals(existingAnimals);
		System.out.println(existingAnimals);
	}

	/**
	 * creates an ArrayList called myAnimals and adds 3 values
	 * @return myAnimals to the ArrayList existingAnimals in main
	 */
	public ArrayList<String> createAnimals() {
		ArrayList<String> myAnimals = new ArrayList<String>();
		myAnimals.add("Elephant");
		myAnimals.add("Rhino");
		myAnimals.add("Lion");
		
		return myAnimals;		
	}
	
	/**
	 * has the existingAnimals (with its 3 values) passed in to this method
	 * @param existingAnimals - then adds 2 new values
	 * @return returns all 5 values to the addedAnimals array - following this method existingAnimals contains the 5 values
	 */
	
	public ArrayList<String> addAnimals(ArrayList<String> existingAnimals) {
		existingAnimals.add("Dog");
		existingAnimals.add("Cat");
		
		return existingAnimals;
	}
	
	/**
	 * @param existingAnimals - has the existingAnimals (with its 5 values) passed in to this method
	 * then removes the value Elephant
	 * @return - returns the 4 remaining values to the removeAnimal ArrayList - following this method existingAnimals contains the 4 remaining values
	 */
	public ArrayList<String> removeAnimal(ArrayList<String> existingAnimals) {
		existingAnimals.remove("Elephant");
		
		return existingAnimals;
	}
	
	/**
	 * @param existingAnimals - has the existingAnimals (with its 4 remaining values) passed in to this method
	 * then removes all the values left
	 * @return -  returns 0 values to the removeAnimals ArrayList - following this method existingAnimals is empty (contains 0 values)
	 */
	public ArrayList<String> removeAnimals(ArrayList<String> existingAnimals) {
		existingAnimals.removeAll(existingAnimals);
		
		return existingAnimals;
	}
}
