package model;

public class Member {
	private int no;
	private String name;

	/**
	 * コンストラクタ(スーパークラス)
	 * @param no 会員版棒
 	 * @param name 会員名
	 * */
	//　呼び出すときは、引数の形を同じにする必要がある。
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public void display() {
		System.out.println("会員番号　：" + no);
		System.out.println("会員名　　：" + name);
	}

}
