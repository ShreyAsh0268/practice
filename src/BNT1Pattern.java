
public class BNT1Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i%2!=0)
				{
					if(j>=6-i && j<=4+i) 
					{
						if(j%2!=0)
						{
							System.out.print(no);
						}
						else
						{
							System.out.print(" ");
						}
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(j>=6-i && j<=4+i) 
					{
						if(j%2==0)
						{
							System.out.print(no);
						}
						else
						{
							System.out.print(" ");
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
