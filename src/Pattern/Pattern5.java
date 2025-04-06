/*
 * Q5. Print the following pattern?
1
12
123
1234

 */
package Pattern;

import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter N Value");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
