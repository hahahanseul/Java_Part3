package model;
/**
 * @author Hanseul Kim
 * */
public class Gift {
	private int code;
	private String name;

	public Gift(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public void displayGift() {
		System.out.println("ギフトコード：" + code);
		System.out.println("ギフト名　　：" + name);
	}
}
