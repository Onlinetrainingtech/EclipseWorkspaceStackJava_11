import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value::");
		n=sc.nextInt();
		for(int i=0;i<=n;i=i+1)
		{
			if(i%2==0)
			{
				System.out.println("Even::"+i);
			}
			else
			{
				System.out.println("Odd::"+i);
			}
			//System.out.println("I value is::"+i);
		}

	}

}
