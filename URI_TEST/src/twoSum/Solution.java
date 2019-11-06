package twoSum;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Solution {

	 private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] nd = scanner.nextLine().split(" ");

		int[] a = {3,2,4};
		int d = 6;

		int[] result = twoSum(a, d);

		System.out.print(Arrays.toString(result).replace("[", "").replace("]", "").replace(",", " "));

		scanner.close();
        

	}
	
	public static int[] twoSum(int[] nums, int target) {
        
		int diff; 
      
        for (int i = 0; i<nums.length; i++) {  
        	
            diff = target - nums[i];
           
            for (int y = 0; y<nums.length; y++) { 
                
                if (i ==  y) { 
                	continue;
                } 
                if (nums[y] == diff) {
                    return new int[] {i, y};
                }
            }            
        }
        return new int[] {0, 0};
  
	}
	
}