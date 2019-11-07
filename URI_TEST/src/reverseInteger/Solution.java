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
		
		 int y = 0;

		    while(x != 0) {
		        int yy = y*10 + x%10;

		        if ((yy - x%10)/10 != y) return 0;
		        else y = yy;

		        x = x/10;   
		    }
		    return y;
	}
	
	
	
	
	
	


}
