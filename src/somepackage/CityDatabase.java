package somepackage;

import java.util.LinkedHashMap;
import java.util.Map;

public class CityDatabase {

	public static final Map<String, City> CITY_LIST = new LinkedHashMap<>();
	
	static {
		City c1 = new City("Baltimore", "Baltimore Ravens", "Baltimore Orioles");
		CITY_LIST.put(c1.getName(), c1);
		CITY_LIST.put("Washington DC", new City("Washington DC", "Washington Redskins", "Washington Nationals"));
		CITY_LIST.put("Philadelphia", new City("Philadelphia", "Philadelphia Eagles", "Philadelphia Phillies"));
	}
}
