
public class Sample {

	public static void main(String[] args) {
		
		
		int r=0; 
		int n=123;
		while (n != 0)
		   {
		      r = r * 10;
		      r = r + n%10;
		      n       = n/10;
		   }
		System.out.println("Reversed value is::"+r);

	}

}
