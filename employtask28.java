package javaprogramming;

public class employtask28 {
	int id;
	String name;
	double salary;
	employtask28(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		}
	void display()
	{
		System.out.println("my id is " +id);
		System.out.println("my name is "+name);
		System.out.println("my salary is " +salary);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employtask28 e1=new employtask28(25,"mani",20000);
		employtask28 e2=new employtask28(26,"paul",15000);
		e1.display();
		System.out.println("employ 2");
		e2.display();
		
	}

}
