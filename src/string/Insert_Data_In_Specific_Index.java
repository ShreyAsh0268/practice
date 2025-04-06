package string;

import java.util.Scanner;

/*Q2. Java String Program to Insert a String into Another String

Input: originalString = "JavaLanguage", 
            stringToBeInserted = "is", 
            index = 4

Output: "JavaisLanguage"
*/
public class Insert_Data_In_Specific_Index {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str="JavaLanguage";
		
		System.out.println("Enter Index for add data");
		int ind=s.nextInt();
		s.nextLine();
		System.out.println("Enter Data");
		String data=s.nextLine();
		
		char ch[]=str.toCharArray();
		
		str="";
		
		for(int i=0;i<ch.length+1;i++) {
			if(i<ind) {
				str=str+ch[i];
			}
			else if(i>ind) {
				str=str+ch[i-1];
			}
			else {
				str=str+data;
			}
		}
		
		System.out.println(str);

	}

}
