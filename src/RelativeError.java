import java.util.Scanner;

public class RelativeError {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;
		System.out.print("真値を入力：");
		num1 = sc.nextDouble();

		double num2;
		System.out.print("計測値を入力：");
		num2 = sc.nextDouble();

		double error;
				//分子(真値－計測値)の絶対値/分母(真値の絶対値)
		error = Math.abs(num1 - num2) / Math.abs(num1);
		// errorの値を小数点以下2桁に
		System.out.printf("[相対誤差] %.2f\n", error);
		sc.close();

	}
}
