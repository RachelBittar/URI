package RemoveDuplicatedSortedArray;

public class Solution {

	public static void main(String[] args) {

		 
          int[] array = {1,1,2};

         int result = removeDuplicates(array);
         System.out.println(result);
	     
		

	}

	private static int removeDuplicates(int[] array) {
	
		int count=1;
		
		for(int i=0; i<array.length-1; i++) {
				if(array[i]!=array[i+1]) {
					array[count++]=array[i+1];
		}
	}
		
		return count;
	}

}
