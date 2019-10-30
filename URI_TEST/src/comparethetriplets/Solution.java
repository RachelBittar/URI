package comparethetriplets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	
    	List<Integer> result = new ArrayList<>(2);
   // 	result.add(0, 0);
   // 	result.add(1, 0);
    	
    	int alice =0;
    	int bob =0;
   
    	
    	for(int i =0; i< a.size(); i++) {
    			
    		if(a.get(i)>b.get(i)) {
    			alice++;
    		}
    		
    		if(a.get(i)<b.get(i)) {
    			bob++; 			
    		}
    		
    	}
    	
    	result.add(0, alice);  		
    	result.add(1, bob);  

    	return result;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.get(0) + " " + result.get(1));

       

        bufferedReader.close();
       
    }
}
