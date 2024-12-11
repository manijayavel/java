package javaprogramming;

public class Encpasulation {
	private String name;
	private int age;
	private int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
		else {
			System.out.println("age must be positive");
		}
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}

public static void main(String[]args)
{
	Encpasulation obj=new Encpasulation();
	obj.setName("mani");
	obj.setAge(16);
	obj.setRoll(1);
	System.out.println("name:" +obj.getName());
	System.out.println("age:" +obj.getAge());
	System.out.println("roll:"+obj.getRoll());
	
}
}
