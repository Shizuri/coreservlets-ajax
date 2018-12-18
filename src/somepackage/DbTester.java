package somepackage;

public class DbTester {

	public static void main(String[] args) {
		System.out.println("Name: Baltimore");
		System.out.println("NFL Team: " + CityDatabase.cityList.get("Baltimore").getNflTeam());
		System.out.println("MLB Team: " + CityDatabase.cityList.get("Baltimore").getMlbTeam());
		
		System.out.println();
		
		System.out.println("Name: Washington DC");
		System.out.println("NFL Team: " + CityDatabase.cityList.get("Washington DC").getNflTeam());
		System.out.println("MLB Team: " + CityDatabase.cityList.get("Washington DC").getMlbTeam());
	}
}
