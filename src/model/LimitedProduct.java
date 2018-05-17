package model;

public class LimitedProduct extends Product {
	private int quantity;

	public LimitedProduct(String name, int price, int quantity) {
		// Productクラスのコンストラクタを呼び出す。→インスタンス変数に値をセット
		super(name, price);
		// LimitedProductクラスのインスタンス変数に値をセット
		this.quantity = quantity;
	}

	public void display() {
		//　Productオブジェクトにセットした値(name, price)を取得
		// ↓getName()は、overrideされていないメソッドなので、super.を省略出来る。
		// 여기에선 super생략 가능, 왜냐면 딱히 오버라이드된 게 없기 때문에 명시하지 않아도 상관 없, 타카사키상의 개취는 쓰는게 좋
		// 取得してきた値を表示
		System.out.println("製品名　：" + super.getName());
		System.out.println("価格　　：" + super.getPrice() + "円");
		System.out.println("限定数量：" + quantity + "個");
	}

}
