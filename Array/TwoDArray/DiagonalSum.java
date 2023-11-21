package Array.TwoDArray;

/**
 * DiagonalSum
 */
public class DiagonalSum {
    public static void diagonalSum(int matrix[][]) {
        int left = 0;
        int right = matrix.length - 1;
        int leftSum = 0;
        int rightSum = 0;

        int diagonalSum = 0;
        // for(int i= 0 ;i<matrix.length; i++){
        // leftSum+= matrix[i][left];
        // rightSum+=matrix[i][right];
        // left++;
        // right--;
        // }

        for (int i = 0; i < matrix.length; i++) {

            // diagonalSum += matrix[i][i];

        }
        for (int i = matrix.length-1; i >= 0; i--) {

            // // System.out.println();
            // if ((i % 2 == 1 && i == matrix.length / 2) || matrix.length == 1) {

            // } else {
                System.out.println(matrix[matrix.length - i - 1][i]);
                diagonalSum += matrix[i][matrix.length - i - 1];
            

        }

        System.out.println(diagonalSum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 7, 3, 1, 9 },
                { 3, 4, 6, 9 },
                { 6, 9, 6, 6 },
                { 9, 5, 8, 5 },
                // { 13, 14, 15, 16 }
        };

        diagonalSum(matrix);
    }

}