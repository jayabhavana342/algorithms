package ArraysAndStrings;

import java.util.Random;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = new Random().nextInt(50) + 5;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
        rotateMatrix(matrix);
        System.out.println("--------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 ||matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int first = i;
            int last = n - 1 - i;
            for (int j = first; j < last; j++) {
                int offset = j - first;
                int top = matrix[first][j];
                matrix[first][j] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[j][last];
                matrix[j][last] = top;
            }
        }
        return true;
    }
}
