package Arrays;

public class largestNumber {

    public static int getLarget(int numbers[]){
        int largest =Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize smallest to the largest possible integer


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update largest if the current number is greater
            }
            if(numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest if the current number is smaller
            }
        }
        System.out.println("The smallest number in the array is: " + smallest);
        return largest; // Return the largest number found
    }
    public static void main(String[] args) {
        int[] numbers = {1, 4, 3, 5, 10, 2, 6};
        
        // Find the largest number in the array
        int largest = getLarget(numbers);
        
        System.out.println("The largest number in the array is: " + largest);
        
    }
}
