import java.util.*;

public class Vehicle extends Manufacture {
	private int capacity;
	private String tyre_size;
	private double mileage;
	private String fuel_type;
	private double power;

	public void set_capacity(int capacity) {
		this.capacity = capacity;
	}

	public int get_capacity() {
		return capacity;
	}

	public void set_tyre_size(String tyre_size) {
		this.tyre_size = tyre_size;
	}

	public String get_tyre_size() {
		return tyre_size;
	}

	public void set_mileage(double mileage) {
		this.mileage = mileage;
	}

	public double get_mileage() {
		return mileage;
	}

	public void set_fuel(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public String get_fuel() {
		return fuel_type;
	}
	
	public void set_power(double power) {
		this.power = power;
	}

	public double get_power() {
		return power;
	}
}
