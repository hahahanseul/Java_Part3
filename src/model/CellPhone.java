package model;

/**
 * @author Hanseul Kim
 * */
public class CellPhone implements SmartPhone {
	private String address;
	private String url;

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void email() {
		System.out.println("メールを送信しました。");
		System.out.println("To　：" + address);
	}

	@Override
	public void setURL(String url) {
		this.url = url;
	}

	@Override
	public void webBrowser() {
		System.out.println("Webページにアクセスしました。");
		System.out.println("URL：" + url);
	}

}
