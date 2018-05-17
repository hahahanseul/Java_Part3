/**
 * @author Hanseul Kim
 * */
public class MathExam1 {
	public static void main(String[] args) {
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		double big = Math.max(num1, num2);
		double small = Math.min(num1, num2);
		double result = Math.pow(big, small);

		System.out.printf("%.1fの方が大きいです。\n", big);
		System.out.printf("%.1fの方が小さいです。\n", small);
		System.out.printf("%.1fの%.1f乗は、%.1fです。\n", big, small, result);
		System.out.printf("%.1fに最も近い整数は%dです。\n", result, Math.round(result));
	}
}
