class Parent {
	void methodA() {
		System.out.println("called Parent methodA");
	}
	void methodB() {
		System.out.println("called Parent methodB");
	}
}
class Child extends Parent {
	void methodB() {
		System.out.println("called Child methodB");
	}
	void methodC() {
		System.out.println("called Child methodC");
	}
}
class Execute {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.methodA();
		parent.methodB();
		// parentは、あくまでParent型のオブジェクトとして、認識しているので、Parentクラスに
		// 無いメソッドは、呼び出せない。
		//parent.methodC();

		// parentに格納されているオブジェクトを強制的にChild型に変換する（キャスト）
		// Child型のオブジェクトをChildとして認識できるので、methodCも呼び出せる。
		Child child = (Child)parent;
		child.methodA();
		child.methodB();
		child.methodC();

		// Parent型→Child型へのcastも文法上は可能（コンパイルはOK）
		// 左辺の型→どのメソッドを呼べるか決める。右辺の型が、そのメソッドがどんな処理行うか決める。
		Parent parent2 = new Parent();
		Child child2 = (Child)parent2;
		// Childと見なしているが、インスタンスの実体はParentなので、存在しないメソッドは呼び出せない。
		child2.methodA();
		child2.methodB();
		child2.methodC();
	}
}
