package minimumswap2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int swap=0;
    	int cycle;
    	int j;
    	
		boolean visited[]=new boolean[arr.length];

		for(int i=0;i<arr.length;i++){
			 j=i;
			 cycle=0;

			while(!visited[j]){
				visited[j]=true;
				j=arr[j]-1;
				cycle++;
			}
			
			if(cycle!=0)
				swap+=cycle-1;
		}
		return swap;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
   
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
        System.out.println(res);

  
        scanner.close();
    }
}
