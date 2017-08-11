//To elucidate and expound that we can pass instance of any class to any Class type argument of method of any class
//Nmae: Yogesh Pawar	Date:11/08/2017

class Demo1
{
	int k=11;
	void test()
	{
		System.out.println("Running test() of Demo1 class.....");
	}

}

class Demo2
{
	void execution(Demo1 d1)
	{
		System.out.println("Running execution method of Demo2 class....");
		System.out.println("Value of d1 is:"+d1);
		System.out.println("K value is:"+d1.k);
	}
}

class MainClass5
{
	public static void main(String arg[])
	{
		Demo2 dd2=new Demo2();
		dd2.execution(new Demo1());
	}
}