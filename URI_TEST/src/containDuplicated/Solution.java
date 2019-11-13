package containDuplicated;

public class Solution {

	public static void main(String[] args) {
		
		   int[] array = {1,2,3,1};
		   boolean result = false;

		   result = containsDuplicate(array);
		   System.out.println(result);

	}

	private static boolean containsDuplicate(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			for(int y=i+1; y<array.length; y++)
			
			if(array[i]==array[y]) {
				return true;
			}
		}
		
		return false;
	}

}
