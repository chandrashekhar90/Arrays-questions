public class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array\n");

        int[][] arr = ArrayUtility.input2DArray();

        long sum = sum(arr);
        double avg = average(arr);

        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your average of array is: " + avg);

    }

    public static long sum(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {  // Iterates through each element in the current row and  gives the number of columns in the current row
                sum += arr[i][j];   // Add the current element to the `sum`
                j++;   // Move to the next column in the row.
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] arr) {
        if (arr.length == 0) {
            return 0; // If the array has no rows, return 0 as the average
        }
        int rows = arr.length; // Get the total number of rows in the array
        int cols = arr[0].length; // Get the number of columns in the first row
        // (Assumes the array has at least one row.)

        double size = rows * cols; // Calculate the total number of elements

        return sum(arr) / size; // Divide the sum of all elements by the total size
    }
}