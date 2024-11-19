package javaprogramming;
import java.util.*;

public class armstrongtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int tem;
		int check=0;
		while(num<0)
		{
			tem=num%10;
			check=check+(tem*tem*tem);
			num=num/10;
		}
		if(num==num)
		{
			System.out.println("it is an armstrong number");
		}
		else
		{
			System.out.println("no armstrong number");
		}
		

	}

}
