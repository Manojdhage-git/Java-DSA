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
    }

 
}