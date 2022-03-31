import java.io.DataInputStream;
import java.io.IOException;

class DemoP1
{
	int cid;
	String cname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws  IOException
	{
		System.out.println("Enter the cid::");
		cid=Integer.parseInt(dis.readLine());
		System.out.println("Enter the cname::");
		cname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your Cid is::"+cid+"Your Cname:\t"+cname);
	}
}


public class SampleP1 {

	public static void main(String[] args) throws IOException {
		
		DemoP1 f=new DemoP1();
		f.input();
		f.display();

	}

}
