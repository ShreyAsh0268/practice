import java.util.Arrays;

public class CheckAnagram {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str="listen";
			String str1="silent";
			
			boolean s=isAnagram(str1, str1);
			System.out.println(s);
		}
		public static boolean isAnagram(String str,String str1)
		{
			boolean flag=false;
			char ch[]=str.toCharArray();
			char ch1[]=str1.toCharArray();
			char temp=ch[0];
			for(int i=0;i<ch.length;i++)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]>ch[j])
					{
						temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
			}
			for(int i=0;i<ch1.length;i++)
			{
				for(int j=i+1;j<ch1.length;j++)
				{
					if(ch1[i]>ch1[j])
					{
						temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
				}
			}
			System.out.println(ch);
			System.out.println(ch1);
			if(ch.length!=ch1.length)
			{
				flag=false;
			}
			if(Arrays.equals(ch, ch1))
			{
				flag=true;
			}
		  return flag;
	}

}
