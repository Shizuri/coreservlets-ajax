package somepackage;

public class City {

	private String name, nflTeam, mlbTeam;

	@Override
	public String toString() {
		return "City [name=" + name + ", nflTeam=" + nflTeam + ", mlbTeam=" + mlbTeam + "]";
	}

	public City(String name, String nflTeam, String mlbTeam) {
		super();
		this.name = name;
		this.nflTeam = nflTeam;
		this.mlbTeam = mlbTeam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
}
