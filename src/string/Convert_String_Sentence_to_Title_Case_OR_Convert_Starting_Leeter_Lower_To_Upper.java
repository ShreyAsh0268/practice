package string;

import java.util.Scanner;

/*4.	Convert a Sentence to Title Case ?
Input: "java is fun"
Output: "Java Is Fun"*/
public class Convert_String_Sentence_to_Title_Case_OR_Convert_Starting_Leeter_Lower_To_Upper {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str ="java is fun";
		
		String st[]=str.split(" ");
		str="";
		for(int i=0;i<st.length;i++) {
			char ch[]=st[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				if(j==0) {
					ch[j]=(char) (ch[j]-32);
				}
				str=str+ch[j];
			}
			str=str+" ";
		}
		
		System.out.println(str);
	}

}
