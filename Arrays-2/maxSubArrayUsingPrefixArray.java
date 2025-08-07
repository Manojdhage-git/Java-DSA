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

    public static void main(String[] args) {
        int numbers[] = {1, -2, 3, 4, -5, 8};
        maxSubArrayUsingPrefixArray(numbers);

    }
}
