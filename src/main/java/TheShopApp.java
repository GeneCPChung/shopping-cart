import java.util.Scanner;

public class TheShopApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TheOrder orderInput = new TheOrder();
		TheItem item;

		System.out.println("Welcome");
		System.out.println("Would you like to place another order?" + "y = place another order" + "n = checkout");
		String askCheckOut = input.nextLine();

		while (!askCheckOut.equals("n")) {

			System.out.println("Pleae enter an item: ");
			String itemSelection = input.nextLine();

			System.out.println("Pleae enter a price: ");
			double itemSelectionPrice = input.nextDouble();

			System.out.println("Pleae enter a quantity: ");
			int itemSelectionQuantity = input.nextInt();

			item = new TheItem(itemSelection, itemSelectionPrice, itemSelectionQuantity);
			orderInput.addItem(item);

			System.out.println("Would you like to place another order?" + "y = place another order" + "n = checkout");
			askCheckOut = input.nextLine();

		}
		if (askCheckOut.equals("n")) {
			System.out.println("Current Order");
			orderInput.showOrderList();
			System.out.println("Would you like to add or remove items from your cart? y/n");
			
		}
	}

}
