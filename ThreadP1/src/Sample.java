import java.util.Scanner;

class Demo extends Thread
{
	int empid;
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		try
		{
			
		System.out.println("Welcome to run ..."+currentThread().getName());
		System.out.println("Get Priority.."+currentThread().getPriority());
		Thread.sleep(10000);
		System.out.println("Enter the value is::");
		empid=sc.nextInt();
		System.out.println("Your value is::"+empid);
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		get1();
	}
	void get1()
	{
		System.out.println("This is get1 value");
	}
}



public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.start();
		t1.setName("azar");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("ThreadInterrupted::"+t1.isInterrupted());
		System.out.println("ThreadAlive::"+t1.isAlive());
		//Demo t2=new Demo();
		//t2.start();

	}

}
