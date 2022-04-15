import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample {

	
	HashSet<Integer>list1=new HashSet<>();
	//TreeSet<Integer>list1=new TreeSet<>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1003);
		
		Iterator<Integer>k1=list1.iterator();
		while(k1.hasNext())
		{
			System.out.println("Inside while loop::"+k1.next());
		}
		System.out.println("Searching the data is::"+list1.contains(1001));
		System.out.println("Remove the value is::"+list1.remove(1001));
		System.out.println("Total of value is::"+list1.size());
		System.out.println("Your value is::"+list1);
	}
	
	
	public static void main(String[] args) {
		
		Sample g1=new Sample();
		g1.get1();
	}

}
