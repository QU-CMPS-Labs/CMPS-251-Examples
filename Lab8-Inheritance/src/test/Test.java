package test;

import models.Cat;
import models.Fish;

public class Test {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		fish.setType("Goldfish");
		fish.setAge(1);
		fish.setGills("Small Gills");
		
		
		Cat cat = new Cat();
		cat.setType("Bengal cat");
		cat.setAge(100);
		cat.setLungs("Small Lungs");
		
		System.out.println(fish.getInfo());
		System.out.println(cat.getInfo());
		
		Cat cat2 = new  Cat("Sahara", 2 ,"Big lungs");
		
		System.out.println(cat2.getInfo());
				
	}

}


//Gold Fish , 1 , Small lungs