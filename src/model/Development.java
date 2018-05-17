package model;

/**
 * @author Hanseul Kim
 * */
public class Development extends Employee {
	private String project;

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("プロジェクト名：" + project);
	}

}
