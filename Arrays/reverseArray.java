package Arrays;
//reverse an array in Java
//using swapping technique - first element with last, second with second last, and so on


public class reverseArray {

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // move towards middle
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[]= {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        reverse(numbers);

        System.out.print("Reversed Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
     
    }
}