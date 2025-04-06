package Pattern;

public class Pattern21 {

	public static void main(String[] args) {
		
		int ch=65;
		for(int i=1;i<=9;i++)
		{
			int flag=1;
			for(int j=1;j<=9;j++)
			{
				if(i<=5)
				{
					if(j<=4+i && j>=6-i)
					{
						if(flag==1)
						{
							System.out.printf("%c",ch++);
							flag=0;
						}
						else
						{
							System.out.print(" ");
							flag=1;
						}
					}
					else
					{
						System.out.print(" ");
					}
						
				}
				else
				{
					//ch=74-i;
					if(j>=i-4 && j<=14-i)
					{
						if(flag==1)
						{
							System.out.printf("%c",74-i);
							flag=0;
						}
						else
						{
							System.out.print(" ");
							flag=1;
						}
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
