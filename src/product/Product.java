package product;

public class Product {

	//フィールド
	int id;
	String name;
	int price;
	int stock;

	//コンストラクタ
	Product(String n) {
		name = n;
	}

	Product(String n, int i, int p, int s) {
		name = n;
		id = i;
		price = p;
		stock = s;
	}

	//メソッド(getter setter)

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
