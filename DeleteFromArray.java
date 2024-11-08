import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");

        int[] array = ArrayUtility.inputArray();

        System.out.print("Here is your current array: ");
        ArrayUtility.displayArray(array);  // display array

        System.out.print("Now, enter the number that you want to delete: ");
        int numToDelete = input.nextInt();

        int[] newArray = deleteNumber(array, numToDelete);

        System.out.print("Here is your new array: ");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteNumber(int[] arr, int numToDelete) { // ye ek array le rha and wo number le rha hai jo
                                                                   // delete karna hai and ek naya array return kar dega
        int occ = NumberOfOccurences.numberOfOccurences(arr, numToDelete); // check, how many times this numberToDelete
                                                                           // or
                                                                           // element is exist in this array.

        if (occ == 0) {
            return arr; // agar wo number ya element mujhe mila he nhi jo delete karna tha to me ussi
                        // array ko
                        // return kar dunga, no need to create new array
        }
        int newSize = arr.length - occ; // agar mila hai, jitni bar occurrences hain array ki length se subtract karke
                                        // ek new array create kar lenge [ we can not change size of an array after
                                        // create ]
        int[] newArray = new int[newSize];

        int i = 0, j = 0; // two indexex, ek pehle array ka or ek new array ka
        while (i < arr.length) { // jab orginal array khatam na ho jaye
            if (arr[i] != numToDelete) { // copy sirf tbhi krna hai agar current index element noToDelete ke equal nhi
                                         // hai
                newArray[j] = arr[i]; // new array ke current( jth element me ) purane array ka ith element
                j++; // if copied then inc new array index (tbhi jab new array ka space use ho warna
                     // nhi)
            }
            i++;
        }
        return newArray;
    }
}