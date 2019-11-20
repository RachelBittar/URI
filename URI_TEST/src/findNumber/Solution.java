package findNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	     
	        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < arrCount; i++) {
	            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
	            arr.add(arrItem);
	        }

	        int k = Integer.parseInt(bufferedReader.readLine().trim());

	        String res = findNumber(arr, k);

	        System.out.println(res);
	     

	        bufferedReader.close();
	      
	    }

	private static String findNumber(List<Integer> arr, int k) {
		
		
		for(Integer elem: arr) {

			if(k==elem) return "YES";
		}
			
		return "NO";
	}

}
