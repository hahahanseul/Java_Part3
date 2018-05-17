import java.util.Scanner;

import model.Sales;

public class Practice312 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("社員ID＞");
			int id = sc.nextInt();
			System.out.print("社員名＞");
			String name = sc.next();
			System.out.print("担当地域名＞");
			String area = sc.next();

			Sales sal = new Sales();
			sal.setId(id);
			sal.setName(name);
			sal.display();
			sal.setArea(area);
			sal.displaySales();
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}




	}
}
