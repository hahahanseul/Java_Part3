package model;
/**
 * @author Hanseul Kim
 * */
public class WeddingGift extends Gift {

	public WeddingGift(int code, String name) {
		super(code, name);
	}

	@Override
	public void displayGift() {
		System.out.println("<ウェディングギフト>");
		super.displayGift();
	}
}
