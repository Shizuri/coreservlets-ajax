package somepackage;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="cc")
@SessionScoped
public class CityController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cityName = "Baltimore";
	private String nflTeam = CityDatabase.cityList.get(cityName).getNflTeam();
	private String mlbTeam = CityDatabase.cityList.get(cityName).getMlbTeam();
	
	public String getNflTeam() {
		return nflTeam;
	}

	public void setNflTeam(String nflTeam) {
		this.nflTeam = nflTeam;
	}

	public String getMlbTeam() {
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
