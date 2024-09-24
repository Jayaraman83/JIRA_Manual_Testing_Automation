package codingAssessment;

public class RemoveWhiteSpaceFromString {
	
	public static String str;

		public void removingWhiteSpacesFromString(String str) {
		
			String[] split = str.split(" ");
			
			for(int i = 0; i< split.length; i++) {
				System.out.print(split[i]);
			}
					
		}

		public static void main(String[] args) {
			
			RemoveWhiteSpaceFromString rwfs = new RemoveWhiteSpaceFromString();
				
			rwfs.removingWhiteSpacesFromString("A u t o m a t i o n");
			
		}

}
