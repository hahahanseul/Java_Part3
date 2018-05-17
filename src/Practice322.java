import java.util.Scanner;

import model.LimitedProduct;

public class Practice322 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("製品名　＞");
			String name = sc.next();
			System.out.print("価格　　＞");
			int price = sc.nextInt();
			System.out.print("限定数量＞");
			int quantity = sc.nextInt();

			LimitedProduct lim = new LimitedProduct(name, price, quantity);
			lim.display();
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}

	}
}
