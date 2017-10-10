import java.util.ArrayList;

public class TheOrder {
	ArrayList<TheItem> orderItems = new ArrayList<TheItem>();

	public void addItem(TheItem orderItem) {
		orderItems.add(orderItem);
	}

	public int qtyOfItems() {

		int totalItems = 0;
		for (TheItem orderItem : orderItems) {
			totalItems += orderItem.getItemQuantity();
		}

		return totalItems;
	}

	public void removeItem(String ItemName) {
		for (int i = orderItems.size() - 1; i >= 0; i--) {
			if (orderItems.get(i).getItemName().equals(ItemName)) {
				orderItems.remove(i);
			}
		}
	}

	public void showOrderList() {
		for (TheItem itemsOnOrder : orderItems) {
			System.out.println(itemsOnOrder);
		}
	}

}
