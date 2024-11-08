public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum and Minimum of an Array");
        int[] array = ArrayUtility.inputArray();

        int max = max(array);
        int min = min(array);

        System.out.println(max + " is the Maximum");
        System.out.println(min + " is the Minimum");
    }

    // method of find maximum element in an array
    public static int max(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE; // inbuild Integer class and MIN_VALUE -> biggest number in negative
        }
        int max = arr[0]; // assume first element is maximum
        int i = 1; // now start from second element
        while (i < arr.length) {
            if (max < arr[i]) { // check, if my current maximum number is smaller than any array element(current
                                // index)
                max = arr[i]; // then, the maximum become array current element(index)
            }
            i++;
        }
        return max;
    }

    // method of find minimum value in array
    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE; // assume maximum value (inbuild class)
        int i = 0;
        while (i < arr.length) { // here, no need to check array length, if array length is zero this loop can't run
            if (min > arr[i]) { // check, if my current minimum number is greater than any array element
                min = arr[i]; // then, this become my current minimum element.
            }
            i++;
        }
        return min;
    }
}
