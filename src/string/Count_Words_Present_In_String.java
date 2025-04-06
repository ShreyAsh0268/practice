package string;

import java.util.Scanner;

/*
 * /Q3. WAP to input the string and find the number of words in the string without using the split() method?/
 */
public class Count_Words_Present_In_String {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str = "I Love India";
		
		char ch[] = str.toCharArray();
		
		int count=1;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				count++;
			}
		}
		System.out.println("Words present In String = "+count);

	}

}
