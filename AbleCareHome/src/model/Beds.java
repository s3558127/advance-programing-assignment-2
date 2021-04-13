package model;

public class Beds {
	private int bedNo;
	private char gender;
	private boolean bedAvailable;
	
	public Beds(int bedNo, char gender, boolean bedAvailable) {
		this.bedNo=bedNo;
		this.gender=gender;
		this.bedAvailable=bedAvailable;
	}
	
	public void setGender(char g) {
		this.gender=g;
	}
	
	public void setBedAvailable(boolean a) {
		bedAvailable=a;
	}
	
	public boolean checkBedAvailable() {
		return bedAvailable;
	}
}
