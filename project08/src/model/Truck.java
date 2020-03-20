package model;

public class Truck extends Vehicle {

	private double load;

	public Truck() {

	}

	public Truck(double load) {
		this.load = load;
	}

	public double getLoad() {
		return load;
	}

	public void setLoad(double load) {
		this.load = load;
	}

	public double getWheelLoad() {
		return Double.valueOf(String.format("%.2f", (Double) (load + getWeight()) / getWheels()));
	}

	@Override
	public String toString() {
		return super.toString() + ", Load=" + getLoad() + ", Wheel-Load=" + getWheelLoad() + "]";
	}

	@Override
	public String getAsCSV() {

		return super.getAsCSV() + "," + load;
	}

}
