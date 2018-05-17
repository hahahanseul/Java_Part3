package model;

/**
 * @author Hanseul Kim
 * */
public class Employee {
	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("社員ID：" + id);
		System.out.println("社員名：" + name);
	}
}
