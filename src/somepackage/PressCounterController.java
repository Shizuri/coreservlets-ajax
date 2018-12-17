package somepackage;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="pcc")
@ApplicationScoped
public class PressCounterController {

	private int counter;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public String increase() {
		counter++;
		return null;
	}
}
