package string;

import java.util.Scanner;

/*.Find the First Non-Repeated Character  ?
Input: "swiss"
Output: 'w'*/
public class Find_First_Non_Repetade_Character_In_String {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = "swiss";
		
		char ch[]=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("First Non Repetade Character is = "+ch[i]);
				break;
			}
		}

	}

}
