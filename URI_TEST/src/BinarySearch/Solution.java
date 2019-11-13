package BinarySearch;

public class Solution {

	public static void main(String[] args) {
		
		int[] nums = {5};
		int target = 5;
		
		 int result = search(nums,target);
		 System.out.println(result);

	}

	private static int search(int[] nums, int target) {
		
		
		int start =0;
		int end = nums.length;
		int div=0;
		int result=0;
		int found = end - start;

		
		while(start<=end && found>0) {
			 
			 
			div = ((end + start)/2);	
			
			if(nums[div]==target) {
				result = div;
				break;
			}
			if(nums[div]<target) {
				start = div;
			}
			else {
				end = div;
			}
		
			result = div;
			found --;
		}
		
	if(found==0) {
		result = -1;
	}
		
	return result;
	
	}

}
