import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String endStr;
		endStr = new String("end");
		String str;
		System.out.print("文字列を入力（endで終了）：");
		str = sc.next();
		while(str.equals(endStr) != true) {
//		while(str.equals(endStr) == false)
//		while(!str.equals(endStr))
			System.out.print("文字列を入力（endで終了)：");
			str = sc.next();
		}
		sc.close();
	}
}
