package comment;
public class Product {
	private String name;
	private int price;

	/**
	 * コンストラクタ
	 * @param name 商品名
	 * @param price 価格
	 */
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
