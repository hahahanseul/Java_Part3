import model.Textbook;

public class Example332 {
	public static void main(String[] args) {
		System.out.println("<書籍情報>");
		Textbook text = new Textbook("みんなのjava", 3000);
		text.printTitle();
		text.printPrice();
	}
}
