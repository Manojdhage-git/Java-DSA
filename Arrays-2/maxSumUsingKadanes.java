public class maxSumUsingKadanes {

    public static void kandnes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<numbers.length;i++){
            cs+=numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        System.out.println("Maximum sum of subarray is: " + ms);
    }
    public static void main(String[] args) {
        int numbers[]={2,3,-8,7,-1,2,3};
        kandnes(numbers);
        // Output: Maximum sum of subarray is: 11
        // Explanation: The maximum sum subarray is [7, -1, 2, 3] which sums to 11.
        // This implementation uses Kadane's algorithm to find the maximum subarray sum in O(n) time complexity.
        // It initializes the maximum sum (ms) to the smallest integer value and the current sum (cs) to 0.
        // As it iterates through the array, it adds each element to the current sum.
        // If the current sum becomes negative, it resets to 0.
        // The maximum sum is updated whenever the current sum exceeds the previous maximum.
        // This approach is efficient and avoids the need for nested loops, making it suitable for larger arrays.
        // This code is a Java implementation of Kadane's algorithm to find the maximum sum of a contiguous subarray.
        // It efficiently calculates the maximum sum in a single pass through the array.


        
    }
}
