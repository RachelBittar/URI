/*
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory. 
 * In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as 
 *  (you may also see it written as ).

Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.
Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer,  (the number of integers in ). 
The second line contains  space-separated integers describing .

Constraints
Output Format

Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input 1

CopyDownload
Array: arr
1
4
3
2

 
4
1 4 3 2
Sample Output 1

2 3 4 1*/

package ArrayDS;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
    	
    	int[] b = new int[a.length];
    	int aux = 0;
    	
    	
    	for(int i = a.length-1; i>= 0; i--) {
    	 
    		b[i] = a[aux];
    		aux++;
    		    		
    	}
    	return b;
    		
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    
        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
        	
        	System.out.print(res[i] + " ");

           
        }

  
        scanner.close();
    }
}
