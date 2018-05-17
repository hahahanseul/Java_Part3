package comment;
import java.util.Scanner;

import model.LimitedProduct;
class Practice322 {
	public static void main(String[] args) {
		try {
			// 入力値を取得
			Scanner sc = new Scanner(System.in);
			System.out.print("製品名　 > ");
			String name = sc.next();
			System.out.print("価格　　 > ");
			int price = sc.nextInt();
			System.out.print("限定数量 > ");
			int quantity = sc.nextInt();

			// LimitedProductクラスのオブジェクト生成→コンストラクタ呼び出し
			LimitedProduct lim = new LimitedProduct(name, price, quantity);
			lim.display();
			sc.close();
		} catch(Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}
}