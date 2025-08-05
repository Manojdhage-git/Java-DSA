package Arrays;

public class passingArraysAsArugments {

    public static void update(int marks[]) {
        for(int i = 0; i < marks.length; i++) {
            marks[i] += 10; // Increment each element by 10
        }
    }
        public static void main(String[] args) {
            int marks[] ={ 10, 20, 30, 40, 50 };
            update(marks);  // Passing the array to the method

            // Printing the updated array
            for(int i = 0; i < marks.length; i++) {
                System.out.print(marks[i] + " ");
            }
        }
}
