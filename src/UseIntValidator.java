import model.BaseValidator;
import model.IntValidator;

public class UseIntValidator {
	public static void main(String[] args) {
		String data = "1111";
		BaseValidator valid = new IntValidator();
		valid.checkData(data);

	}
}
