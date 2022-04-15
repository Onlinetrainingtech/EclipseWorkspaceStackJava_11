import java.util.ArrayDeque;

public class Sample {

	
	ArrayDeque<Integer>l1=new ArrayDeque<>();
	void get1()
	{
		
		
		l1.add(1001);
		l1.add(1002);
		l1.addFirst(2001);
		l1.addLast(2002);
		System.out.println("Your data is::"+l1);
		System.out.println("Remove the data is::"+l1.removeFirst());
		System.out.println("After Remove the data is::"+l1);
	}
	
	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.get1();
	}

}
