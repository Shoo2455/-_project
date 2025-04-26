package product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements Searchable {


	private List<Product> products;

	public ProductManager() {
		this.products = new ArrayList<>();
	}

	//addProduct
	public void addProduct(Product product) {
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
	public Product getProductByName(String name) {
		for (Product product : products) {
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}
	
	public List<Product> getAllProducts() {
		return products;

	}

	//*⑤週目課題
	// searchableインターフェース
	@Override
		public List<Product> search(String keyword) {
		List<Product> result = new ArrayList<>();
		
			for (Product product : products) {
				if (product.getName().contains(keyword)) {
					result.add(product);
				}
			}
			return result.isEmpty() ? null : result;
		}
	}