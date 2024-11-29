package javaprogramming;
import java.util.*;
public class fulldimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,r;
		System.out.println("input number of rows(half of the dimond)");
		Scanner scan=new Scanner(System.in);
		r=scan.nextInt();
		//i-row(r),j-colum
		for(i=0;i<=r;i++)
		{
			for(j=1;j<r-i;j++)
				System.out.print(" ");//space
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");//printing **
			System.out.print("\n");//new line or next line =+
		}
		for(i=r-1;i>=1;i--)
		{
			for(j=1;j<r-i;j++)
				System.out.print(" ");//space
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");//printing **
			System.out.print("\n");//new line or next line =+
	}

}
}
