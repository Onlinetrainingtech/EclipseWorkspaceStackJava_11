import java.util.Scanner;

class Demo
{
	int empid[][]=new int[2][2];
	int n,m;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is::");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	
	void process()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter the array value is::");
				empid[i][j]=sc.nextInt();
			}
		}
	}
	void display()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("Your Array value is::"+empid[i][j]);
			}
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		
		Demo g1=new Demo();
		g1.input();
		g1.process();
		g1.display();

	}

}
