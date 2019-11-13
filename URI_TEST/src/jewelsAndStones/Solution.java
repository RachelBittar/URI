/*
 * You're given strings J representing the types of stones 
 * that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  
 * You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct,
and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone
from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.

 * 
 * */


package jewelsAndStones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	
		String j = scanner.next(); //types
		String s = scanner.next(); //what I have
		int result=0;			  //who many jewels I have
		
		result = numJewelsInStones(j, s);
		
		System.out.println(result);
	}
	
	private static int numJewelsInStones(String j, String s) {
		
		Set<Character> jewels = new HashSet<>();
		char[] type = s.toCharArray();
		int found =0;
		
		for(char c: j.toCharArray()) {
			jewels.add(c);		
		}
	
	   for(int i=0; i<type.length; i++) {	
		if(jewels.contains(type[i])) {					
			found++;
		}
				
	}
		
		
		
		
		
		return found;
	}

}
