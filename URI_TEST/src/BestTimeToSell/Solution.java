package BestTimeToSell;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		
		
		 int[] prices = {7,1,5,3,6,4};

		 int result = maxProfit(prices);
		 System.out.println(result);
	     
		
	}

	private static int maxProfit(int[] prices) {
		
		int profit =0;
			
		for(int i=0; i<prices.length-1; i++) {
				
			if(prices[i+1]>prices[i]) {		
				profit = profit + prices[i+1]-prices[i];
			}
					
		}
		return profit;
	}

}
