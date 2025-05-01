package product;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ProductManager manager = new ProductManager();

		//manager.addProduct(new Product(1, "冷蔵庫", 50000, 10));
		//manager.addProduct(new DiscountedProduct(2, "ソファ", 30000, 5, 0.3));
		//manager.addProduct(new Product(3, "米", 2000, 3));
		//manager.addProduct(new Product(4, "小説", 1500, 4));
		//manager.addProduct(new Product(5, "Tシャツ", 1500, 5));

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
		
		
//⑥週目課題
        Scanner scanner = new Scanner(System.in);
		
		boolean running = true;
		
		while (running) {
			try {
				System.out.println("--メニュ---");
				System.out.println("1:商品追加");
				System.out.println("2:商品情報取得");
				System.out.println("3:商品検索");
				System.out.println("4:商品全て表示");
				System.out.println("5:商品削除");
				System.out.println("0:終了");
				
				System.out.println("\nメニューから操作を選択してください。");
				
				int choice = Integer.parseInt(scanner.nextLine());
				
				switch (choice) {
				case 1://商品追加
					manager.registerProduct(scanner);
					break;
					
				case 2://商品情報取得
					manager.getProductInfo(scanner);
					break;
					
				case 3://商品検索
					manager.searchProduct(scanner);
					break;
					
				case 4://商品全て表示
					manager.showProducts(scanner);
					break;
					
				case 5://商品削除
					manager.deleteProduct(scanner);
					break;
					
				case 0://終了
					running = false;
					System.out.println("終了します");
					break;
				default:
					System.out.println("\nメニューから操作を選択してください。");
				}
				
			} catch(NumberFormatException e) {
				System.out.println("無効な入力です。操作は数字で選択してください。");
			}
		}
		scanner.close();
	}
}
