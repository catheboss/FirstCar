interface Engine{
	void cylinders(int cyl);
	void engine_size(int es);
	void engine_type(String et);
	void engine_power(double power);
}

public class Car extends Vehicle implements Engine {

	int cyl;
	String et;
	double power;
	int es;
	Car(String model, String manufacturer, int capacity, String tyre_size, double mileage, String fuel_type,
			int year_of_manufacture) {
		this.set_model(model);
		this.set_manufacturer(manufacturer);
		this.set_capacity(capacity);
		this.set_tyre_size(tyre_size);
		this.set_mileage(mileage);
		this.set_fuel(fuel_type);
		this.set_year(year_of_manufacture);
	}

	public void cylinders(int cyl)
	{
		this.cyl=cyl;
	}
	public void engine_type(String et)
	{
		this.et=et;
	}
	public void engine_power(double power)
	{
		this.power=power;
	}
	public void engine_size(int es)
	{
		this.es=es;
	}

	protected void start() {
		
		System.out.println("\nCar: " + this.get_model()+"\nManufacturer: "+ this.get_manufacturer()+"\nYear Of Manufacture: " + this.get_year());
		System.out.println("\nEngine Performance: \n"+"Size: "+es+"(in cc)\nPower: "+power+"(in bhp)\nNo. of Cylinders: "+cyl+"\nType: "+et);
		System.out.println("\nFuelType: " + this.get_fuel()+ "\nSeat Capacity: "+ this.get_capacity() + "\nMileage: " + this.get_mileage()+"(in km/l)\nTyre Size: "+this.get_tyre_size());
	}
}
