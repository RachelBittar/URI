package alternatingCharacters;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	int r=0;
    	
    	for(int i=0;i<s.length()-1;i++) {
    		if(s.charAt(i)==s.charAt(i+1)) {
    			r++;			
    		}
    		
    		
    	}
   
    //	System.out.println(r);
    	return r;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
 
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);
            System.out.println(result);

         
        }

      
        scanner.close();
    }
}
