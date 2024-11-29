package javaprogramming;

import java.util.Scanner;

public class rightangletriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		System.out.print("input number of rows");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			System.out.println(" ");
			
		}
	}

}
