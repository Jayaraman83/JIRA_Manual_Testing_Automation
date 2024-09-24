package codingAssessment;

public class Assessment {

	public static void main(String[] args) {

		String name = "welcome to qualitest";
		//Program to make Starting letter of each word in CAPS ex: 
		//Ex: Input is: "welcome to qualitest"
		// Output should be : "Welcome To Qualitest"
		
		String[] nameArray = name.split(" ");
		
		for(int i = 0; i< nameArray.length; i++) {
			

			String upperCase = nameArray[i].substring(0,1).toUpperCase()+nameArray[i].substring(1);
			
			System.out.println(upperCase);
			
		}

	}

}
