package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Resident implements Person{
	private ArrayList<Medicines> medicines;
	private ArrayList<Conditions> conditions;
	private ArrayList<Beds> beds;
	private static String ID;
	private static String firstName;
	private static String lastName;
	private static String userName;
	private static String type;
	private static String gender;
	
	public Resident() {
		medicines=new ArrayList<Medicines>();
		conditions=new ArrayList<Conditions>();
		beds = new ArrayList<Beds>();
	}
	Resident(String ID,String firstName, String lastName, String userName, String types, String genders) {
		Resident.ID=ID;
		Resident.firstName=firstName;
		Resident.lastName=lastName;
		Resident.userName=userName;
		Resident.gender=genders;
		
	}
	public void displayMedicines() {

		Iterator<Medicines> it = medicines.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getMedName());
		}
	}
	public void displayCondition() {
		
		Iterator<Conditions> it = conditions.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getConName());
		}
	}
}