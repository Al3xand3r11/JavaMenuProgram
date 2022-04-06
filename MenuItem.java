package homework.assignment3;

import java.util.ArrayList;

public class MenuItem {
	
	String dish;
	int cat;
	boolean hHealthy;
	int price;
	
	public MenuItem (String dish, int cat, boolean hHealthy, int price) {
		this.dish = dish;
		this.cat = cat;
		this.hHealthy = hHealthy;
		this.price = price;
	}
	
	
	public String getDish () {
		return dish;
	}
	
	public int getCat () {
		return cat;
	}
	
	public boolean getHealthy () {
		return hHealthy;
	}
	
	public int getPrice () {
		return price;
	}
	
	public String toString () {
		return(dish + ", " + price + ", " + cat);
	}
	
	
}
