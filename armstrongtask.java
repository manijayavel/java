package javaprogramming;
import java.util.*;

public class armstrongtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int n1=n;
		int l,result=0;
		while(n>0)
		{
			l=n%10;
			result+=l*l*l;
			n=n/10;
		}
		if(n1==result)
		{
			System.out.println("it is an armstrong number");
		}
		else
		{
			System.out.println("no armstrong number");
		}
		

	}

}
