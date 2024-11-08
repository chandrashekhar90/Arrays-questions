public class DiagonalSum2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");
        // for the diagonal sum in matrix row and column should same
        // If the size is odd, the overlap is handled by subtracting the center element. For even sizes, there’s no overlap adjustment
        int[][] arr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(arr);
        System.out.println("Sum of Diagonals is: " + sum);
    }

    public static long sumOfDiagonal(int[][] arr) {  // This is the main method that calculates the total sum of the left and right diagonals of the matrix and adjusts for any overlap in case of a matrix with an odd size
        long leftSum = sumOfLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);
        long sum = leftSum + rightSum;
        if (arr.length % 2 != 0) { // For a matrix of odd size (arr.length % 2 != 0), the center element belongs to both the left and right diagonals, so it is counted twice and 
            int index = arr.length / 2; // To correct this, the code subtracts the center element value (arr[index][index], where index = arr.length / 2) from the sum
            sum -= arr[index][index];
        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int col = arr.length - 1 - i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }
}