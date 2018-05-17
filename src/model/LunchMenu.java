package model;

public class LunchMenu extends Menu {
	private String service;

	public void setService(String service) {
		this.service = service;
	}

	// オーバーライドをする際には、必ず、@Overrideアノテーションをつける
	@Override
	public void display() {
		super.display();
		System.out.println("サービス：" + service);
	}

}
