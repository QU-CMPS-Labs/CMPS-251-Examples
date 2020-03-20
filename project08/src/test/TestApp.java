package test;

import model.Employee;

public class TestApp {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setId(123);
		emp.setName("Khaled");
		emp.setNoOfChildren(10);
		
//		
//		System.out.println(emp.getName());
//		System.out.println(emp.getId());
//		System.out.println(emp.getNoOfChildren());
		
		Employee emp2= new Employee(124, "Ameen",1);
		
		System.out.println(emp.toString());
		System.out.println(emp2.toString());
		
		
	}
}
