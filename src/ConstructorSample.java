
class Super{
	public Super() {
		System.out.println("super");
	}
	// コンストラクタが一つも定義されていないとき、デフォルトコンストラクタが自動的に追加される
//	Super(){

//	}
}

class Sub extends Super{
	public Sub() {
		// ↓下記の様に、super()を書いてもコンパイルエラーにならないのは、
		// superクラスに、デフォルトコンストラクタが追加され、それを呼び出しているため。
		super();
		System.out.println("sub");
	}

}

class ConstructorSample {
	public static void main(String[] args) {

	}
}