package model;
/**
 * @author Hanseul Kim
 * */
public class BirthdayGift extends Gift {
	public BirthdayGift(int code, String name) {
		super(code, name);
	}

	@Override
	public void displayGift() {
		System.out.println("<バースデーギフト>");
		super.displayGift();
	}
}
