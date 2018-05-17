package model;

public class WebAccount extends Account {
	private String email;

	public void setEmail(String email) {
		this.email = email;
	}

	public void displayWebAccount() {
		System.out.println("アドレス"+email);
	}
}
