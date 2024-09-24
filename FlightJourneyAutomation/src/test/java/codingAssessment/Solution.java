package codingAssessment;

import java.util.Arrays;

class Solution {

	public int solution(int[] A) {
	
		Arrays.sort(A);
		
		int a = 1;
		
		for(int i = 0; i<A.length; i++) {
			
			if(A[i]==a) {
				
				a++;

			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		 Solution sol = new Solution();
		 int[] array1 = {1, 3, 6, 4, 1, 2};
		 System.out.println(sol.solution(array1));
		
	}

}
