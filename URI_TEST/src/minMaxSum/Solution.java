package minMaxSum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	
    	long[] sum= new long[arr.length];
   // 	double soma=0;
    	
    	for(int i=0; i<arr.length; i++) {	
    		for(int y=0; y< arr.length; y++) {
 	
    			if(i!=y) {    				
    				sum[i]= sum[i]+arr[y];   				
    			}		
    			
    		}
    		
    	}
    	
    	Arrays.sort(sum);
    	System.out.println(sum[0]+ " " + sum[sum.length-1]);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
