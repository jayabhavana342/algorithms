package ArraysAndStrings;

import java.util.Random;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = new Random().nextInt(50);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < 5; i++) {
            matrix[new Random().nextInt(5)][new Random().nextInt(5)] = 0;
        }
        System.out.println("--------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("--------");
        zeroMatrix(matrix);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static void zeroMatrix(int[][] matrix) {
        boolean rowNull = false;
        boolean colNull = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[i][0] == 0) {
                rowNull = true;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i] == 0) {
                colNull = true;
                break;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                nullifyRow(matrix, i);
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                nullifyCol(matrix, i);
            }
        }

        if (rowNull)
            nullifyRow(matrix, 0);

        if (colNull)
            nullifyCol(matrix, 0);

    }

    private static void nullifyRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j] = 0;
        }
    }

    private static void nullifyCol(int[][] matrix, int i) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][i] = 0;
        }
    }
}
