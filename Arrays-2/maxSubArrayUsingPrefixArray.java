public class maxSubArrayUsingPrefixArray {

    public static void maxSubArrayUsingPrefixArray(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[numbers.length];

        prefixSum[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    // dryrun of the code
    // Given the array: {1, -2, 3, 4, -5, 8}
    // The prefix sum array will be: {1, -1, 2, 6, 1, 9}
    // The maximum subarray sum will be calculated as follows:          

    public static void main(String[] args) {
        int numbers[] = {1, -2, 3, 4, -5, 8};
        maxSubArrayUsingPrefixArray(numbers);

        // this program calculates the maximum subarray sum using a prefix sum array.
        // It iterates through all possible subarrays and computes their sums using the prefix sum array
        // to find the maximum sum efficiently.
        // The time complexity is O(n^2) due to the nested loops, but it can be optimized further.
        // The prefix sum array allows for quick calculation of subarray sums.  
        // Note: This implementation is not the most efficient for large arrays.
        // For larger datasets, consider using Kadane's algorithm for O(n) complexity.

    }
}
