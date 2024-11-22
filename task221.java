package javaprogramming;
import java.util.*;
public class task221 {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i+1;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	

}
