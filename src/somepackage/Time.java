package somepackage;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Time {
	
	private String date = new Date().toString();

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
