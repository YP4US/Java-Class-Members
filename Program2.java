//To elucidate that method can accept multiple arguments
//Name: Yogesh Pawar

import java.util.Scanner;

class Demo
{
	public void enterDetails(int age,int phone,String name, Scanner sc1)
	{
		System.out.println("Enter Your Name");
		name=sc1.next();
		System.out.println("Enter Your Phone Number");
		phone=sc1.nextInt();
		System.out.println("Enter Your age");
		age=sc1.nextInt();

		System.out.println("------------------------------");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phone Number is:"+phone);
		System.out.println("------------------------------");
	}

	
}

class Program2
{
	public static void main(String args[])
	{
		System.out.println("Program Started.....");
		Scanner sc1=new Scanner(System.in);
		int age=0,phone=0;
		String name="xyz";
		Demo d1=new Demo();
		d1.enterDetails(age,phone,name,sc1);
		
		System.out.println("Program Ended.......");

	}
}