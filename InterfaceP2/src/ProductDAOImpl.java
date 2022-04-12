
public class ProductDAOImpl implements ProductDAO
{

	@Override
	public void addProduct() {
		
		System.out.println("This is add Product Modules..");
		
		
	}

	@Override
	public void viewProduct(ProductModel p) {
		
		System.out.println("This is view Product.."+p.getPid()+""+p.getPname());
		
	}
	
	
    
		
		
		

	

}
