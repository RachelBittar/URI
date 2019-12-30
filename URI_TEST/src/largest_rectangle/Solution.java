package largest_rectangle;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
    
    	if (h == null || h.length == 0) {
    		return 0;
    	}
     
    	Stack<Integer> stack = new Stack<Integer>();
 
    	int max = 0;
    	int i = 0;
     
    	while (i < h.length) {
    		
    		
    		if (stack.isEmpty() || h[i] >= h[stack.peek()]) {
    			stack.push(i);
    			i++;
    		} else {
    		
    			int p = stack.pop();
    			int height = h[p];
    			int w = stack.isEmpty() ? i : i - stack.peek() - 1;
    			max = Math.max(height * w, max);
    		}
     
    	}
     
    	while (!stack.isEmpty()) {
    		int p = stack.pop();
    		int height = h [p];
    		int w = stack.isEmpty() ? i : i - stack.peek() - 1;
    		max = Math.max(height * w, max);
    	}
     
    	return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

       
        System.out.println(result);
      
        scanner.close();
    }
}
