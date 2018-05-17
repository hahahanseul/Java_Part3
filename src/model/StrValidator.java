package model;

public class StrValidator implements BaseValidator{

	@Override
	public void checkData(String data) {
		if(data.length()<=MAX_INTEGER) {
			System.out.println("文字数OK");
		}else{
			System.out.println("文字数NG");
		}
	}

}
