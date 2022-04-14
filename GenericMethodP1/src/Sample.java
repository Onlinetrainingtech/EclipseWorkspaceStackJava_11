class Demo
{
	public <M>M test(M t)//public String test(String test)
	{
		return t;
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g=new Demo();
		System.out.println(g.test(1000000001));
		System.out.println(g.test("azar"));
		System.out.println(g.test(3.4));

	}

}
