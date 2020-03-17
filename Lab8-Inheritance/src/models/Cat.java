package models;
//sub
//child
//cat is a animal
public class Cat extends Animal {
	private String lungs;
	
	public Cat(){
		
	}
	
	public Cat(String type, int age, String lungs) {
		super(type, age);
		this.lungs = lungs;
	}

	public String getLungs() {
		return lungs;
	}

	public void setLungs(String lungs) {
		this.lungs = lungs;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + "," + lungs;
	}

}
