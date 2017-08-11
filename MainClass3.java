//to expound that we can pass instance of a class to Class type variable
//Nmae: Yogesh Pawar	Date:11/08/2017
class Demo1
{
	int k=11;
	void test()
	{
		System.out.println("Running test() of demo1...");
	}	
	
}

class MainClass3
{

	static void execution(Demo1 arg)
	{
		System.out.println("arg value is:"+arg);
		System.out.println("K value is:"+arg.k);
	}

	public static void main(String arg[])
	{
	execution(new Demo1());

	} 
}