package comment;
import java.util.ArrayList;

import model.BirthdayGift;
import model.Gift;
import model.WeddingGift;
class Example342 {
	public static void main(String[] args) {
		// BirthdayGiftオブジェクトをインスタンス化して、ざっくりGiftと見なす。
		Gift gift1 = new BirthdayGift(5523, "リストウォッチ");
		// WeddingGiftオブジェクトをインスタンス化して、ざっくりGiftと見なす。
		Gift gift2 = new WeddingGift(1122, "ティーカップ");
		// Gift専用のArrayListを作成。
		ArrayList<Gift> list = new ArrayList<Gift>();
		// gift1,2をadd。gift1,2はざっくりとGiftとして認識しているので、ArrayListにそのまま代入出来る。
		list.add(gift1);
		list.add(gift2);
		// ArrayListから全要素を取得。実体はBirthdayGift、WeddingGiftだが、ざっくりとGiftとして扱う。
		// よってGift型変数giftで受け取ることが出来る。
		for(Gift gift : list) {
			// Giftとして受け取っているが、実体はBirthdayGift、WeddingGiftなので、実行されるメソッドは
			// 各クラスでoverrideしたそれぞれのメソッド。
			gift.displayGift();
		}
	}
}
