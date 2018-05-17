
public class Trimsample {
	public static void main(String[] args) {
		// " Duke "の文字列を保持するStringオブジェクトを1個作成
		// str1に代入
		String str1 = " Duke ";
		// " Duke "の文字列から空白を取り除いたStringオブジェクトを1個新たに作成
		// str2に代入
		String str2 = str1.trim();

		System.out.println("str1 == str2:" +str1 == str2);
	}
}
