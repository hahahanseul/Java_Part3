package model;

public class Account  {
	private int number;
	private String name;
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("口座番号："+number);
		System.out.println("口座名義："+name);
	}
}
