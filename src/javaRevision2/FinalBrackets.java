package javaRevision2;

public class FinalBrackets {
	
 public static boolean balancedBrackets2(String str) {
	 boolean result = false;
	 int count = 0;
	 String bracketsString = "";
	 
	 for(int index=0; index<str.length(); index++) {
		 if(str.charAt(index) == '(' || str.charAt(index) == ')'
			|| str.charAt(index) == '{' || str.charAt(index) == '}'
			|| str.charAt(index) == '[' || str.charAt(index) == ']'
			|| str.charAt(index) == '<' || str.charAt(index) == '>') {
		bracketsString = bracketsString + str.charAt(index);
		 }
	//System.out.println(bracketsString);
	 }
	 
	 while(bracketsString.length()>0) {
		 int indexCloseBrace = bracketsString.indexOf(')');
		 int indexCloseCurly = bracketsString.indexOf('}');
		 int indexCloseSquare = bracketsString.indexOf(']');
		 int indexCloseAngle = bracketsString.indexOf('>');
		 
		// System.out.println(indexCloseCurly);
		 
		 if(indexCloseBrace==-1) {
			 indexCloseBrace = bracketsString.length();
		 }
		 if(indexCloseCurly==-1) {
			 indexCloseCurly = bracketsString.length();
		 }
		 if(indexCloseSquare==-1) {
			 indexCloseSquare = bracketsString.length();
		 }
		 if(indexCloseAngle==-1) {
			 indexCloseAngle = bracketsString.length();
		 }
		 
		// System.out.println(indexCloseCurly);
		 
		 int indexFirstClose = Math.min(indexCloseBrace, Math.min(indexCloseCurly, Math.min(indexCloseSquare, indexCloseAngle)));
		 
		 if(indexFirstClose>0 && indexFirstClose<bracketsString.length()) {
			 if(bracketsString.charAt(indexFirstClose-1) == expectedOpenBracket(bracketsString.charAt(indexFirstClose))) {
				 count++;
				 
				 bracketsString = bracketsString.substring(beginIndex)
			 }
		 }
		 else {
			 count = -1;
			 break;
		 }
		 
	 }
	 
	 return result;
 }
 
 	public static char expectedOpenBracket(char indexFirstClose) {
 		if (indexFirstClose = ')') {
 			return '(';
 		}
 		if (indexFirstClose = '}') {
 			return '{';
 		}
 		if (indexFirstClose = ']') {
 			return '[';
 		}
 		if (indexFirstClose = '>') {
 			return '<';
 		}
 	}

}
