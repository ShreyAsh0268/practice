package string;

import java.util.Scanner;

/*3.Check if a String Contains Only Digits ?
Input: "12345"
Output: true */
public class Check_String_Contains_Only_Digits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str="12345";
		
		char ch[]=str.toCharArray();
		boolean flag=false;
		for(int i=0;i<ch.length;i++) {
			if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')) {
				flag = true;
			}
		}
		if(!flag) {
			System.out.println(!flag+" Its Contain Only Digits");
		}
		else {
			System.out.println(flag+" Its Not Contain Only Digits");
		}

	}

}
