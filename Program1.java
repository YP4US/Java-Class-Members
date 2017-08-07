//Main class and functional class
//Name: Yogesh Pawar

class Demo		//Functional class
{
	void method()
	{
		System.out.println("Running Functional class...");
	}

	
}
class Program1		//Main class
{
	public static void main(String args[])
	{
		System.out.println("Running main class....");
		Demo d1=new Demo();
		d1.method();
		//System.out.println("length of args is:"+args.length());

		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}


	}
}