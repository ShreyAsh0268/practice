/*
 * Q19. Print the following pattern?
XOXO
OXOX
XOXO
OXOX

 */
package Pattern;

public class Pattern19 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j%2!=0) {
					System.out.print("X");
				}
				else {
					System.out.print("O");
				}
			}
			
			System.out.println();
		}


	}

}
