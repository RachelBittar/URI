package DefangingIPAddress;

import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String n = scanner.next();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String address = defangIPaddr(n);
        System.out.println(address);

        scanner.close();
	}

	private static String defangIPaddr(String n) {
		
		return n.replace(".", "[.]");
	}

}
