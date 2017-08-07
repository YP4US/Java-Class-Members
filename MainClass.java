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
	double j=15.51;					//non-static data member
	void print()					//non-static function member
	{
		System.out.println("Running print() method of class Example.....");
	}
}

//Main class
class MainClass
{
	public static void main(String args[])
	{
		System.out.println("Program started....");

		//Creating Instance of Demo and Example class
		Demo d1=new Demo();
		Example e1=new Example();

		//Accessing members of the class
		System.out.println("Value of k is:"+d1.k);
		System.out.println("Value of j is:"+e1.j);
		d1.disp();
		e1.print();
		System.out.println("Program ended......");
	}
}