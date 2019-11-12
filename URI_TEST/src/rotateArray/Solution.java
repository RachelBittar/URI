package rotateArray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	
   private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		  int arCount = 2;
          int[] array = {-1,-100,3,99};

          rotate(array,arCount);
	      
          
	    //    System.out.println(result);
		

	}
//solution 1 - only for rotation;
	/*
	private static void rotate(int[] nums, int k) {
		        
        int index=0;
		int []array = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {			
			 	index = (i+ nums.length-1-k)%nums.length;
				array[index]=nums[i];
				
			}  
        
		nums = array.clone();
        System.out.print(Arrays.toString(nums).replace(" ", ""));
           		
}
*/

	private static void rotate(int[] nums, int k) {
		
		 int[] a = new int[nums.length];
		 
	     for (int i = 0; i < nums.length; i++) {
	        a[(i + k) % nums.length] = nums[i];
	     }
	     
	     for (int i = 0; i < nums.length; i++) {
	            nums[i] = a[i];
	        }
		}
	
		
	
}