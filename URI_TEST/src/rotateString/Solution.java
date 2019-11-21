package rotateString;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		
		String A = "abcde";
		String B = "cdeab";
		
		boolean result = rotateString(A, B) ;
		System.out.println(result);
	        
	    

	}

	private static boolean rotateString(String A, String B) {
		
		
		return (A.length()==B.length() && (A+A).contains(B));
	}

}
