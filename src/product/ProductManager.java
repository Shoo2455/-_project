package product;

import java.util.ArrayList;

public class ProductManager {
	public static void main(String[] args) {

		ArrayList<Product> id = new ArrayList<Product>();
		ArrayList<Product> name = new ArrayList<Product>();
		ArrayList<Product> price = new ArrayList<Product>();
		ArrayList<Product> stook = new ArrayList<Product>();
		
		//addProduct
		id.add(new Product("1"));
		id.add(new Product("2"));
		id.add(new Product("3"));
		id.add(new Product("4"));
		id.add(new Product("5"));

		name.add(new Product("冷蔵庫"));
		name.add(new Product("ソファ"));
		name.add(new Product("米"));
		name.add(new Product("小説"));
		name.add(new Product("Tシャツ"));

		price.add(new Product("50000"));
		price.add(new Product("30000"));
		price.add(new Product("2000"));
		price.add(new Product("1500"));
		price.add(new Product("1500"));

		stook.add(new Product("10"));
		stook.add(new Product("5"));
		stook.add(new Product("3"));
		stook.add(new Product("4"));
		stook.add(new Product("5"));

		 System.out.println("Product:"+id);
		
		//removeProduct
		id.remove(1);

		//getProductByName
		name.get(3);
		
	}
}