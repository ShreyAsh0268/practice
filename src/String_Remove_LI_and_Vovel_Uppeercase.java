import java.util.Scanner;

public class String_Remove_LI_and_Vovel_Uppeercase {
	public static void main(String x[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		String st="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='l' && ch[i]!='i'&& ch[i]!='L'&&ch[i]!='I')
			{
				st=st+ch[i];
			}
		}
		
		
		char ch1[]=st.toCharArray();
		String st1="";
		for(int i=0;i<ch1.length;i++)
		{char c;
			if(ch1[i]=='a' || ch1[i]=='e'|| ch1[i]=='o'||ch1[i]=='u')
			{
				c=(char) (ch1[i]-32);
				st1=st1+c;
			}
			else
			{
				st1=st1+ch1[i];
			}
		}
		
		System.out.println(st1);
	}

}
