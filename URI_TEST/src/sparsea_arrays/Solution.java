package sparsea_arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the matchingStrings function below.

    static int[] matchingStrings(String[] strings, String[] queries) {
    	
    	Map<String, Integer> map = new HashMap();	
    	int[] result= new int[queries.length];
    	String string;
    	String query;
    	
    	for(int i =0; i<strings.length;i++) {
    		string = strings[i];
    		
    		if(map.containsKey(string)) {
    			map.put(string, map.get(string)+1);		
    		}
    		else {
    			map.put(string, 1);
    		}
    		
    	}
    	
    	
    	for(int i =0; i<queries.length;i++) {
    		query = queries[i];
    		
    		if(map.containsKey(query)) {
    			result[i] = map.get(query);
    		}
    		
    	}

    		   	
		return result;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
   
        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);
        for (int r : res) {
        	
        	System.out.println(r);
        	
        }

      
        scanner.close();
    }
}
