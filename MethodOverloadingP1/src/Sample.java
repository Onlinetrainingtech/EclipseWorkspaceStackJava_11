class Demo
{
	void get1(int pid,String pname)
	{
		System.out.println("Your Pid::"+pid+""+pname);
	}
	void get1(int cid)
	{
		System.out.println("Your cid::"+cid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		g1.get1(1001,"apple");
		g1.get1(2001);

	}

}
