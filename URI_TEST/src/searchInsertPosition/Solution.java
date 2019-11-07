package searchInsertPosition;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,3,5,6};
		int result = searchInsert(num, 9);
		System.out.println(result);

	}

	private static int searchInsert(int[] num, int target) {
		
		int end = num.length-1;
		int start = 0;
		int mid=0;
	
		
		
		while(end>start+1) {
			
			mid = start+(end+start)/2;
			
			if(num[mid]==target) {			
				return mid;
			}
			else if(target<num[mid]) {
				end = mid;
			}
			else if(target>num[mid]) {
				start = mid;
			}
		}
		
		if(target>num[end]) {
			return mid+1;
		}
		if(target>num[start]) {
			return start;
		}
		else {
			return end;
		}
	
	}

	
}
