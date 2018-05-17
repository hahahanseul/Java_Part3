package model;

public class Textbook implements BookStandard {
	private String title;
	private int price;

	public Textbook(String title, int price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public void printTitle() {
		System.out.println("書籍名：" + title);

	}

	@Override
	public void printPrice() {
		System.out.println("定価　：" + price + "円");
	}

}
