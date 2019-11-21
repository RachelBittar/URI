package oddNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> res = oddNumbers(l, r);
        
        System.out.println(res.toString());


      

        bufferedReader.close();
      
    }

	private static List<Integer> oddNumbers(int l, int r) {
		
		List<Integer> num = new ArrayList<Integer>();
		
		for(int i=l; i<=r; i++) {
			if(i%2!=0) num.add(i);
			
		}
		
		return num;
	}

    

      
   }


