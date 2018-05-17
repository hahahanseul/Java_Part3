import model.Book;
import model.ItemStandard;

public class Example331 {
	public static void main(String[] args) {
		System.out.println("<書籍情報>");
		ItemStandard book = new Book(2500);
		book.printPrice();
	}
}
