package javaRevision2;

import java.util.Arrays;

public class Brackets {

	/**
	 * Method which counts how many there are of each opening bracket and each closing bracket
	 * Sets balanced to true if each type of open bracket has a close (the counts are the same)
	 * Otherwise balanced is set to false
	 * @param String str
	 * @return boolean balanced
	 */
	public static boolean balancedBrackets(String str) {
		boolean balanced = false;
		
		int openCurly = 0;
		int closeCurly = 0;
		int openBrace = 0;
		int closeBrace = 0;
		int openSquare = 0;
		int closeSquare = 0;
		
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index)=='{') {
				openCurly++;
			}
			else if(str.charAt(index)=='}') {
				closeCurly++;
			}
			else if(str.charAt(index)=='(') {
				openBrace++;
			}
			else if(str.charAt(index)==')') {
				closeBrace++;
			}
			else if(str.charAt(index)=='[') {
				openSquare++;
			}
			else if(str.charAt(index)==']') {
				closeSquare++;
			}
		}
		
		if(openCurly==closeCurly && openBrace==closeBrace && openSquare==closeSquare) {
			balanced = true;
		}
		
		
		return balanced;
	}
	
	//for additional case
	public static boolean balancedBrackets2(String str) {
		boolean balanced = false;
		//boolean balanced = true;
		
		int index1 = 0;	int count1 = 0;
		int index2 = 0; int count2 = 0;
		int index3 = 0; int count3 = 0;
		int index4 = 0; int count4 = 0;
		int index5 = 0; int count5 = 0;
		int index6 = 0; int count6 = 0;
		
		char[] charArray = str.toCharArray();
				
		for(int index=0; index<charArray.length; index++) {
			if(charArray[index]=='{'){
				index1 = index;
				count1++;
			}
			else if (charArray[index]=='}'){
				index2 = index;
				count2++;
			}
			else if (charArray[index]=='('){
				index3 = index;
				count3++;
			}
			else if (charArray[index]==')'){
				index4 = index;
				count4++;
			}
			else if (charArray[index]=='['){
				index5 = index;
				count5++;
			}
			else if (charArray[index]==']'){
				index6 = index;
				count6++;
			}
		}
		
		/**
		 * If the counts of opens and corresponding closes are equal move on to next if
		 * If the counts of the open and close for a type of bracket are both greater than zero aka it contains that type of brackets then 
		 * check if the index of the closing bracket minus the index of the opening bracket is odd by checking if modulus 2 is equal to 1
		 * , its 1 aka odd they are in the correct place
		 */
//		if(count1==count2 && count3==count4 && count5==count6) {
//			if(((count1>0 && count2>0 && index2-index1%2==1)
//				&& (count3>0 && count4>0 && index4-index3%2==1 )
//				&& (count5>0 && count6>0 && index6-index5%2==1 ))){
//						balanced = true;
//			}
//		}
		
		System.out.println(index6);
		boolean isBracketClosing = bracketsMatch(count1, count2, count3, count4, count5, count6);
		boolean doCurlyBracketsRightPlace = curlyBracketsRightPlace(count1, count2, index1, index2);
		
		if(isBracketClosing){
			if(((count1==0 && count2==0) || (count1>0 && count2>0  && (index2-index1)%2==1))
				&& ((count3==0 && count4==0) || (count3>0 && count4>0 && (index4-index3)%2==1))
				&& ((count5==0 && count6==0) || (count5>0 && count6>0 && (index6-index5)%2==1))){
			balanced = true;
			}
		}
		
//		WORKS!!!!!
//		if(count1==count2 && count3==count4 && count5==count6) {
//			if(((count1==0 && count2==0) || (count1>0 && count2>0  && (index2-index1)%2==1))
//				&& ((count3==0 && count4==0) || (count3>0 && count4>0 && (index4-index3)%2==1))
//				&& ((count5==0 && count6==0) || (count5>0 && count6>0 && (index6-index5)%2==1))){
//			balanced = true;
//			}
//		}
		
//		if(!(count1==count2 && count3==count4 && count5==count6)) {
//			balanced = false;
//		}
//		else if((count1>0 && count2>0 && index2-index1%2==0)
//				|| (count3>0 && count4>0 && index4-index3%2==0)
//				|| (count5>0 && count6>0 && index6-index5%2==0 )){
//			balanced = false;
//			
//		}
		

		
		return balanced;
	}
	
	public static boolean bracketsMatch(int count1, int count2, int count3, int count4, int count5, int count6) {
		if(count1==count2 && count3==count4 && count5==count6) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean curlyBracketsRightPlace(int count1, int count2, int index1, int index2) {
		if((count1==0 && count2==0) || (count1>0 && count2>0  && (index2-index1)%2==1)) {
			return true;
		}
		else {
			return false;
		}
		
	
	}
}
