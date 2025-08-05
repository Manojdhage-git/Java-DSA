// #Arrays#
// list of elements of the same type placed in a contiguous memory location
// Array is a collection of similar data types
// eg. 1,2,3,4,5,6,7,8,9,10 = int array
// eg. "a", "b", "c", "d" = String array
// Array is a fixed size data structure

// ### Opeartions on Arrays
// create
// insert/input
// update
// length

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // create an array
        // syntax: dataType arrayName[] = new dataType[size];
        // or: dataType[] arrayName = new dataType[size];
        int arr[] = new int[5]; // array of size 5
        int numbers[]={1, 2, 3, 4, 5}; // array with initialization
        String fruits[] ={ "Apple", "Banana", "Cherry"}; // String array

        //take input in array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();  
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();

        //output the array
        System.out.println("You entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        // update an element in the array
        arr[2] = 10; // changing the third element to 10
        System.out.println(arr[2]+"\nAfter updating the third element:");

        //length of the array
        System.out.println("Length of the array: " + arr.length);
        

    }
}