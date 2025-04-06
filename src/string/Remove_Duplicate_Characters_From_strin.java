package string;

import java.util.Scanner;

/*5.Remove Duplicate Characters from a String
Input: "programming"
Output: "progamin"*/
public class Remove_Duplicate_Characters_From_strin {
	public static void main(String []args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str="programming";
		
		char ch[] = str.toCharArray();
		
		str="";
		
		boolean flag=true;
		
		for(int i=0;i<ch.length;i++) {
			
			
			if(str.indexOf(i)==-1) {
				str=str+ch[i];
			}
//			flag=true;
//			for(int j=i+1;j<ch.length;j++) {
//				
//				if(ch[i]==ch[j]) {
//					flag=false;
//					break;
//				}
//			}
//			if(flag==true) {
//				str=str+ch[i];
//			}
			
		}
		System.out.println(str);
	}
}
