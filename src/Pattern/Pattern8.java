/*
 * Q8. Print the following pattern?
   A
  ABA
 ABCBA
ABCDCBA
 ABCBA
  ABA
   A

 */
package Pattern;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			int k = 65;
			for (int j = 1; j <= 7; j++) {
				if (i <= 4) {
					if (j >= 5 - i && j <= 3 + i) {
						if (j <= 4) {
							System.out.printf("%c",k);
							k++;
						} else {
							k--;
							System.out.printf("%c",k - 1);
						}
					} else {
						System.out.print(" ");
					}
				} else {
					if (j >= i - 3 && j <= 11 - i) {
						if (j <= 4) {
							System.out.printf("%c",k);
							k++;
						} else {
							k--;
							System.out.printf("%c",k - 1);
						}
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
