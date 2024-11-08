import java.util.Scanner;

public class NumberOfOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number of Occurences\n");

        int[] array = ArrayUtility.inputArray();

        System.out.print("Now, enter the number that you want to find: ");
        int num = input.nextInt();
        
        int occurences = numberOfOccurences(array, num);
        System.out.println("Your element was found " + occurences + " times in the array.");
    }

    public static int numberOfOccurences(int[] arr, int num) {
        int occur = 0;
        int i = 0;
        while (i < arr.length) { // array traversal
            if (num == arr[i]) { // check, if number is equal to any current element
                occur++; // then, increase count variable by 1 which is indicate the no of ocuurences
            }
            i++;
        }
        return occur;
    }
}