package string;

import java.util.Scanner;

/*
 * /Q4. WAP to input string and reverse it without using inbuilt function and copy the string data in another string?/
 */
public class String_Reverse_Without_Inbuild_Function_And_New_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = "abc xyz mno";
		
		char ch[]=str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
			str=str+ch[i];
		}
		
		System.out.println(str);

	}

}
