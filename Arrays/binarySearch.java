package Arrays;

//Binary Search in Java
// defination - Binary search is an efficient algorithm for finding an item from a sorted array.
// It works by repeatedly dividing the search interval in half.
// If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
// Otherwise, narrow it to the upper half.
// prerequisite: The array must be sorted before performing binary search.


//pseduocode - start=0 


public class binarySearch {

    public static int binarysearch(int numbers[], int key) {
       int start = 0,end= numbers.length - 1;

       while(start <= end) {
           int mid = (start + end) / 2;

           //camparison
           // if the key is found at mid index
           if (numbers[mid] == key) {
               return mid; // key found
           } else if (numbers[mid] < key) {
               start = mid + 1; // search in the right half
           } else {
               end = mid - 1; // search in the left half
           }
       }
       return -1; // key not found
    }
    public static void main (String[] args){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 40 ;

        int result = binarysearch(numbers, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }
}