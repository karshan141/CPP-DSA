package Array.TwoDArray;

import java.util.Scanner;

public class spiralMatrix {

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int starCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && starCol <= endCol) {

            for (int i = starCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                
                System.out.print(matrix[i][endRow] + " ");
            }

            for (int i = endCol - 1; i >= starCol; i--) {
                System.out.print(matrix[endCol][i] + " ");
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // System.out.println();
                // System.out.println(i + " " + endRow);
                System.out.print(matrix[i][startRow] + " ");
            }
            startRow++;
            endRow--;
            starCol++;
            endCol--;
        }

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        spiralMatrix(matrix);

    }
}
