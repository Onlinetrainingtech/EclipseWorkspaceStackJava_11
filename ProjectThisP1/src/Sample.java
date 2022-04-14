class Demo
{
	
	String p1;
	int p2;
	void get1(String p1,int p2)
	{
		this.p1=p1;
		this.p2=p2;
		System.out.println("YourPname get1 is::"+p1+""+p2);
	}
	void get2()
	{
		System.out.println("YourPname get2 is::"+p1+""+p2);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		g1.get1("azar",1001);
		g1.get2();

	}

}
