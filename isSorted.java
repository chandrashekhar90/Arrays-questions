public class isSorted {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Checkpost\n");
        int[] array = ArrayUtility.inputArray();

        boolean isInc = isIncreasing(array);
        boolean isDec = isDecreasing(array);

        if (isInc || isDec) { // ya to inc order me ho ya dec me ho, but must be sorted
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }
    }

    // method for checking it is in inc order or not
    public static boolean isIncreasing(int[] arr) { // har agla element pichhle element se bda hona chaiye ya equal hona
                                                    // chaiye
        int i = 1; // start from second element
        while (i < arr.length) { // go till last element
            if (arr[i] < arr[i - 1]) { // agar koi bhi current element pichhle element se chhota mil gya to ye inc
                                       // order me nhi hai, so return false immidiately
                return false;
            }
            i++;
        }
        return true;
    }

    // method for checking it is in dec order or not
    public static boolean isDecreasing(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            // if (agla element > pichhla element) to ye decreasing order me nhi hai
            if (arr[i] > arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
