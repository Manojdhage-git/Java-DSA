package Arrays;

public class linearSearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }
    
    public static void main(String[] args) {
        

        // Linear Search
        // find the index of a given element in an array
        // key=10 find the index of 10 in the array
        int[] numbers = {1, 4, 3, 5, 10, 2, 6};
        String menu[]={"dosa","idli","vada","poha","upma"};
        String keyMenu="poha";

        int key = 100;
        
        String menuIndex= linearSearch(menu, keyMenu) + "";
        if (!menuIndex.equals("-1")) {
            System.out.println("Element found at index: " + menuIndex);
        } else {
            System.out.println("Element not found in the array.");
        }

        int index = linearSearch(numbers, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
