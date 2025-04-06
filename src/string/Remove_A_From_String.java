package string;
import java.util.*;
public class Remove_A_From_String {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = s.nextLine();
		
		char ch[] = str.toCharArray();
		
		String str1 = "";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='a' && ch[i]!='A') {
				str1=str1+ch[i];
			}
		}
		
		System.out.println(str1);

	}

}
