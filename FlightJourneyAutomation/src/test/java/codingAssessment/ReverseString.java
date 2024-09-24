package codingAssessment;

import java.util.Scanner;

public class ReverseString {
	
	String str;
	StringBuilder strReverse;
	String reversedString;

	public void reverseString() {

	Scanner sc = new Scanner(System.in);
	System.out.println("Input String value pls : ");
	str = sc.nextLine();
	
	strReverse = new StringBuilder(str).reverse();
	reversedString = strReverse.toString();
	System.out.println("Entered String is: " +str);
	System.out.println("Reversed String is: " +strReverse);

	}
	
	public void isPalindrome() {
		if(str.equals(reversedString)){
			System.out.println("Entered string is a Palindrome");
		}else {
			System.out.println("Entered sting is not a Palindrome");
		}
				
	}
	
	public static void main(String[] args) {
		
		ReverseString rs = new ReverseString();
		rs.reverseString();
		rs.isPalindrome();
		
	}
	
	
	
}
