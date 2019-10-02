package javaRevision2;

import java.util.Arrays;

public class Brackets {

	public static boolean balancedBrackets(String str) {
		boolean balanced = false;
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index)=='{') {
				count1++;
			}
			else if(str.charAt(index)=='}') {
				count2++;
			}
			else if(str.charAt(index)=='(') {
				count3++;
			}
			else if(str.charAt(index)==')') {
				count4++;
			}
			else if(str.charAt(index)=='[') {
				count5++;
			}
			else if(str.charAt(index)==']') {
				count6++;
			}
		}
		
		if(count1==count2 && count3==count4 && count5==count6) {
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
			if(((count1>0 && count2>0 && Math.abs(index1-index2)%2==1)
				&& (count3>0 && count4>0 && Math.abs(index3-index4)%2==1 )
				&& (count5>0 && count6>0 && Math.abs(index5-index6)%2==1 ))){
						balanced = true;
			}
		}
		
		return balanced;
	}
	
}
