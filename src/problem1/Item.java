package problem1;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String itemName, double itemPrice, int numPurchased) {
        this.name = itemName;
        this.price = itemPrice;
        this.quantity = numPurchased;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return name + "\t" + "$" + String.format("%.2f", price) + "\t" + quantity + "\t" + "$" + String.format("%.2f", price * quantity);
    }
}
