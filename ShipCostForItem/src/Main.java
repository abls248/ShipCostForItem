import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of the item
        System.out.print ("Enter the price of the item: ");
        double price = scanner.nextDouble();

        // Calculate the shipping cost
        double shippingCost;
        if (price < 50) {
            shippingCost = 10.0;
        } else if (price <= 100) {
            shippingCost = 5.0;
        } else {
            shippingCost = 0.0;
        }

        // Display the shipping cost
        System.out.println(" The shipping cost is: " + shippingCost);
    }
}