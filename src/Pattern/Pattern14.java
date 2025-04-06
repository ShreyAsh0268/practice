/*
 * Q14. Print the following pattern?
A
AB
ABC
ABCD

 */
package Pattern;

public class Pattern14 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int k=65;
			for(int j=1;j<=i;j++) {
				System.out.printf("%c",k);k++;
			}
			System.out.println();
		}

	}

}
