/*
 * Q12. Print the following pattern?
1111
2222
3333
4444

 */
package Pattern;

public class Pattern12 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
