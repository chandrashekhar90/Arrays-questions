import java.util.Scanner;

public class ArrayUtility {
    // method for taking user inputs in an array
    public static int[] inputArray() { // agar static hai to class ka name lga kar is method ko use kr skte hain
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the number of elements: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    // method for print or display an array
    public static void displayArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    // for taking user input in 2D Array
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Please, enter the number of columns: ");
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns]; // size -> rows * columns

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Please enter element row: " + (i + 1) + ", column: " + (j + 1) + ": ");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }
}