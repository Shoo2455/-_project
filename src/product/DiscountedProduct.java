package product;

public class DiscountedProduct extends Product {
	//割引率
	private double discountRate;

	//コンストラクタ
	public DiscountedProduct(int id, String name, int price, int stock, double discountRate) {
		super(id, name, stock, stock);

		this.discountRate = discountRate;
	}

	public DiscountedProduct() {
	}

	//メソッド
	//getter
	public double getDiscountRate() {
		return this.discountRate;
	}

	//setter
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	//オーバーライド
	@Override
	public String toString() {
		return " DiscountedProduc: id= " + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", 割引率="
				+ discountRate;
	}

	//割引価格を計算するメソッド
	public double calculateDiscountedPrice() {
		return getPrice() * (1 - discountRate); // 定価 × (1 - 割引率) で割引後価格を計算
	}

}
