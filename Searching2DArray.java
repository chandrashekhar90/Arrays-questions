import java.util.Scanner;

public class Searching2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Searching in 2D Array\n");
        
        int[][] arr = ArrayUtility.input2DArray();

        System.out.print("Now, enter the number you want to search: ");
        int number = input.nextInt();

        boolean isFound = search(arr, number);

        if (isFound) {
            System.out.println("Your number was found.");
        } else {
            System.out.println("Your number was not found.");
        }
    }

    public static boolean search(int[][] arr, int number) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) { // to row length(complete row)
                if (arr[i][j] == number) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}