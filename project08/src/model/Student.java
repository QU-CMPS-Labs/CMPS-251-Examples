package model;

public class Student extends Person {
	private String major;

	public Student(String name, int id, String major) {
		super(name, id);
		this.major = major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	@Override
	public String toString() {
		return "Student [ " + super.toString() + "," + major + "]";
	}

}
