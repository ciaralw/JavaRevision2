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
		
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;
		int index5 = 0;
		int index6 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
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
		
		if(count1==count2 && count3==count4 && count5==count6) {
			if(((count1>0 && count2>0 && index2-index1%2==1)
				&& (count3>0 && count4>0 && index4-index3%2==1 )
				&& (count5>0 && count6>0 && index6-index5%2==1 ))){
						balanced = true;
			}
		}
		
		return balanced;
	}
	
}
