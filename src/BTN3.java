import java.util.*;

public class BTN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		/*int num[];
		System.out.println("Enter Array");
		for(int i=0;i<num.length;i++)
		{
			num[i]=s.nextInt();
		}
		System.out.println("Enter value");
		int value=s.nextInt();*/
		
		int num[]= {3,2,2,3};
		int value=3;
		int num2[]=new int[num.length];
		for(int i=0;i<num.length;i++)
		{
			if(value!=num[i])
			{
				for(int j=0;j<num.length;j++)
				{
					num2[i]=num[i];
				}
			}
		}
		for(int i=0;i<num2.length;i++)
		{
			for(int j=i+1;j<num2.length;j++)
			{
				if(num2[i]==0)
				{
					int temp=num2[i];
					num2[i]=num2[j];
					num2[j]=temp;
				}
			}
			//System.out.print(num2[i]);
		}
		for(int i=0;i<num2.length;i++)
		{
			System.out.print(num2[i]);
		}
	}

}
