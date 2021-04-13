package model;

public class Medicines {
	private String medName;
	private String pres;
	public Medicines(String medName, String pres) {
		this.medName=medName;
		this.pres=pres;
	}
	
	public String getMedName() {
		return this.medName;
	}
	
	public String getPres() {
		return pres;
	}
}




