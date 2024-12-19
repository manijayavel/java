package task;

class Even extends Thread{
	public void run() {
		System.out.println("even number:");
		for(int i=0;i<=20;i++)
		{
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
class Odd extends Thread{
	public void run()
	{
		System.out.println("odd number:");
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}

public class EvenOdd {

	public static void main(String[] args) {
		Even t1=new Even();
		Odd t2=new Odd();
		t1.start();
		t2.start();
	}

}
