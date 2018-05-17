import model.CorporateClient;

public class UseCorporateClient {
	public static void main(String[] args) {
		CorporateClient client = new CorporateClient();
		client.setCode("C6701");
		client.setName("株式会社ゴザール");
		client.setCategory("製造業");
		client.displayClient();
	}
}
