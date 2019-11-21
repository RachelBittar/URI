package MaximizeProfit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		
	        List<Integer> price = new ArrayList<Integer>(); 
	      
	        price.add(7);
	        price.add(1);
	        price.add(5);
	        price.add(3);
	        price.add(6);
	        price.add(4);
	        
	        

	        long result = maximumProfit(price);
	        System.out.println(result);

	       

	}

	private static long maximumProfit (List<Integer> p) {
	
			
		int profit = 0;

		for (int i = 0; i < p.size() - 1; i++) {

			if (p.get(i + 1) > p.get(i)) {
				profit = profit + p.get(i + 1) - p.get(i);
			}

		}
		return profit;

	}

}
