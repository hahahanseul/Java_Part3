package comment;

public class UseCommandLineArgs {

					// コマンドライン引数が、ここにString型の配列として渡される。
	public static void main(String[] args) {
		// コマンドライン引数は、引数の個数に応じて、自動的にString型の配列に追加される。
		String str = args[0];
		System.out.println(str);
		String str2 = args[1];
		System.out.println(str2);
	}
}
