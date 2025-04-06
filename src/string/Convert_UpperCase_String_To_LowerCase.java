package string;

import java.util.Scanner;

/*Q3. WAP to convert uppercase string to lowercase without using inbuilt function?
*/
public class Convert_UpperCase_String_To_LowerCase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = "ABC";

		char ch[] = str.toCharArray();
		str = "";
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
			str = str + ch[i];
		}
		System.out.println(str);

	}

}
