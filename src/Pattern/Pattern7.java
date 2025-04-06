/*
 * Q7. Print the following pattern?
   1
  121
 12321
1234321
 12321
  121
   1

 */
package Pattern;

import java.util.*;

public class Pattern7 {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			int k = 1;
			for (int j = 1; j <= 7; j++) {
				if (i <= 4) {
					if (j >= 5 - i && j <= 3 + i) {
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
					if (j >= i - 3 && j <= 11 - i) {
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
				}
			}
			System.out.println();
		}
	}
}
