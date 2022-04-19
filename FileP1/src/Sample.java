import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
	void writeData() throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("D:\\abc1.txt"))
		{
			int i;
			String name="mohamed";
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("FileInserted...");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\abc1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t1)
		{
			System.out.println(t1);
		}
	}
	void copyData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\abc1.txt");
			FileOutputStream fos=new FileOutputStream("D:\\abc2.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((byte)i);
				//System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t1)
		{
			System.out.println(t1);
		}
	}
	void readtwoData() throws IOException
	{
		try
		{
			FileInputStream fis1=new FileInputStream("D:\\abc1.txt");
			FileInputStream fis2=new FileInputStream("D:\\abc2.txt");
			SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
			int i;
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t1)
		{
			System.out.println(t1);
		}
	}
	void filewriterp1() throws IOException
	{
		try
		{
			FileWriter fw=new FileWriter("D:\\abc3.txt");
			fw.write("Haihowareyou");
			System.out.println("FileInserted..");
			fw.close();
		}
		catch(FileNotFoundException t)
		{
			
		}
		
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo g1=new Demo();
		//g1.writeData();
		//g1.readData();
		//g1.copyData();
		//g1.readtwoData();
		g1.filewriterp1();

	}

}
