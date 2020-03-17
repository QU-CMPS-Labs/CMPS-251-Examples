package models;
//super class
//parent

// private 1
// protected 2
// public 3
public class Animal {

	//protected and public
	
	private String type;
	private int age;

	public Animal() {
		
	}
	
	public Animal(String type, int age) {
		this.type = type;
		this.age = age;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {

		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	protected String getInfo() {
		return type + "," + age;
	}
}
