
public class TheItem {
private String name;
private double price;
private int quantity;

public TheItem(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}


public String getItemName() {
	return name;
}
public double getItemPrice() {
	return price;
}
public int getItemQuantity() {
	return quantity;
}

@Override
public String toString() {
	return "Your items are: " + this.name + this.price + this.quantity;
}

}
