package product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

	private List<DiscountedProduct> products;

	public ProductManager() {
		this.products = new ArrayList<>();
	}

	//addProduct
	public void addProduct(DiscountedProduct product) {
		products.add(product);
	}

	//removeProduct
	public boolean removeProduct(int id) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getId() == id) {
				products.remove(i);
				return true;
			}
		}
		return false;
	}

	//getProductByName
	public DiscountedProduct getProductByName(String name) {
		for (DiscountedProduct product : products) {
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}

	//*⑤週目課題
	////割引価格を計算するメソッド
	public double calculateDiscountedPrice(double getPrice, double discountRate) {
		return getPrice * (1 - discountRate);
	}

	// searchableインターフェース
	public Product search(String keyword) {
		for (Product product : products) { 
			if (product.getName().contains(keyword)) { 
				return product; 
			}
		}
		return null;
	}

	public List<DiscountedProduct> getAllProducts() {
		return products;

	}

}