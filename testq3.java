package javaprogramming;
import java.util.*;
public class testq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a weight");
		double weight=scan.nextDouble();
		System.out.println("enter a height");
		double height=scan.nextDouble();
		double bmi=weight/(height+height);
		System.out.println(bmi);
		if(bmi<18.5)
		{
			System.out.println("under weight");
		}
		else if(bmi>=18.5 && bmi<24.9)
		{
			System.out.println("you have normal weight");
		}
		else if(bmi>=25 && bmi<=29.9)
		{
		System.out.println("over weight");	
		}
		else
		{
			System.out.println("you ar observed");
		}
		

	}

}
