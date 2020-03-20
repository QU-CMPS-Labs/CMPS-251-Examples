package test;

import model.Car;
import model.Truck;
import model.Vehicle;

public class VehicleTest {
	public static void main(String a[]) {
		Vehicle bicycle = new Vehicle(2, 20);
		
		Car sedan = new Car();
		Car toyota = new Car(4, 2000, 5);
		
		sedan.setWheels(4);
		sedan.setPassengers(4);
		sedan.setWeight(1500);
		
		System.out.println(bicycle);
		System.out.println(sedan);
		System.out.println(toyota);
		
		Truck volvo = new Truck();
		volvo.setWheels(23);
		volvo.setWeight(4000);
		volvo.setLoad(12000);
		
		System.out.println("\ntoString()\n");
		System.out.println(volvo.toString());
		
		System.out.println("\nCSV\n");
		System.out.println(volvo.getAsCSV());
	}
}
