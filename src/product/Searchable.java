package product;

import java.util.List;

public interface Searchable {
	//searchメソッド
	List<Product> search(String keyword);
}
