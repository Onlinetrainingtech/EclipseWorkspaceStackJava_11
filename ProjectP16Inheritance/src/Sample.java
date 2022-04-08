class B
{
	int pid=1001;
	void get1()
	{
		System.out.println("This is base class"+pid);
	}
}

class D extends B
{
	int cid=2001;
	String cname="mobile";
	void get2()
	{
		System.out.println("This is der class"+pid);
	}
}
class D2 extends D
{
	void get3()
	{
		System.out.println("This is D2 class:"+cid+""+cname);
	}
}




public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
