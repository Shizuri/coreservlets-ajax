package somepackage;

import java.util.LinkedHashMap;
import java.util.Map;

public class CityDatabase {

	public static Map<String, City> cityList = new LinkedHashMap<>();
	
	static {
		City c1 = new City("Baltimore", "Baltimore Ravens", "Baltimore Orioles");
		cityList.put(c1.getName(), c1);
		cityList.put("Washington DC", new City("Washington DC", "Washington Redskins", "Washington Nationals"));
		cityList.put("Philadelphia", new City("Philadelphia", "Philadelphia Eagles", "Philadelphia Phillies"));
	}
}
