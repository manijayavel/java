package javaprogramming;
import java.util.*;
public class nestedcasetask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String course=scan.nextLine();
		switch(course)
		{
		case "python":
			System.out.println("python is a simple coding language");
			int version=scan.nextInt();
			switch(version)
			{case 1:
				System.out.println("old version");
				break;
			case 2:
				System.out.println("new version");
			
			}
				
			
		}

	}

}
