package fileOperations;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        Set<Integer> positiveNumbers = new HashSet<>();
        
        // Add all positive numbers to the set
        for (int num : A) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }
        
        // Find the smallest positive integer not in the set
        int smallestMissingPositive = 1;
        while (positiveNumbers.contains(smallestMissingPositive)) {
            smallestMissingPositive++;
        }
        
        return smallestMissingPositive;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] testArray1 = {1, 3, 6, 4, 1, 2};
        System.out.println(sol.solution(testArray1)); // Expected output: 5

        int[] testArray2 = {1, 2, 3};
        System.out.println(sol.solution(testArray2)); // Expected output: 4

        int[] testArray3 = {-1, -3};
        System.out.println(sol.solution(testArray3)); // Expected output: 1

        int[] testArray4 = {2, 3, 7, 6, 8, -1, -10, 15};
        System.out.println(sol.solution(testArray4)); // Expected output: 1

        int[] testArray5 = {1};
        System.out.println(sol.solution(testArray5)); // Expected output: 2
    }
}