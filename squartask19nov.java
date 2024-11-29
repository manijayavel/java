package javaprogramming;
import java.util.*;
public class squartask19nov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a,cout=0;
		System.out.println("Enter a number");
		int num=obj.nextInt();
		System.out.println("the number is "+num);
		//int result=num*num;
			//System.out.println(num+"Square of number is"+" "+result);
		for(int i=1;i<=num;i++)
		{
		if(i*i==num) {
			System.out.println("the number is perfect Square");
		}
		else
		{
			System.out.println("the number is not perfect Square");
		}
	}

	}
	}


