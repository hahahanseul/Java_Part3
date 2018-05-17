import java.util.Scanner;

import model.CellPhone;

/**
 * @author Hanseul Kim
 * */
public class Practice332 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("宛先　　＞");
			String address = sc.next();
			CellPhone phone = new CellPhone();
			phone.setAddress(address);
			phone.email();
			System.out.print("アドレス＞");
			String url = sc.next();
			phone.setURL(url);
			phone.webBrowser();
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}
	}
}
