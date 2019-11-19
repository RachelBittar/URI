package repeatedString;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	  private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
	     String s = scanner.nextLine();

	        long n = scanner.nextLong();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        long result = repeatedString(s, n);

	       System.out.println(result);

	        scanner.close();

	}

	static long repeatedString(String s, long n) {
	    long aCount = 0;
	    long div = n / s.length();
	    long resto = n % s.length();
	 
	    String string;
	    aCount += getCount(s);
	    aCount *= div;
	    
	    if (resto > 0) {
	    	string = s.substring(0, (int) (resto));
	        aCount += getCount(string);
	    }
	    return aCount;
	}
	 
	static int getCount(String string) {
	    int count = 0;
	    if (null == string || string.isEmpty()) {
	        return count;
	    }
	    char[] chars = string.toCharArray();
	    for (int i = 0; i < string.length(); i++) {
	        if (chars[i] == 'a') {
	            count++;
	        }
	    }
	    return count;
	}
	
	
}
