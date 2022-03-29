class Product
{
	int pid=1001;//class or instance variable
	public void addProduct()
	{
		String pname="mobile";//local variable
		System.out.println("Welcome to addProduct function"+pid+""+pname);
	}
	public void viewDetails()
	{
		System.out.println("Welcome to viewProduct function"+pid);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.addProduct();
		p1.viewDetails();

	}

}
