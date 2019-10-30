package diagonalDifference;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    	
    	int[][] matriz = new int[arr.size()][arr.size()];
    	int up=0;
    	int down=0;
    	int t=0;
    	
    	
    	for(int i=0;i<arr.size();i++) {	
    		for(int y=0;y<arr.size();y++) {
    			matriz[i][y]= arr.get(i).get(y);
    		}   		
    	}
    	
    	
    	for (int i = 0; i < matriz.length; i++) 
        { 
            for (int j = 0; j < matriz.length; j++) 
            { 
                if (i == j) 
                	up += matriz[i][j]; 
       
                if (i == matriz.length - j - 1) 
                	down += matriz[i][j]; 
            } 
        } 
       
    
    
    return Math.abs(up - down); 
    
    
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);
        System.out.println(result);

       

        bufferedReader.close();
       
    }
}

