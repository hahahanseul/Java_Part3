package model;

public class Menu {
	private String name;
	private int price;

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void display() {
		System.out.println("品名　　：" + name);
		System.out.println("単価　　：" + price + "円");
	}

}
