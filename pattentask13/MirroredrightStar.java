package task;

public class MirroredrightStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=6;
		for(int i=1;i<=star;i++)
		{
			for(int j=star;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.print(" ");
	}

}
