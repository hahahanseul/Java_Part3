package comment;
/**
 * インターフェイス
 * このインターフェイスを実装するクラスが最低限、どんなメソッドをもっているべきかを定めたもの
 */
interface Animal{
	void run();
}
/**
 * 抽象クラス
 * 抽象メソッド（abstract method）と具象メソッド（concrete method）が混在出来る。
 * 抽象クラスは、抽象メソッドを含むため、new出来ない。
 * よってこの時点では、インターフェイスのメソッドをすべてoverrideする必要はない。
 */
abstract class Bird implements Animal{
	// 具象メソッド
	void fly() {
		System.out.println("飛ぶ");
	}
	// 抽象メソッド
	abstract void eat();
}
// 具象クラスになった時点で、全てのメソッドがoverrideされている必要がある。→抽象メソッドがなくなってnew出来る。
class Duck extends Bird{
	@Override
	public void run() {}
	@Override
	void eat() {}
}
public class AbstractMain {
	public static void main(String[] args) {
	}
}
