import java.util.HashMap;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		HashMap<String, Car> map = new HashMap<String, Car>();
		map = init();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the Vehicle:");
		String s = scan.nextLine();
		scan.close();
		if (map.containsKey(s)) {
			map.get(s).start();
		} else {
			System.out.println("Sorry model not available :(");
		}
	}

	private static HashMap<String, Car> init() {
		Car baleno = new Car("Baleno Zeta", "Maruti", 5, "195/55 R16", 22, "Petrol", 2017);
		baleno.cylinders(4);
		baleno.engine_type("1.2L VVT");
		baleno.engine_size(1197);
		baleno.engine_power(82.0);
		
		Car swift = new Car("Swift Dzire", "Maruti Suzuki", 5, "165/80 R14", 23.26, "Petrol", 2019);//1197
		swift.cylinders(4);
		swift.engine_type("1.2L DualJet");
		swift.engine_size(1197);
		swift.engine_power(89.0);
		
		Car city= new Car("Honda All New City","Honda Motor Company",5,"185/55 R16",24.1,"Diesel",2020);//1498
		city.cylinders(4);
		city.engine_type("1.5 i-DTEC");
		city.engine_size(1498);
		city.engine_power(98);
		
		HashMap<String, Car> map = new HashMap<String, Car>();
		map.put("Baleno", baleno);
		map.put("Swift", swift);
		map.put("Honda City", city);
		return map;
	}
}
