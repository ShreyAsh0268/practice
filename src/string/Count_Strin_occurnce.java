package string;
import java.util.*;
public class Count_Strin_occurnce {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = s.nextLine();
		
		str=str.toLowerCase();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		int count=1;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==ch[i+1]) {
				count++;
			}
			else {
				if(count>1) {
					System.out.println(ch[i]+" = "+count);
					count=1;
				}
							}
		}

	}

}
