package string;
/*
Question 1 : String Reversal with a Twist

Write a function that takes a string as input and reverses the string, but with the following twist:

Every vowel in the string should be converted to its uppercase equivalent before reversing. Every consonant should remain 
the same except letter ‘l/L’. If letter ‘l/L’ present delete it
Example:

Input: "hello world" Output: "drOw OEh"
*/
import java.util.*;
public class StringReverseWithVowelUpperCase_Delete_l_L {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = s.nextLine();
		
		char ch[]=str.toCharArray();
		String st="";
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!='l' && ch[i]!='L') {
				st=st+ch[i];
			}
		}
		
		System.out.println(st);
		
		char ch1[]=st.toCharArray();
		String st1="";
		
		for(int i=0;i<ch1.length;i++) {
			char c;
			if(ch1[i]=='a' || ch1[i]=='e'|| ch[i]=='i' || ch1[i]=='o'||ch1[i]=='u')
			{
				c=(char) (ch1[i]-32);
				st1=c+st1;
			}
			else
			{
				st1=ch1[i]+st1;
			}
		}
		
		System.out.println(st1);
		
	}

}
