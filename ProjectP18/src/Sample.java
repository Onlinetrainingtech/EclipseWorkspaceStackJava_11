class Demo
{
	Demo()
	{
		System.out.println("This is default cons..");
	}
	Demo(int empid)
	{
		System.out.println("This is param cons::"+empid);
	}
	void get1()
	{
		System.out.println("This is normal methods..");
	}
}



public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		new Demo(1001);
		g1.get1();

	}

}
