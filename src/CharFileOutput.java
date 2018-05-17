import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharFileOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("出力ファイル名を入力；");
		String fileName;
		fileName = sc.next();
		String str = "Duke";
		FileWriter fw;
		BufferedWriter bw;
		try {
			// ノードストリームを生成
			// 書き込み対象ファイルへの道を作る。
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\出力用\\"+fileName);
			// フィルタストリームを生成
			// ちょっと複雑な書き込みを行うために、BufferedWriterクラスをnewする。
			// ノードストリームのインスタンスをBufferedWriterクラスのコンストラクタに渡す。
			bw = new BufferedWriter(fw);
			// "Duke"の0文字目から、文字列の長さ分書き出す。
			bw.write(str, 0, str.length());
			bw.newLine();
			// 書き込む内容を外部ファイル(result7-1.txtに書き出す。)
			bw.flush();
			// フィルタストリームを閉じて、外部ファイルとの連携を断つ
			// flushされてない書き出された内容があれば、強制的にflushを行う。
			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("入出力例外が発生しました。");
		}
		System.out.println("ファイル" + fileName + "に出力しました。");
		sc.close();
	}
}
