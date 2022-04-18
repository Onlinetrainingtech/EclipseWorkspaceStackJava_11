class Demo
{
	void get1()
	{
		try
		{
	      int a=100/2;
	      System.out.println("This is a value is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println(t);
		}
	   
	   get2();	
	}
	void get2()
	{
		System.out.println("This is get2 functions..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
