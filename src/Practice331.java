import java.util.Scanner;

import model.Phone;
/**
 * @author Hanseul Kim
 * */
public class Practice331 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("宛先　＞");
			String address = sc.next();
			Phone phone = new Phone();
			phone.setAddress(address);
			phone.email();
			sc.close();
		} catch (Exception e) {
			System.out.println("送信できませんでした！");
		}

	}
}
