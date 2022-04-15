import java.util.HashMap;
import java.util.Map;

public class Sample {

	
	HashMap<Integer,String>l1=new HashMap<>();
	void get1()
	{
		l1.put(1001,"a");
		l1.put(1002,"b");
		l1.put(1003,"c");
		
		for(Map.Entry h1:l1.entrySet())//for each statement
		{
			System.out.println(h1.getKey());
			System.out.println(h1.getValue());
		}
		System.out.println("Size of data is::"+l1.size());
		System.out.println("Remove the data is::"+l1.remove(1001));
		System.out.println("After Removing to Search::"+l1.containsKey(1001));
		System.out.println("Your data is::"+l1);
	}
	
	public static void main(String[] args) {
		
		Sample g1=new Sample();
		g1.get1();

	}

}
