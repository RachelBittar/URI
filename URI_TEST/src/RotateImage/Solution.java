package RotateImage;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		//	int[][] matrix = new int[4][4];
		Scanner leitor = new Scanner(System.in);

		int matrix[][] = { { 1, 2, 3 }, 
						   { 4, 5, 6 }, 
						   { 7, 8, 9 },
						}; 

		rotate(matrix);

	}

	private static void rotate(int[][] matrix) {
	
	    int n = matrix.length;
        int halfN;
        
        if (n % 2 == 0)
             halfN = n / 2;
        else
            halfN = n / 2 + 1;
        
        
        for (int i = 0; i < halfN; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = tmp;
            }
        }
      }
		


}
