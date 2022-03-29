import java.util.Scanner;

class Employee
{
	int empid,salary;
	String empname;
	Scanner s1=new Scanner(System.in);
	void addStaff()
	{
		System.out.println("Enter the Empid::");
		empid=s1.nextInt();
		System.out.println("Enter the Salary::");
		salary=s1.nextInt();
		System.out.println("Enter the Name::");
		empname=s1.next();
	}
	void displayStaff()
	{
		System.out.println("Your Employee detail is:"+empid+""+salary+""+empname);
	}
}
public class Demo {

	public static void main(String[] args) {
		

		Employee f1=new Employee();
		f1.addStaff();
		f1.displayStaff();
		
	}

}
