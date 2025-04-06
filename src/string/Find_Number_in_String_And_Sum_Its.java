package string;
/*Q1. WAP program input the string from keyboard and extract number from string and calculate its sum?
Example: abc123mno45stv
Output: Sum is 15
*/
import java.util.Scanner;

public class Find_Number_in_String_And_Sum_Its {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = "abc123mno45stv";
		
		char ch[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				sum=sum+ch[i]-48;
			}
			
		}
		System.out.println("Sum = "+sum);

	}

}
