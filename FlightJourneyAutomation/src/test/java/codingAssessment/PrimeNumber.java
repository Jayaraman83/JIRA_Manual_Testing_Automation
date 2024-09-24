package codingAssessment;


//Given a number an integer 
//Check if the number is divisible by 1 & itself 
//If yes then print the given number is a Prime Number
//Else the given number is not a prime number


public class PrimeNumber {

	
		public void  isPrime(int num) {
				
		int count = 0;
		
		for(int i = 1; i<=num ; i++) {
		
		if(num % i == 0 ) {
			
			count++;
			
			}

		}
		
		if(count>2)
		{
			System.out.println("Given number " +num+ " is Not a Prime Number");
		}
		else {
		System.out.println("Given number " +num+ " is a Prime Number");
	}
}
	
		public static void main(String[] args) {
			
			PrimeNumber pm = new PrimeNumber();
			pm.isPrime(97);
			
			
		}
}