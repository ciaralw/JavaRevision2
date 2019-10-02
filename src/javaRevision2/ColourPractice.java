package javaRevision2;

public class ColourPractice {
	
	public String seeColor(String str) {
		
		/**
		 * If the String str passed in starts with "red" then return the String "red"
		 * If the String str passed in starts with "blue" then return the String "blue"
		 * If the String str passed in doesn't start with "red" or "blue" then return an empty String
		 */
		 if(str.length()>2 && (str.substring(0,3).equals("red"))){
			    return "red";
			  }
			  else if(str.length()>3 && (str.substring(0, 4).equals("blue"))){
			    return "blue";
			  }
			  else{
			    return "";
			  }
	}
}
