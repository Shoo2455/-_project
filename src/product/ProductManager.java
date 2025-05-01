package product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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

	//⑥週目課題
	//1:商品追加メソッド
	public void registerProduct(Scanner scanner) {
		try {

			System.out.println("商品IDを入力してください: ");
			int id = Integer.parseInt(scanner.nextLine());
			System.out.println("入力された商品ID:" + id);

			System.out.println("商品名を入力してください: ");
			String name = scanner.nextLine();
			validateProductName(name);
			System.out.println("入力された商品名:" + name);

			System.out.println("価格を入力してください: ");
			int price = validatePrice(scanner.nextLine());
			System.out.println("入力された価格:" + price);

			System.out.println("在庫数を入力してください: ");
			int stock = validateStock(scanner.nextLine());
			System.out.println("入力された在庫:" + stock);

			products.add(new Product(id, name, price, stock));
			System.out.println(
					"Product: id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "を登録しました。");
		} catch (NumberFormatException e) {
			System.out.println("入力エラー: " + e.getMessage());
		}
	}

	// 商品名チェック
	private void validateProductName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("無効な入力です。商品名を正しく入力してください。");
		}
	}

	// 価格チェック
	private int validatePrice(String input) {
		try {
			int price = Integer.parseInt(input);
			if (price < 0) {
				throw new IllegalArgumentException("無効な入力です。価格を正しく入力してください。");
			}
			return price;
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("無効な入力です。価格は数字で入力してください。");
		}
	}

	// 在庫数チェック
	private int validateStock(String input) {
		try {
			int stock = Integer.parseInt(input);
			if (stock < 0) {
				throw new IllegalArgumentException("無効な入力です。在庫を正しく入力してください。");
			}
			return stock;
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("無効な入力です。在庫数は数字で入力してください。");
		}
	}

	//2:商品情報取得メソッド
	public void getProductInfo(Scanner scanner) {
		System.out.println("商品情報を取得する商品名を入力してください: ");
		String keyword = scanner.nextLine();
		boolean found = false;

		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(keyword)) {
				System.out.println("取得した商品は、product: id=" + product.getId() + ", name=" + product.getName() + ", price="
						+ product.getPrice() + ", stock=" + product.getStock() + "です。");
				found = true;
			}
		}

		if (!found) {
			System.out.println("商品が見つかりませんでした。");
		}
	}

	//3:商品検索メソッド
	public void searchProduct(Scanner scanner) {
		System.out.println("検索する商品名を入力してください: ");
		String keyword = scanner.nextLine();
		boolean found = false;

		for (Product product : products) {
			if (product.getName().contains(keyword)) {
				System.out.println(product);
				found = true;
			}
		}

		if (!found) {
			System.out.println("商品が見つかりませんでした。");
		}
	}

	//4:商品全て表示メソッド
	public void showProducts(Scanner scanner) {
		if (products.isEmpty()) {
			System.out.println("まだ商品は登録されていません。");
		} else {
			System.out.println("商品を全て表示します");
			for (Product product : products) {
				System.out.println(product);
			}
		}
	}

	//5:商品削除メソッド
	public void deleteProduct(Scanner scanner) {
		System.out.println("削除する商品のIDを入力してください: ");
		try {
			int targetId = Integer.parseInt(scanner.nextLine());
			Iterator<Product> iterator = products.iterator();
			boolean deleted = false;

			while (iterator.hasNext()) {
				Product product = iterator.next();
				if (product.getId() == targetId) {
					iterator.remove();
					System.out.println("商品IDが" + targetId + "の商品を削除しました");
					deleted = true;
					break;
				}
			}

			if (!deleted) {
				System.out.println("指定された商品は見つかりませんでした。");
			}
		} catch (NumberFormatException e) {
			System.out.println("商品が見つかりませんでした。");
		}
	}
}