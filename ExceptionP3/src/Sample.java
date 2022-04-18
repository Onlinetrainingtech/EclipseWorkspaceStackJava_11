import java.util.InputMismatchException;
import java.util.Scanner;

class Foo
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		try
		{
		System.out.println("Enter the value is::");
		a=sc.nextInt();
		b=a/0;
		System.out.println("Your data is::"+a);
		System.out.println("Your data is::"+b);
		}
		catch(ArithmeticException t1)
		{
			System.out.println("This is ArithmeticException..");
		}
		catch(InputMismatchException t2)
		{
			System.out.println("This is input mismatch Exception..");
		}
		finally
		{
			System.out.println("finally block..");
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo s1=new Foo();
		s1.get1();

	}

}
