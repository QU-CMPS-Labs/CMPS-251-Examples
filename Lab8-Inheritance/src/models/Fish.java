package models;
//sub
//child
//fish is a animal

public class Fish extends Animal {
	private String gills;
	
	public Fish() {
		
	}
	public Fish(String type, int age , String gills) {
		super(type, age);
		this.gills = gills;
	}

	public String getGills() {
		return gills;
	}

	public void setGills(String gills) {
		this.gills = gills;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + "," + gills;
	}
	
}
