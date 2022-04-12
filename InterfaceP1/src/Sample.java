
public interface Sample
{
	int empid=1001;
   public void get1();
}
interface Sample2 extends Sample
{
	public void get2();
}
class Foo implements  Sample2
{

	
	public void get1() {
		
		System.out.println("Welcome Interface..");
		
	}

	
	public void get2() {
		
		System.out.println("Welcome to get2 Interface method..");
		
	}
	
}
class Demo
{
	public static void main(String args[])
	{
		Foo g1=new Foo();
		g1.get1();
		g1.get2();
	}
}
