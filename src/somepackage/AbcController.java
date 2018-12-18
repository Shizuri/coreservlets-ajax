package somepackage;

import java.io.Serializable;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AbcController implements Serializable {

	private static final long serialVersionUID = 1L;
	private String page;

	public AbcController() {
		if (page == null) {
			page = "Page A";
		}
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String goToPage() {
		Random random = new Random();
		int randomInt = random.nextInt(2);

		switch (page) {
		case "Page A":
			if (randomInt == 0) {
				page = "Defeat!";
			} else {
				page = "Page B";
			}
			break;
		case "Page B":
			if (randomInt == 0) {
				page = "Defeat!";
			} else {
				page = "Page C";
			}
			break;
		case "Page C":
			if (randomInt == 0) {
				page = "Defeat!";
			} else {
				page = "VICTORY!";
			}
			break;
		}
		
		return null;
	}

	public String toA() {
		page = "Page A";
		return null;
	}

}
