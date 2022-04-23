import java.io.FileNotFoundException;
import java.lang.*;
class Demo
{
	void get1()
	{
		try
		{
		String name=null;
		System.out.println(name.length());
		
		}
		catch(NullPointerException t)
		{
			
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 function..");
	}
}
public class Sample {

	public static void main(String[] args) {
		Demo f1=new Demo();
		f1.get1();

	}

}
