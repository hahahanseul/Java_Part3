import model.LunchMenu;

public class Example321 {
	public static void main(String[] args) {
		//Menu lunchMe = new LunchMenu(); 도 가능해!!
		LunchMenu lunchMe = new LunchMenu();
		lunchMe.setName("チキンステーキ");
		lunchMe.setPrice(690);	
		lunchMe.setService("ドリンクバー");
		lunchMe.display();
	}
}
