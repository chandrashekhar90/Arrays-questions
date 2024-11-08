/**
 * PalindromeNumber
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker!\n");

        int[] array = ArrayUtility.inputArray();

        boolean isPalin = isPalindromeNumber(array);
        if (isPalin) {
            System.out.println("Your array is palindrome");
        } else {
            System.out.println("Your array is not palindrome");
        }
    }

    public static boolean isPalindromeNumber(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[(arr.length - 1) - i]) { // arr.length - 1 -> means last index, do half of array and check 1st element with last element then 2nd to 2nd last 3rd to 3rd last, if not equal are not palindrome, if equals then it is palindrome
                return false;
            }
            i++;
        }
        return true;
    }
}