package Arrays;

public class pairsInArray {

    public static void findPairs(int[] arr) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("Pair: (" + current + ", " + arr[j] + ")");
                totalPairs++;
        }
        System.out.println();
    }
        System.out.println("Total Pairs: " + totalPairs);
        // total pairs formula: n(n-1)/2
        // int n = arr.length;
        // int expectedPairs = n * (n - 1) / 2;
        // System.out.println("Expected Pairs: " + expectedPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        findPairs(numbers);

     
    }
}