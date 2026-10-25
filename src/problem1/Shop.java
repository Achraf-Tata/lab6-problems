package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> cart = new ArrayList<>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        String keepShopping = "y";
        double total = 0;

        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();

            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();

            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            total = 0;
            for (int i = 0; i < cart.size(); i++) {
                Item current = cart.get(i);
                System.out.println(current);
                total += current.getPrice() * current.getQuantity();
            }
            System.out.println("Total: $" + String.format("%.2f", total));

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        } while (keepShopping.equalsIgnoreCase("y"));

        System.out.println("\nPlease pay $" + String.format("%.2f", total));
        scan.close();
    }
}
