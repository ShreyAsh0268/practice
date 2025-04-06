/*
 * Q2. Print the following pattern?
A
BB
CCC
DDDD

 */
package Pattern;

import java.util.*;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter N Value");
		int n=s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%c",i+64);
			}
			System.out.println();
		}
	}

}
