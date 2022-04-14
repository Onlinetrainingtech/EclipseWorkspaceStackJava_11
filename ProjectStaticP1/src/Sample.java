
public class Sample {

	static int a=10;
	void get1()
	{
		a++;
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.get1();
		Sample f2=new Sample();
		f2.get1();

	}

}
