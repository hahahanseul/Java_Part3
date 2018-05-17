package model;

public class Sales extends Employee {
	private String area;

	public void setArea(String area) {
		this.area = area;
	}
	public void displaySales() {
		System.out.println("担当地域名：" + area);
	}
}
