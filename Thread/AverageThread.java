package task;


class Subject extends Thread
{
	public void run()
	{
		int[]subject=new int[5];
		subject[0]=55;
		subject[1]=78;
		subject[2]=85;
		subject[3]=60;
		subject[4]=95;
		int sum=subject[0]+subject[1]+subject[2]+subject[3]+subject[4];
		System.out.println("total value:"+sum);
		float average =sum/subject.length;
		System.out.println("Average value :"+average);
	}
	
}

public class AverageThread {

	public static void main(String[] args) {
		Subject t1=new Subject();
		t1.start();

	}

}
