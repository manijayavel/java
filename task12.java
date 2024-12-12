package task;

public class task12 {

	public static void main(String[] args) {
		int sum=0;
		int avg;
		int[]a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println(avg);
	}

}
