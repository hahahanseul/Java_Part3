package comment;
public class LimitedProduct extends Product {
	private int quantity;

	/**
	 * コンストラクタ
	 * @param name 商品名
	 * @param price 価格
	 * @param quantity 数量
	 */
	public LimitedProduct(String name, int price, int quantity) {
		// Productクラスのコンストラクタを呼び出す。→インスタンス変数に値をセット
		super(name, price);
		// LimitedProductクラスのインスタンス変数に値をセット
		this.quantity = quantity;
	}
	public void display() {
		// Productオブジェクトにセットした値（name,price）を取得
		// ↓getNameはoverrideされていないメソッドなので、super.を省略出来る。
		String name = super.getName();
		int price = getPrice();
		// 取得してきた値を表示
		System.out.println("製品名　：" + name);
		System.out.println("価格　　：" + price + "円");
		System.out.println("限定数量：" + quantity + "個");
	}
}
