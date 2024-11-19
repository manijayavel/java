package javaprogramming;
import java.util.*;
public class leapyeartask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int year=obj.nextInt();
		if((year%400==0)||(year%100!=0)&&(year%4==0))
{
	System.out.println("leap year");
}
else {
	System.out.println("not leao year");
}
		

	}

}
