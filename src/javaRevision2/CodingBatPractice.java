package javaRevision2;

public class CodingBatPractice {

	public static void main(String[] args) {
		
		//Given a string, return a new string where the first and last chars have been exchanged.
		
		CodingBatPractice codingBatPractice = new CodingBatPractice();
		System.out.println(codingBatPractice.frontBack("eodc"));
		System.out.println(codingBatPractice.frontBack("a"));
		System.out.println(codingBatPractice.frontBack("ba"));
		System.out.println(codingBatPractice.frontBack("Hello"));
		
//		String x = "Hello";
//		int index = x.length() - 1;
//		String y = x.substring(index);
//		String z = x.replace(x.substring(index), x.substring(0, 1));
		 
//		System.out.println(index);
//		System.out.println(x.substring(0, 1));
//		System.out.println(x.substring(index));
//		
//		System.out.println(x.replace(x.substring(0, 1), "S"));
//		System.out.println(x.replace(x.substring(0, 1), x.substring(index)));
		
//		System.out.println(x.replace(x.substring(index), x.substring(0, 1)));
//		System.out.println("Z is: " + z);
//		System.out.println(y);
//		System.out.println(x);
//		System.out.println("Final is: " + z.replaceFirst(z.substring(0, 1) , y) );
	}

	public String frontBack(String str) {
		  if (str.length() <= 1) return str;
		  
		  String mid = str.substring(1, str.length()-1);
		  System.out.println("mid is: " + mid);
		  
		  // last + mid + first
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
		}
}
