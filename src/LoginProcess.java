/**
 * @author Hanseul Kim
 * */
public class LoginProcess extends BasicProcess {
	@Override
	public void action() {
		System.out.println("[ユーザーデータ読込み]");
	}

	public void loginAction(String id, String pass) {
		System.out.println("ID：" + id + ", " + "PASS：" + pass);
		System.out.println("[ログイン成功]");
	}
}
