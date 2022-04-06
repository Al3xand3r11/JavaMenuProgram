package homework.assignment3;

public class Client {
	AbstractItem allItems;
	
	public Client (AbstractItem allItems) {
		this.allItems = allItems;
	}
	
	public void getAllItems() {
		allItems.print();
	}
}
