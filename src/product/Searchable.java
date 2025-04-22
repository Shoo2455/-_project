package product;

import java.util.List;
public interface Searchable {
	//searchメソッド
	List<DiscountedProduct> search(String keyword);
}
