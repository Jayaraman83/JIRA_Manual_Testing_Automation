package flightBooking;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		int num[] = {2,5,7,7,8,5,9,8};
		
		//iterate through a outer look
		for (int i = 0; i < num.length; i++) {
		
			//iterate through inner loop
			for (int j = i+1; j < num.length; j++) {
				
				//compare outer loop variable with inner loop variable

				if(num[i]==num[j]) {

					//If equal then Print the value

					System.out.println(num[i]);
				}
			}
			
		}
		
		
		
	}
	
}
