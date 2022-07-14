package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        //Put your code here
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mas[i][j] = matrix[j][i];
            }
        }

        return mas;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
