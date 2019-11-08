package isPalindrome;

import java.util.Scanner;

public class Solution {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int x = scanner.nextInt();
		boolean is = false;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
  
        is = isPalindrome(x);
        System.out.println(is);
		
		
		
	}

	private static boolean isPalindrome(int x) {
		
	boolean negative = false;
	int num = x;
		
		if(x<0) {	
			return false;
		}
		
		long reversed=0;
		
		while(x>0) {		
			reversed = reversed*10 + x%10;
			x=x/10;
		}
		
		if(reversed>Integer.MAX_VALUE) {
			return false;
		}
	
		if(num!=reversed)
			return false;
		
		return true;
	}

}
