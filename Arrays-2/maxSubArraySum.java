public class maxSubArraySum {

    public static void maxSubArraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
          int start =i;
          for(int j = i; j < numbers.length; j++) {
            int end = j;
            currentSum = 0;
            for (int k = start; k <= end; k++) {
                currentSum += numbers[k];
            }
            System.out.println(currentSum);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
          }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
       
    }

    public static void main(String[] args) {
       int numbers[] = {1, -2, 3, 4, -5, 8};
       maxSubArraySum(numbers);

      //  Explaination of all code - sum is calculated by taking all possible subarrays and checking their sum.
       //  The maximum sum is updated whenever a larger sum is found.
       //  This approach has a time complexity of O(n^3) due to the nested loops.
        //  For a more efficient solution, we can use Kadane's algorithm which has a time complexity of O(n).
    }

 
}