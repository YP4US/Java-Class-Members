/*Accessing non-static variable by creating instance of the class*/
//Name: Yogesh Pawar

//Functional class
class Demo
{
	int k=10;						//non-static data member
	void disp()						//non-static function member
	{
		System.out.println("Running disp() method of class Demo1......");
	}



}

//Functional class
class Example
{
	double j=15.51;				//non-static data member
	
	void print(Demo d1)					//non-static function member
	{
		System.out.println("Running print() method of class Example.....");
		d1.disp();
	}
	
}

//Main class
class MainClass2
{
	public static void main(String args[])
	{
		System.out.println("Program started....");

		//Creating Instance of Demo and Example class
		Demo d1=new Demo();
		Example e1=new Example();
		System.out.println("Value of k is:"+d1.k);
		System.out.println("Value of j is:"+e1.j);
		e1.print(d1);
		System.out.println("Program ended......");
	}
}