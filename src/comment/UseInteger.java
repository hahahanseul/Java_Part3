package comment;
import java.util.ArrayList;

public class UseInteger {
	public static void main(String[] args) {
		// ArrayListは基本データ型を管理できない
		// Integer（int型のラッパークラス）型にすることで、代入可能
		// Integerは、整数値およびそれに関する、便利なメソッドをまとめたクラス
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
	}
}
