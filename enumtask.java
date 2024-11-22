package javaprogramming;
import java.util.*;
public class enumtask {
	enum course{JAVA,AI,ML}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//passing array value into enum
		course[] presentcourse=course.values();
		for(course c:presentcourse)
		//String leo;
		//leo=scan.next(); 
		{
			switch(c)
			{
			case JAVA:
				System.out.println ("java is powerful");
				break;
			case AI:
				System.out.println("AI lead to IT impact");
				break;
			case ML:
				System.out.println("machine learning");
				break;
				default:
					System.out.println("enter correct string");
		}
		

	}

	}
}
