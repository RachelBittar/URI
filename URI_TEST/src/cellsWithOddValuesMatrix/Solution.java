package cellsWithOddValuesMatrix;

import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = 2, m = 3;
		int[][] indices = new int [n][m];
		int x=0;
		
		 for (int i = 0; i < n; i++) {
			 for (int y = 0; y < m; y++) {
				  x = scanner.nextInt();

				  indices[i][y] = x;
			 }
	       }
		 
		 
		int result = oddCells(n, m, indices);

	}

	private static int oddCells(int n, int m, int[][] indices) {
		// TODO Auto-generated method stub
		return 0;
	}

}
