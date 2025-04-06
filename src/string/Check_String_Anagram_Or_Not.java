package string;

import java.util.Arrays;

/*Q4.Java String Program to Check Anagram

Input: str1 = "Listen" 
       str2 = "Silent"
*/
public class Check_String_Anagram_Or_Not {

	public static void main(String[] args) {
		
		System.out.println("Enter 1 String");
		String str="Listen";
		
		System.out.println("Enter 2 String");
		String str1="Silent";
		
		str=str.toUpperCase();
		str1=str1.toUpperCase();
		
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		
		str="";
		str1="";
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(ch.length!=ch1.length) {
			System.out.println("String's are Not Anagram");
		}
		else {
			
			for(int i=0;i<ch.length;i++) {
				str=str+ch[i];
				str1=str1+ch1[i];
			}
			
			if(str.equals(str1)) {
				System.out.println("String's are Anagram");
			}
			else {
				System.out.println("String's are Not Anagram");
			}
		}

	}

}
