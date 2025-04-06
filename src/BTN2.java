import java.util.*;
public class BTN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int nums[]= new int[6];
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=s.nextInt();
		}
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				for(int k=j+1;k<nums.length;k++)
				{
					int sum=nums[i]+nums[j]+nums[k];
					if(sum==0)
					{
						System.out.println(nums[i]+","+nums[j]+","+nums[k]);
					}
				}
			}
		}
	}

}
