package homework.assignment3;
import java.util.*;
public class Menu {
public static final int APPETIZERS = 1;
public static final int MAIN_DISH = 2;
public static final int DESSERT = 3;
public static final boolean HEART_HEALTHY = true;
public static final boolean NOT_HEART_HEALTHY = false;

ArrayList <MenuItem> newItem = new ArrayList <MenuItem>();
int start ;
	
	public Menu() {
		
	}
	
	
	public void add(String dish, int cat, boolean hHealthy, int price) {
		MenuItem newItems = new MenuItem(dish, cat, hHealthy, price);
		newItem.add(newItems); 
		
	}
	public void delete(int i) {
		newItem.remove(i-1);
	}
	
	
	
	public class AllItemsIterator implements MIterator {
		private int start;
		public boolean hasNext() {
			return !(start >= newItem.size() || newItem.get(start) == null);
			
		}
		public MenuItem next() {
			
			return newItem.get(start++);
		}
	}
	
	public class ItemIterator implements MIterator {
		private int start, cat;
		public ItemIterator (int cat) {
			this.cat = cat;
			}
		public boolean hasNext() {
			return!(start >= newItem.size()|| newItem.get(start) == null) && rightCat();
		}
		public boolean rightCat() {
			if (newItem.get(start).getCat()==cat) {
				return true;
			}
			else {
				start++;
				return hasNext();
			}
			
			
		}
		public MenuItem next() {
			return newItem.get(start++);
		}
		}
	
	
	public class HeartHealthyIterator implements MIterator {
		private int start;
		private boolean hHealthy;
		public HeartHealthyIterator(boolean hHealthy) {
			this.hHealthy = hHealthy;
		}
		public boolean hasNext() {
			return !(start >= newItem.size()|| newItem.get(start) == null) && rightHealth();
	}
		
		public boolean rightHealth() {
			if (newItem.get(start).getHealthy()==hHealthy) {
				return true;
			}
			else {
				start ++;
				return hasNext(); 
				
			}
		}
		public MenuItem next() {
			return newItem.get(start++);
		}
	}
	public class PriceIterator implements MIterator  {
		private int start, topPrice;
		
		public PriceIterator(int topPrice) {
			this.topPrice = topPrice;
		}
		public boolean hasNext() {
			return !(start >= newItem.size()|| newItem.get(start) == null) && rightPrice();
		}
		
		public boolean rightPrice() {
			if (newItem.get(start).getPrice()<=topPrice) {
				return true;
			}
			else {
				start++;
				return hasNext();
			}
			
		}
		public MenuItem next() {
			return newItem.get(start++);
		}
	}
	
	public MIterator getAllItemsIterator () {
		return new AllItemsIterator();
	}
	public MIterator getItemIterator (int cat) {
		return new ItemIterator(cat);
	}
	public MIterator getHeartHealthyIterator(boolean hHealthy) {
		return new HeartHealthyIterator(hHealthy);
	}
	public MIterator getPriceIterator(int price) {
		return new PriceIterator(price);
	}
}

