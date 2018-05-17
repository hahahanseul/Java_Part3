package model;

public class IntValidator implements BaseValidator{

	@Override
	public void checkData(String data) {
		if(Integer.parseInt(data)<=MAX_INTEGER) {
			System.out.println("桁数OK");
		}else{
			System.out.println("桁数NG");
		}
	}

}
