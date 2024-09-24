package codingAssessment;

public class CountOfOccuranceOfCharInString {

	public void findOccuranceOfCharInString(String str, char findChar) {
				
		char[] charArray = str.toCharArray();
				
		int count = 0;
				
		for(int i = 0; i< charArray.length; i++) {
			
			if(charArray[i]==findChar) 
			{
				count++;
				
				}
				
			}
			System.out.println("The Occurance of the Char : " +findChar + " in the Given String: "+str+ " is ==>" +count);

		}
		
	
	public static void main(String[] args) {

		CountOfOccuranceOfCharInString cOIS = new CountOfOccuranceOfCharInString();
		cOIS.findOccuranceOfCharInString("United States of America", 't');

		
	}

}
