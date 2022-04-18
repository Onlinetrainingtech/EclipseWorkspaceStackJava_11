class Demo
{
	void get1()throws NullPointerException
	{
		
		String name="null";
		System.out.println("length of the String::"+name.length());
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
