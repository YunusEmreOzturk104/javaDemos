package staticDemo;

public class ProductValidator {
	static {
		System.out.println("static blok �al��t�");
	}
	public ProductValidator(){
		System.out.println("Yap�c� blok �al��t�");
	}
	public boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public void bisey() {
		
	}
	public static class BaskaBirClass{//inner class
		public static void sil() {
			
		}
	}
}
