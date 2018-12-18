package somepackage;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="ct")
public class ColorTest {

	private String colorString = "black";
	private String fieldsetColor = "white";

	public String getFieldsetColor() {
		return fieldsetColor;
	}

	public void setFieldsetColor(String fieldsetColor) {
		this.fieldsetColor = fieldsetColor;
	}

	public String getColorString() {
		return colorString;
	}

	public void setColorString(String colorString) {
		this.colorString = colorString;
	}
	
	public String toGreen() {
		this.colorString = "green";
		return null;
	}
	
	public String toYellow() {
		this.colorString = "yellow";
		return null;
	}
	
	public String toBlack() {
		this.colorString = "black";
		return null;
	}
	
	public String fToGreen() {
		this.fieldsetColor = "green";
		return null;
	}
	
	public String fToYellow() {
		this.fieldsetColor = "yellow";
		return null;
	}
	
	public String fToBlack() {
		this.fieldsetColor = "black";
		return null;
	}
}
