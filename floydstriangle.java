package javaprogramming;
import java.util.*;
public class floydstriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberofrows;
		System.out.print("input number of rows");
		Scanner scan=new Scanner(System.in);
		numberofrows=scan.nextInt();
		int number=1;
		for(int row=1;row<=numberofrows;row++)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	}

}
