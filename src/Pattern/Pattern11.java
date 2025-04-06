/*
 * Q11. Print the following pattern?
AAAA
BBBB
CCCC
DDDD

 */
package Pattern;

public class Pattern11 {

	public static void main(String[] args) {
		
		int k=65;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.printf("%c",k);
			}
			k++;
			System.out.println();
		}

	}

}
