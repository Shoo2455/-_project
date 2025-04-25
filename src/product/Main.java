package product;

import java.util.List;

public class Main {
	public static void main(String[] args) {

		ProductManager manager = new ProductManager();

		manager.addProduct(new DiscountedProduct(1, "冷蔵庫", 50000, 10, 0));
		manager.addProduct(new DiscountedProduct(2, "ソファ", 30000, 5, 0.3));
		manager.addProduct(new DiscountedProduct(3, "米", 2000, 3, 0));
		manager.addProduct(new DiscountedProduct(4, "小説", 1500, 4, 0));
		manager.addProduct(new DiscountedProduct(5, "Tシャツ", 1500, 5, 0));

		System.out.println("---商品を5つ追加して全てを表示する---");
		for (Product product : manager.getAllProducts()) {
			System.out.println(product);
		}

		manager.removeProduct(1);

		System.out.println("\n---商品を1つ削除して全てを表示する---");
		for (Product product : manager.getAllProducts()) {
			System.out.println(product);
		}

		System.out.println("\n---商品名「米」の情報を表示する---");
		Product rice = manager.getProductByName("米");
		if (rice != null) {
			System.out.println(rice);
		} else {
			System.out.println("商品「米」は見つかりませんでした。");
		}

		//⑤週目課題
		System.out.println("\n---商品名「ソファ」の情報と割引率30%の情報を表示する---");
		Product sofa = manager.getProductByName("ソファ");
		if (sofa != null) {
			System.out.println(sofa);
		}

		//Searchableメソッド
		System.out.println("\n---商品名「Tシャツ」を検索して表示する---");
		List<Product> product = manager.search("Tシャツ");
		if (product != null) {
			System.out.println(product);
		} else {
			System.out.println("商品「Tシャツ」は見つかりませんでした。");
		}
	}
}
