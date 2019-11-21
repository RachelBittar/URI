package containDuplicated;

public class Solution {

	public static void main(String[] args) {
		
		   int[] array = {1,2,3,1};
		   boolean result = false;

		   result = containsDuplicate(array);
		   System.out.println(result);

	}

	private static boolean containsDuplicate(int[] nums) {
		
		for(int i=0; i<nums.length-1; i++) {
			for(int y=i+1; y<nums.length; y++)
			
			if(nums[i]==nums[y]) {
				return true;
			}
		}
		
		return false;
	}

}
