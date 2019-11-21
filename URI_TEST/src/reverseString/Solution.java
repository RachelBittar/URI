
/*
 * 
 * Write a function that takes a string as input and reverse only
 *  the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".

*/



package reverseString;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Solution {

	 private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		String n = scanner.nextLine();
				
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        
        String result = reverseString(n);
        
        System.out.println(result);
        
        

	}

	private static String reverseString(String s) {

		
		Set<Character> vowel = new HashSet<>();
		String result;
		
		Stack found = new Stack<>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		
		
		char[] characteres = s.toCharArray();
	
		
		for(int i=0; i<s.length(); i++) {
			
			if(vowel.contains(characteres[i])) {			
				found.add(characteres[i]);	
			}
				
		}
		
		for(int i=0; i<s.length(); i++) {
			
			if(vowel.contains(characteres[i])) {			
				
				characteres[i] = (char) found.pop();
			}
				
			//characteres[i]=characteres[i];
		}
		
			result= new String(characteres);  
	
			return result;
	}

}
