import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharFileInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("入力ファイル名を入力：");
		String fileName;
		fileName = sc.next();
		System.out.print("[ファイル"+fileName+"の内容]");
		FileReader fr;
		BufferedReader br;
		try {
			// 読み込み対象ファイルへの「道」を作る。
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String str;
			// 読み込み対象ファイルの1行分を文字列として取得する。
			// 何も取得できない場合は、nullが返却される。
			str = br.readLine();
			System.out.println(str);
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません。");
		} catch (IOException e) {
			System.out.println("入出力例外が発生しました。");
		}
		sc.close();
	}
}
