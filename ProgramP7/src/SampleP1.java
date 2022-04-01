import java.util.Scanner;

class DemoP1
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
		System.out.println("Enter the a and b value is::");
		
		a=sc.nextInt();
		
		b=sc.nextInt();
		
	}
	void calc()
	{
		/*System.out.println("Add::"+(a+b));
		System.out.println("Lessthan is::"+(a<b));
		System.out.println("Equalto is::"+(a==b));
		System.out.println("LogicalAND::"+((a>b)&&(b<a)));
		System.out.println("LogicalOR::"+((a<b)||(b>a)));
		System.out.println("LogicalNOT::"+!(a>b));
		System.out.println("BitWise::"+((a>b)&(b<a)));
		System.out.println("BitWiseAND::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));*/
		System.out.println("LeftShift::"+(a<<1));
	}
}
public class SampleP1 {

	public static void main(String[] args) {
		
		DemoP1 f1=new DemoP1();
		f1.get1();
		f1.calc();

	}

}
