package Fibonnacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class Solution {

	public static void main(String[] args)  {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = 2;

		// List<Integer> result = fibonacci(n);
		int result = fibonacci(n);
		// System.out.println(result.toString());
		System.out.println(result);

		

	}
//
//	private static List<Integer> fibonacci(int n) {
//		
////		List<Integer> fibNumbers = new ArrayList<>();
////        Integer fibNum = 0;
////
////        for (int i = 0; i < n; i++) {
////            fibNum = fib(i);
////            fibNumbers.add(fibNum);
////        }
////
////
////        return fibNumbers;
//		
//		int a=0;
//		int b=0;
//		int r=0;
//		List<Integer> fibNumbers = new ArrayList<>();
//		
//		for(int i=0; i<n; i++) {
//			
//			if(i<=1) {
//				fibNumbers.add(i);			
//			}	
//			else {
//				a = fibNumbers.get(i-1);
//				b = fibNumbers.get(i-2);
//				
//				r = fibon(a,b);
//				fibNumbers.add(r);
//				
//			}
//			
//		}
//	
//		return fibNumbers;
//	}
//
//	private static int fibon(int a, int b) {
//		
//		return a+b;
//	}
//
//	private static Integer fib(int n) {
//		 if (n <= 1)
//	            return n;
//
//	        return fib(n - 1) + fib(n - 2);
//	}

	private static int fibonacci(int n) {
		
		List<Integer> fibNumbers = new ArrayList<>();
		int sum=0;
		int r=0;
	
		
		for(int i=0; i<n; i++) {
			
			if(i<=1) 
				fibNumbers.add(i);			
			
			else {
				r = fibon(fibNumbers.get(i-1),fibNumbers.get(i-2));
					fibNumbers.add(r);
				}
			}
			
		if(n>=2) {
			sum = fibNumbers.get(n-2) +  fibNumbers.get(n-1) ;
			return sum;
		}
		if(n==1) {
			
			return 1;
		}
		return 0;
 }
    private static int fibon(Integer integer, Integer integer2) {
	
    	return integer+integer2;
  }
}
