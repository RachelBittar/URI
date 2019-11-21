package Predador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {


	public static void main(String[] args) throws NumberFormatException, IOException {

		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	     
	      int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < arrCount; i++) {
	            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
	            arr.add(arrItem);
	        }

		
	    int group = minimumGroups(arr);
	    
	    System.out.println(group);
	    
	}

	private static int minimumGroups(List<Integer> ints) {
		
		int max = 1;
		int arrLen = ints.size();
		for (int i = 0; i < ints.size(); i++)
		{
			int a = i;
			int counter = 1;
		    while (ints.get(a) > -1 && ints.get(a) < arrLen && counter < arrLen)
		    {
		        a = ints.get(a);
		        counter++;
		    }

		    if (counter > max)
		        max = counter;
		}
		return max;
		
	}

}
