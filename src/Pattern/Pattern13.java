/*
 * Q13. Print the following pattern?
1
12
123
1234

 */
package Pattern;

public class Pattern13 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
