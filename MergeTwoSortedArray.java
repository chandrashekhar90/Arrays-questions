public class MergeTwoSortedArray {
    public static void main(String[] args) {
        // using two pointer technique
        System.out.println("Welcome to Merging Sorted Arrays");
        // input array should be sorted
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        int[] mergedArr = merger(arr1, arr2);

        System.out.print("Your merged array is: ");
        ArrayUtility.displayArray(mergedArr);
    }

    public static int[] merger(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        // in this we need to three pointers -> i for 1st arr, j for 2nd arr and k for
        // newArray
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) { // chalega jab tak ki dono me se koi ek arr bacha hai
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i]; // i ka current element k me store -> new array agar element dusre ke elemnt se
                                     // chhota hai to
                k++; // agar i ka element copy hoga to i badhega
                i++; // k to har case me badhega chahe i me se element aaye ya j me se
            } else { // to j ka element bada hoga -> arr2 se copy hoga
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}