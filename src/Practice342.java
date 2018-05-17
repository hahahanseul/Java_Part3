import java.util.ArrayList;
import java.util.Scanner;

import model.BirthdayGift;
import model.Gift;
import model.WeddingGift;

/**
 * @author Hanseul Kim
 * */
public class Practice342 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("商品コード1＞");
			int code1 = sc.nextInt();
			System.out.print("商品名1　＞");
			String name1 = sc.next();
			Gift gift1 = new BirthdayGift(code1, name1);

			System.out.print("商品コード２＞");
			int code2 = sc.nextInt();
			System.out.print("商品名２　＞");
			String name2 = sc.next();
			Gift gift2 = new WeddingGift(code2, name2);

			System.out.print("商品コード３＞");
			int code3 = sc.nextInt();
			System.out.print("商品名３　＞");
			String name3 = sc.next();
			Gift gift3 = new BirthdayGift(code3, name3);

			ArrayList<Gift> list = new ArrayList<>();
			list.add(gift1);
			list.add(gift2);
			list.add(gift3);

			for (Gift gift : list) {
				gift.displayGift();
			}
			sc.close();

		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}

	}
}
