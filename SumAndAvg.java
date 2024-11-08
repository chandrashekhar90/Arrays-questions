public class SumAndAvg {
    public static void main(String[] args) {;
        System.out.println("Welcome to Array sum and Average!");

        int[] array = ArrayUtility.inputArray();

        long sum = sum(array);
        double avg = avg(array);
        
        System.out.println("Sum of the total elements: " + sum);
        System.out.println("Average of the elements: " + avg);
    }

    public static long sum(int[] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) { // array traversal , means visit to at all elements
            sum += arr[i]; // store current index element (i) in sum (accumulater)
            i++;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        double sum = sum(arr);
        return sum / arr.length; // sum is div by total no of elements = avg
    }
}