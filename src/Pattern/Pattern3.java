/*
 * Q3. Print the following pattern?
4444
333
22
1

 */
package Pattern;

import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N Value");
		int n=s.nextInt();
		int temp=n;
		for(int i=1;i<=n;i++) {
			
			for(int j=temp;j>=1;j--) {
				System.out.print(temp);
			}
			temp--;
			System.out.println();
		}

	}

}
