package reverseInteger;

import java.util.Scanner;

public class Solution {

   private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int arrCount = scanner.nextInt();
		int result =0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int arr = arrCount;
        result = reverse(arr);
        System.out.println(result);
      
  }

	private static int reverse(int x) {
		
		boolean negative = false;
		
		if(x<0) {	
			negative = true;
			x*=-1;	
		}
		
		long reversed=0;
		
		while(x>0) {		
			reversed = reversed*10 + x%10;
			x=x/10;
		}
		
		if(reversed>Integer.MAX_VALUE) {
			return 0;
		}
		
		if(negative) reversed*=-1;
		return (int) reversed;	
		
	}

}
