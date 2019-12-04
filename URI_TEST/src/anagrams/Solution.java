package making.anagrams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	
    	int []arr1=new int[26];
    	int []arr2=new int[26];
    
    	int count=0;
    	
    	for(int i=0;i<a.length();i++)
    	{
    		arr1[a.charAt(i)-'a']++;
    	}
    	for(int j=0;j<b.length();j++)
    	{
    		arr2[b.charAt(j)-'a']++;
    	}
    	for(int k=0;k<26;k++)
    	{
    		count=count+Math.abs(arr1[k]-arr2[k]);
    	}
    	
    		return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
  
        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

       System.out.println(res);

        scanner.close();
    }
}
