import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random rand;
		rand = new Random(System.currentTimeMillis());
		System.out.print("[擬似乱数]");
		int i;
		for (i = 0; i < 3; i++) {
			double num;
			num = rand.nextDouble();
			if(i==2) {
				System.out.print(num);
			}else {
				System.out.print(num + "、");
			}
		}
		System.out.println();
	}
}
