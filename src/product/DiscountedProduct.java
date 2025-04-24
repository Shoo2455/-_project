package product;

public class DiscountedProduct extends Product {
	//割引率
	private double discountRate;

	//コンストラクタ
	public DiscountedProduct(int id, String name, int price, int stock, double discountRate) {
		super(id, name, price, stock);

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
	    double discountedPrice = calculateDiscountedPrice(); 
	    return super.toString() + ", 割引率=" + discountRate + ", 割引後価格=" + discountedPrice;
	}

	//割引価格を計算するメソッド
	public double calculateDiscountedPrice() {
		return getPrice() * (1 - discountRate); // 定価 × (1 - 割引率) で割引後価格を計算
	}

}
