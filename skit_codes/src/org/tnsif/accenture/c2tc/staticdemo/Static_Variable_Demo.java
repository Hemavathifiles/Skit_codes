package org.tnsif.accenture.c2tc.staticdemo;
//social media app(instagram)
class User2
{
	String username;
	static String appName="Instaclone";
	
	User2(String username)
	{
		this.username=username;
	}
	void showDetails()
	{
		System.out.println("User : "+username+"   App :"+appName);
	}
}
public class Static_Variable_Demo {

	public static void main(String[] args) {
		User2 obj=new User2("Vineeth");
		User2 obj1=new User2("Aman");
		User2 obj2=new User2("shilpa");
		
		obj.showDetails();
		obj1.showDetails();
		obj2.showDetails();
	}

}
