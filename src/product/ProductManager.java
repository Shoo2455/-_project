package product;

import java.util.ArrayList;

public class ProductManager {
	public static void ProductManager() {
		//addProduct
		ArrayList<String> product = new ArrayList<String>();
		product.add("Product : id=1, name=冷蔵庫, price=50000, stock=10");
		product.add("Product : id=2, name=ソファ, price=30000, stock=5");
		product.add("Product : id=3, name=米, price=2000, stock=3");
		product.add("Product : id=4, name=小説, price=1500, stock=4");
		product.add("Product : id=5, name=Tシャツ, price=1500, stock=5");

		System.out.println(product);

		//removeProduct
		product.remove(0);
		System.out.println(product);

		//getProductByName
		System.out.println(product.get(1));

	}
}