package model;

public class Client {
	private String code;
	private String name;

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayClient() {
		System.out.println("顧客コード：" + code);
		System.out.println("顧客名　　：" + name);
	}

}
