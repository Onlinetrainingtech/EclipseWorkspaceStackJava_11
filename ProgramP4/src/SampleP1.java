class Demo1
{
	void get1(int empid,String empname)
	{
		System.out.println("Your EmpId is::"+empid+"Your Empname"+empname);
	}
	void get2(int cid,String cname)
	{
		System.out.println("Your Cid is::"+cid+"Your cname"+cname);
	}
}



public class SampleP1 {

	public static void main(String[] args)
	{
		
		Demo1 f1=new Demo1();
		f1.get1(1001,"azar");//Argument Passing 
		f1.get2(2001,"mobile");

	}

}
