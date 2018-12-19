package somepackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="cityc")
@SessionScoped
public class CityController{
	
	private String cityName = "Baltimore";
	private String nflTeam;
	private String mlbTeam;
	
	public String getNflTeam() {
		nflTeam = CityDatabase.CITY_LIST.get(cityName).getNflTeam();
		return nflTeam;
	}

	public void setNflTeam(String nflTeam) {
		this.nflTeam = nflTeam;
	}

	public String getMlbTeam() {
		mlbTeam = CityDatabase.CITY_LIST.get(cityName).getMlbTeam();
		return mlbTeam;
	}

	public void setMlbTeam(String mlbTeam) {
		this.mlbTeam = mlbTeam;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	private String[] cityList = new String[] {"Baltimore", "Washington DC", "Philadelphia"};

	public String[] getCityList() {
		return cityList;
	}
	
	
}
