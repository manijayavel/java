package task;

public class copyarr {

	public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20};
	int[]a1=new int[a.length];
	int k=0;
	for(int i=0;i<a.length;i++) {
		a1[k]=a[i];
		k++;
	}
	for(int j=0;j<a1.length;j++)
	{
		System.out.println(a1[j]);
	}

	
	}
}
