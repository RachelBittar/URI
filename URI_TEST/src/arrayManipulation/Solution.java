package arrayManipulation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        scanner.close();
    }

	private static long arrayManipulation(int n, int[][] queries) {
		
//brute force doesnt work for all test cases
/*		long m = queries.length;
		long[]mat = new long[n];
	
		int a=0, b=0, k=0;
		int row =0, i=0;
		int col=0, current=0;
		
		while(row<m) {
			
			a=queries[row][0];
			b=queries[row][1];
			k=queries[row][2];
			
			for(col =a-1; col<b; col++) {
				
				if(row>0) {
					mat[col] = mat[col]+k;
				}
				else {
					mat[col] = mat[col]+k;
			}
		}				
		
			row++;
			i++;		
		}	
	
	    Arrays.sort(mat);	
	    
	      
		return mat[n-1];
		
		
	}
	*/
	
	long[]mat = new long[n+2]; //using prefix algorithm
	
	int a=0, b=0, k=0;
	int row =0;
	long max=0;
	
	while(row<queries.length) {
		
		a=queries[row][0];
		b=queries[row][1];
		k=queries[row][2];

		
		mat[a]=mat[a]+k;
		mat[b+1]=mat[b+1]- k;		
		row++;	
	}
	
	
	max = getMax(mat);
	return max;
	
  }
	
	private static long getMax(long[] mat) { 
		long max = Long.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < mat.length; i++) 
		{ 
			sum += mat[i];
			max = Math.max(max, sum); 
		} 
		
		return max; 
		
	}
}
