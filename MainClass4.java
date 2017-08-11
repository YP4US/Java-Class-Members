//to expound that we can pass instance variable as an argument to method
//Nmae: Yogesh Pawar	Date:11/08/2017

class Demo1
{
	int k=11;
	void test()
	{
		System.out.println("Running test() of class Demo1....");
	}
	
}

class MainClass4
{
		static void execution(Demo1 d1)
		{
			System.out.println("Running execution()...");
			System.out.println("d1 value is:"+d1);			//here dx and d1 will print same address as they are pointing same address
			System.out.println("K value is:"+d1.k);
			d1.test();
			d1.k=12;										//Re-assigning value of k
		}
		
		public static void main(String arg[])
		{
			Demo1 dx =new Demo1();
			execution(dx);
			System.out.println("dx value is:"+dx);         //here dx and d1 will print same address as they are pointing same address
			System.out.println("k value is:"+dx.k);
		}
}