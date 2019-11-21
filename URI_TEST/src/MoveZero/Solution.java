package MoveZero;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
	
		int[] nums =  {0,1,0,3,12};
		moveZeroes(nums);
	}

	private static void moveZeroes(int[] nums) {
		
		int index=0;
		int aux=0;
		
		for(int i=0; i<nums.length; i++) {
				if(nums[i]!=0) {
				nums[index++] = nums[i];
		   }
		}
		
		for(int i=index; i<nums.length; i++) {	
				nums[i] = 0;		
	   }
		
		System.out.println(Arrays.toString(nums));
	}
	

}
