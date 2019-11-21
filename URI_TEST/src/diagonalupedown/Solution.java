package diagonalupedown;

public class Solution {

	public static void main(String[] args) {

		char[][] arr = new char [6][6];
		
		for(int i=0; i<=arr.length-1;i++) {
			
			for(int y = 0; y<=arr.length-1; y++) {
				
				if(i==y) {
				 //	arr[i][y]=  'd';
					System.out.print("\\");
				}
				
				if(i==arr.length-1- y) {  // compare line to size - colum
				//	arr[i][y]=  'c';
					System.out.print("/");			
				}
				System.out.print("-");
				
			}
			
			System.out.println();
			
		}
		

	}

}
