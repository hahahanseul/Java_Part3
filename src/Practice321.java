import java.util.Scanner;

import model.Development;

/**
 * @author Hanseul Kim
 * */
public class Practice321 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("社員ID＞");
			int id = sc.nextInt();
			System.out.print("社員名＞");
			String name = sc.next();
			System.out.print("プロジェクト名＞");
			String project = sc.next();
			Development dev = new Development();

			dev.setId(id);
			dev.setName(name);
			dev.setProject(project);
			dev.display();
			sc.close();
		} catch (Exception e) {
			System.out.println("エラーが発生しました！");
		}

	}
}
