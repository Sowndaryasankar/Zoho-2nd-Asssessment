package org.zoho;
import java.util.*;

public class Q6Matrix {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            matrix = rotateMatrix(matrix);
        }

        System.out.println("The rotated matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        sc.close();
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }
}
