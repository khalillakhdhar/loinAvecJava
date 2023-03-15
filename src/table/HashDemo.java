package table;

import java.util.HashMap;

public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("USA"));
	}

}
