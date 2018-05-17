package comment;
import model.WebAccount;
class Example312 {
	public static void main(String[] args) {
		// WebAccountインスタンスを1個生成
		// webAcへ代入
		WebAccount webAc = new WebAccount();
		// メソッドを呼び出す。サブクラスにはないので、スーパークラスから呼び出す。
		webAc.setNumber(1732050);
		webAc.setName("神保　三郎");
		webAc.display();
		// サブクラスメソッドの呼び出し
		webAc.setEmail("jinbo@java.co.jp");
		webAc.displayWebAccount();
	}
}
