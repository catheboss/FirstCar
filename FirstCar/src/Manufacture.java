
public class Manufacture {
	private String model;
	private String manufacturer;
	private int year_of_manufacture;
	
	public void set_model(String model) {
		this.model = model;
	}

	public String get_model() {
		return model;
	}

	public void set_manufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String get_manufacturer() {
		return manufacturer;
	}

	public void set_year(int year) {
		this.year_of_manufacture = year;
	}

	public int get_year() {
		return year_of_manufacture;
	}
}
