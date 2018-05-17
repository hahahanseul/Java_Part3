package model;

public interface ItemStandard {
	//定数→public stati finalという修飾子が勝手に付与される。
	double PI = 3.14;

	// 具体的な処理を持たない(抽象メソッド)
	// 引数、戻り値、メソッド名のみを示す。→具体的な処理は実装するクラスで定義
	// public abstractは、省略可能→勝手に全てのメソッドに付与される。
	abstract void printPrice();
}
