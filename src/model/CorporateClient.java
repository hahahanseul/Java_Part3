package model;

public class CorporateClient extends Client {
	private String category;

	public void setCategory(String category) {
		this.category = category;
	}

	public void displayClient() {
		super.displayClient();
		System.out.println("業種　　　：" + category);
	}
}
