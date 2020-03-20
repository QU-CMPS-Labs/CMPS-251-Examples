package test;

import model.Student;

public class AppeTest {
	public static void main(String[] args) {
		Student s1 = new Student("Omar", 2000, "CSE");
		Student s2 = new Student("Ahmed", 2000, "CE");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
