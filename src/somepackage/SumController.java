package somepackage;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SumController {

	private int sum, first, second;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public String calculate() {
		sum = first + second;
		return null;
	}
}
