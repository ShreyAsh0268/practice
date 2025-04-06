/*
 * Q2) Write a Java program to move all zeros to the end of the array without changing the relative order of non-zero elements.

Example:
Input: [0, 1, 9, 0, 7, 3]  
  Output: [1, 9, 7, 3, 0, 0]

 */
import java.util.*;
public class Quation2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Elements");
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
