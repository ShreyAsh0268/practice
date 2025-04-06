package string;

import java.util.Scanner;

/*Q1. Java program to print Even length words in a String?

Input: s = "This is a java language"

Output: This is  java language

Explanation: All the elements with the length even are printed. 
"This" length is 4 so printed whereas "a" length is 1 so not Printed.  */
public class Print_Even_Length_Words_In_String {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = "This is a java language";
		
		String st[] = str.split(" ");
		
		for(int i=0;i<st.length;i++) {
			if(st[i].length()%2==0) {
				System.out.print(st[i]+" ");
			}
		}

	}

}
