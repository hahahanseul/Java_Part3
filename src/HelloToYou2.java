import java.util.Scanner;

public class HelloToYou2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String welStr;
		welStr = new String("さん、ようこうそJavaの世界へ！");
		String str;
		System.out.print("あなたのお名前は？：");
		str = sc.next();
		StringBuilder strBul;
		strBul = new StringBuilder(str);
		strBul.append(welStr);
		System.out.println(strBul);
		sc.close();

	}
}
