package test;

public class Gender {
	
	private String men;
	private String women;
	public String getMen() {
		return men;
	}
	public void setMen(String men) {
		this.men = men;
	}
	public String getWomen() {
		return women;
	}
	public void setWomen(String women) {
		this.women = women;
	}
	public Gender(String men, String women) {
		super();
		this.men = men;
		this.women = women;
	}
	public Gender() {
		super();
	}

}
