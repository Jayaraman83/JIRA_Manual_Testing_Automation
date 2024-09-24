package codingAssessment;

public class ReversalOfString {

	public void reverseString(String strName) {

		String name = strName;   //Jayaraman
		
		System.out.println("Given string is : " +name);
		
		System.out.println("Reversed String is : " );

		
		int strLength = name.length();
		
		char[] splitString = name.toCharArray();
								
		for(int i = strLength-1; i>=0; i--) {
			
			System.out.print(splitString[i]);
		}
	}
	
	public static void main(String[] args) {
		
		ReversalOfString ros = new ReversalOfString();
		ros.reverseString("TESLA");

		
	}

}
