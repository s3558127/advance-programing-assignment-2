package model;
import java.util.ArrayList;

public class Room {
	private int currentRes;
	private int maxRes;
	private ArrayList<Beds> beds;
	public Room(int currentRes, int maxRes) {
		this.currentRes=currentRes;
		this.maxRes=maxRes;
	}
	
	public int getCurrentRes() {
		return currentRes; 
	}
	
	public int getMaxRes() {
		return maxRes;
	}
	
	public void setCurrentRes(int c) {
		this.currentRes=c;
	}
	
	public void setMaxRes(int m) {
		this.maxRes=m;
	}
}
