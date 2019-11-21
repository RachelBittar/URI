package plusminus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	
    	DecimalFormat df2 = new DecimalFormat("0.000000");
    	
    	double plus  = 0; 
    	double minus = 0; 
    	double zero=0;

    	for(int i=0; i<arr.length;i++) {
    		
    		if(arr[i]>0) {
    			plus++;
    			
    		}
    		if(arr[i]<0) {
    			minus++;			
    		}
    		
    		if(arr[i]==0) {
    			zero++;
    		  			
    		}
    	}
    	
    	
    	System.out.println(df2.format(plus/arr.length) + " ");
    	System.out.println(df2.format(minus/arr.length)+ " ");
    	System.out.println(df2.format(zero/arr.length));
    
    	
    	
  	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
