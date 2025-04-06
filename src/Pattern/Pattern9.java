/*
 * Q9. Print the following pattern?
   1
  1 1
 1 2 1
1 3 3 1

 */
package Pattern;

public class Pattern9 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			int k = 1;
			for (int j = 1; j <= 7; j++) {
				if (i % 2 == 0) {
					if (j >= 5 - i && j <= 3 + i) {
						if (j % 2 != 0) {
							if (j <= 4) {
								System.out.print(k);
								k++;
							} else {
								k--;
								System.out.print(k);
							}
						} else {
							System.out.print(" ");
						}
					} else {
						System.out.print(" ");
					}
				} else {
					if (j >= 5 - i && j <= 3 + i) {
						if (j % 2 == 0) {
							if (j <= 4) {
								System.out.print(k);
								k++;
							} else {
								k--;
								System.out.print(k - 1);
							}
						} else {
							System.out.print(" ");
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
