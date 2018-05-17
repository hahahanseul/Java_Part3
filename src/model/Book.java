package model;

public class Book implements ItemStandard {
	private int price;

	public Book(int price) {
		this.price = price;
	}
	// interfaceで定義された抽象メソッドを必ずoverrideすることを強制する
	// これによって、ItemStandardを実装したクラスが、printPriceメソッドをもっていることを保証
	// overrideする際には、必ずpublicと同等のアクセス修飾子をつける必要あり。
	@Override
	public void printPrice() {
		System.out.println("定価：" + price + "円");
	}

}
