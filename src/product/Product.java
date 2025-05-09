package product;

public class Product {

	//フィールド
	protected int id;
	protected String name;
	protected int price;
	protected int stock;

	//コンストラクタ
	public Product() {

	}

	public Product(int id, String name, int price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	//メソッド
	//idのgetter
	public int getId() {
		return this.id;
	}

	//idのsetter
	public void setId(int id) {
		this.id = id;
	}

	//nameのgetter
	public String getName() {
		return this.name;
	}

	//nameのsetter
	public void setName(String name) {
		this.name = name;
	}

	//priceのgetter
	public int getPrice() {
		return this.price;
	}

	//priceのsetter
	public void setPrice(int price) {
		this.price = price;
	}

	//stockのgetter
	public int getStock() {
		return this.stock;
	}

	//stockのsetter
	public void setStock(int stock) {
		this.stock = stock;
	}

	//オーバーライド
	@Override
	public String toString() {
		return "Product: id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock;
	}
}
