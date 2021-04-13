package model;

public class Doctor {
	private String name;
	private String password;
	private String shift;
	public Doctor(String name, String password, String shift) {
		this.name=name;
		this.password=password;
		this.shift=shift;
	}
	
	public String getDoctorName() {
		return this.name;
	}
	
	public String getDoctorPassword() {
		return this.password;
	}
	
	public String getDoctorShift() {
		return this.shift;
	}
	
	public void setDoctorName(String n) {
		this.name=n;
	}
	
	public void setDoctorPassword(String p) {
		this.password=p;
	}
	
	public void setDoctorShift(String s) {
		this.shift=s;
	}
}
