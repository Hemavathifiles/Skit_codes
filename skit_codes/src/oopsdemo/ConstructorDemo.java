package oopsdemo;

class User1
{
	String name;
	int age;
	
	User1() //default const
	{
		
	}
	User1(String name, int age) //parameterized const
	{
		this.name=name;
		this.age=age;
		System.out.println("User created :"+name+ "  Age :"+age);
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		User1 obj=new User1();
		User1 obj1=new User1("Alice",20);
		
	}

}
