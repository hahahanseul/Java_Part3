import model.WebAccount;

class Example312 {

	public static void main(String[] args) {
		WebAccount webAc = new WebAccount();
		webAc.setNumber(1732050);
		webAc.setName("神保　三郎");
		webAc.display();
		webAc.setEmail("jinbo@java.co.jp");
		webAc.displayWebAccount();
	}

}
