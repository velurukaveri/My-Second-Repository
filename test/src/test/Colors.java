package test;

public class Colors {

	private String red;
	private String blue;
	private String green;
	private String black;
	private String yellow;
	public String getRed() {
		return red;
	}
	public void setRed(String red) {
		this.red = red;
	}
	public String getBlue() {
		return blue;
	}
	public void setBlue(String blue) {
		this.blue = blue;
	}
	public String getGreen() {
		return green;
	}
	public void setGreen(String green) {
		this.green = green;
	}
	public String getBlack() {
		return black;
	}
	public void setBlack(String black) {
		this.black = black;
	}
	public String getYellow() {
		return yellow;
	}
	public void setYellow(String yellow) {
		this.yellow = yellow;
	}
	public Colors(String red, String blue, String green, String black, String yellow) {
		super();
		this.red = red;
		this.blue = blue;
		this.green = green;
		this.black = black;
		this.yellow = yellow;
	}
	public Colors() {
		super();
	}
}
