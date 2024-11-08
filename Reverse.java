public class Reverse {
    public static void main(String[] args) {

        // reverse array without making new array
        System.out.println("Welcome to Reverse World!");
        int[] array = ArrayUtility.inputArray();

        System.out.print("Array before reverse: ");
        ArrayUtility.displayArray(array);

        reversed(array);

        System.out.print("Array after reverse: ");
        ArrayUtility.displayArray(array);

    }

    public static void reversed(int[] array) {
        int i = 0;
        while (i < array.length / 2) {
            int swap = array[i]; // save first element
            array[i] = array[(array.length - 1) - i]; // array[5-1] - 0 -> 4 index(last element), array[5-1] - 1(second
                                                      // last element) -> 3 index
            array[(array.length - 1) - i] = swap;
            i++;
        }
    }
}