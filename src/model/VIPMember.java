package model;

public class VIPMember extends Member {
	private int vipId;

	/**
	 * @param no 会員版棒
 	 * @param name 会員名
 	 * @param vipId VIP会員番号
	 * */

	public VIPMember(int no, String name, int vipId) {
		// スーパークラス(Member)のコンストラクタを呼び出す
		// 暗黙的にsuper();という、スーパークラスのコンストラクタ(引数なし)を自動的に追加する。
		// ↓は引数の形が合わないのでコンパイルエラーになる。
//		super();
//		super(no);
		// スーパークラスのコンストラクタを、引数もあわせて、処理の最初に1回だけ呼び出す必要がある。
		super(no, name);
		// インスタンス変数に代入
		this.vipId = vipId;
		// スーパークラスのコンストラクタを、何かの処理の後や、2回呼び出すのはNG！
//		super(no, name);
	}
	@Override
	public void display() {
		super.display();
		System.out.println("VIP会員ID：" + vipId);
	}
}
