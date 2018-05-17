package model;
/**
 * @author Hanseul Kim
 * */
public class Phone implements MobilePhone {
	private String address;

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void email() {
		System.out.println("メールを送信しました。");
		System.out.println("To：" + address);
	}

}
