package string;

import java.util.Scanner;

/*Q2. WAP to convert lowercase string to uppercase without using inbuilt function?
*/
public class Convert_LowerCase_String_To_UpperCase {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str="abc";
		
		char ch[]=str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char) (ch[i]-32);
			}
			str=str+ch[i];
		}
		System.out.println(str); 
	}

}
