import model.BaseValidator;
import model.StrValidator;

public class UseStrValidator {
	public static void main(String[] args) {
		String data = "qwerty";
		BaseValidator valid = new StrValidator();
		valid.checkData(data);
	}
}
