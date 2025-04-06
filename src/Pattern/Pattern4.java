/*
 * Q4. Print the following pattern?
DDDD
CCC
BB
A

 */
package Pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N Value");
		int n=s.nextInt();
		int temp=n;
		for (int i = 1; i <= n; i++) {
			for (int j = temp; j >=1; j--) {
				System.out.printf("%c",temp+64);
			}
			temp--;
			System.out.println();
		}

	}

}
