package SingleNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		int[] nums = {4,1,2,1,2 };
		int result = 0;

		result = singleNumber(nums);
		System.out.println(result);

	}

	public static int singleNumber(int[] nums) {

		Set<Integer> single = new HashSet<Integer>();
		int result =0;
			
		for (int i = 0; i < nums.length; i++) {		
			if(single.contains(nums[i])) {
				single.remove((nums[i]));				
			}
			else {
				single.add(nums[i]);
			}
			
		}
		
		for(int i: single) {
			return i;
		}
		return -1;
		
	}
}
