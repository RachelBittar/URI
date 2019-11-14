package PlusOne;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
		int[] digits = {9,9};
	 
		int[] result = plusOne(digits);
		
		System.out.println(Arrays.toString(result));

	}

	private static int[] plusOne(int[] digits) {
		
	/* -- nao funciona ----- overflow--------
		int num =0;
		int multi=1;
		int rest=0;
		int y=0;
		int div=1;
		
		for(int i=digits.length-1; i>=0;i--) {
			
			num = num +  digits[i] * multi;
			multi=multi*10;
			
		}
		
		num = num+1;
		int[] result = new int[String.valueOf(num).length()];
		
		System.out.println(num);
		
		y = result.length-1;

		
		while(y>=0) {
			
			div = (div*10)/div;
			rest = num%div;
			num =  num/10;
			
			result[y] = rest;
			div = div*div;
			y--;
			
		}	
		return result;
		
		*/
		
		int add =0;
		int y=1;
		
		for(int i=digits.length-1; i>=0;i--) {
			
			if((digits[i]<9)) {
			    digits[i]++;
				return digits;
			}		
			digits[i]=0;
		}
		
		
		int[] result = new int[digits.length+1];
		result[0]=1;
		result[result.length-1] =0;
		
		return result;
		
		
		
	}

}
