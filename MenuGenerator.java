package homework.assignment3;
import java.util.*;
public class MenuGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu eatAtJoesMenu = new Menu();
		MIterator Iterator;
		int input;
		eatAtJoesMenu.add("Strawberry Shortcake",Menu.DESSERT, Menu.NOT_HEART_HEALTHY, 10);
		eatAtJoesMenu.add("Chicken",Menu.MAIN_DISH, Menu.HEART_HEALTHY, 15);
		eatAtJoesMenu.add("Shrimp",Menu.APPETIZERS, Menu.NOT_HEART_HEALTHY, 13);
		eatAtJoesMenu.add("Side Salad",Menu.APPETIZERS, Menu.HEART_HEALTHY, 8);
		eatAtJoesMenu.add("Ice Cream",Menu.DESSERT, Menu.NOT_HEART_HEALTHY, 4);
		Scanner keyboard = new Scanner(System.in);
		do {
		choices();
		input = keyboard.nextInt();
		
		
		
			if (input == 1) {
				 //Where code to display all items will be
				
				MenuItem item;
				Iterator = eatAtJoesMenu.getAllItemsIterator();
				System.out.println("All Menu Items!");
				while (Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(item.getDish() + " $" + item.getPrice() + "\n");
				}
				
				
			}
			else if (input == 2) {
				 //Where code to display appetizers will be
				MenuItem item;
				Iterator = eatAtJoesMenu.getItemIterator(Menu.APPETIZERS);
				System.out.println("All Appetizers!");
				while(Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(item.getDish() + " $" + item.getPrice() + "\n");
				}
			}
			else if (input == 3) {
				MenuItem item;
				Iterator = eatAtJoesMenu.getItemIterator(Menu.MAIN_DISH);
				System.out.println("All Main Dishes!");
				while(Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(item.getDish() + " $" + item.getPrice() + "\n");
				}
				
				}
// code for main dishes
				
			
			else if (input == 4) {
				MenuItem item;
				Iterator = eatAtJoesMenu.getItemIterator(Menu.DESSERT);
				System.out.println("All Desserts!");// dessert code
				while(Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(item.getDish() + " $" + item.getPrice() + "\n" );
				}
				
			}	
			else if (input == 5) {
				MenuItem item;
				Iterator = eatAtJoesMenu.getHeartHealthyIterator(true);
				System.out.println("All Heart Healthy!");// hh code
				while(Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(item.getDish() + " $" + item.getPrice() + "\n");
				}
				
			}
			else if (input == 6) {
				MenuItem item;
				System.out.println("Enter the dollar amount you want to be under:");//under $ code
				int top = keyboard.nextInt();
				Iterator = eatAtJoesMenu.getPriceIterator(top);
				System.out.println("All items under " + top + " dollars");
				while (Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(item.getDish() + " $" + item.getPrice() + "\n" );
				}
				
			}
			else if (input == 7) {
				System.out.println("Enter the name of your dish");
				String dish = keyboard.next();
				
				System.out.println("If if is an appetizer press 1 \n"
						+ "If it is a main dish press 2 \n"
						+ "if it is a dessert press 3 \n");
				int cat = keyboard.nextInt();
					
						System.out.println("Is it heart healthy?(true/false)");
						boolean hHealthy = keyboard.nextBoolean();
				
							System.out.println("How much is the dish?");
							int price = keyboard.nextInt();// add
							eatAtJoesMenu.add(dish,cat,hHealthy,price);
							System.out.println("All Menu Items!");
							MenuItem item;
					Iterator = eatAtJoesMenu.getAllItemsIterator();
						while (Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(item.getDish() + " $" + item.getPrice() + "\n");
						}
						
			} 
			else if (input == 8) {
				System.out.println("All Menu Items!");
				MenuItem item;
				int start = 1;
				Iterator = eatAtJoesMenu.getAllItemsIterator();
				while (Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(start + ". " + item.getDish() + " $" + item.getPrice() + "\n");
					start++;
				}
				System.out.println("Which on would you like to remove");
				int num = keyboard.nextInt();
				eatAtJoesMenu.delete(num);// remove
				System.out.println("New Menu Items!");
				Iterator = eatAtJoesMenu.getAllItemsIterator();
				int start2 =1;
				while (Iterator.hasNext()) {
					item = Iterator.next();
					System.out.println(start2 + ". " + item.getDish() + " $" + item.getPrice() + "\n");
					start2++;
				}
			}
			else if (input == 0) {
				System.out.print("Goodbye!");
				
			}
		}while(input!=0); 
		}
		
	
	
	public static void choices() {
		System.out.println("Joe's restaurant! Input a number or press 0 to exit");
		System.out.println("1 - Display all menu items \n"
				+ "2 - Display all appetizers \n"
				+ "3 - Display all main dishes \n"
				+ "4 - Display all desserts \n"
				+ "5 - Display all hearty healthy items \n"
				+ "6 - Display all main dishes under a specified price \n"
				+ "7 - Add menu Item \n"
				+ "8 - Remove menu item \n");
	}

}
