import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// PaymentStrategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// CreditCardStrategy Class
class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}

// PaypalStrategy Class
class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}

// Item Class
class Item {
    private String upcCode;
    private int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}

// ShoppingCart Class
class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}

// ShoppingCartTest Class
public class ShoppingCartTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Welcome to the Shopping Cart!");

        // Adding items dynamically
        while (true) {
            System.out.print("Enter item UPC code: ");
            String upcCode = scanner.nextLine();

            System.out.print("Enter item price: ");
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            cart.addItem(new Item(upcCode, price));

            System.out.print("Do you want to add another item? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("\nTotal amount: " + cart.calculateTotal());

        // Payment options
        System.out.println("Choose payment method:");
        System.out.println("1. PayPal");
        System.out.println("2. Credit/Debit Card");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (option) {
            case 1:
                // PayPal payment
                System.out.print("Enter PayPal email: ");
                String email = scanner.nextLine();

                System.out.print("Enter PayPal password: ");
                String password = scanner.nextLine();

                cart.pay(new PaypalStrategy(email, password));
                break;

            case 2:
                // Credit card payment
                System.out.print("Enter cardholder name: ");
                String name = scanner.nextLine();

                System.out.print("Enter card number: ");
                String cardNumber = scanner.nextLine();

                System.out.print("Enter CVV: ");
                String cvv = scanner.nextLine();

                System.out.print("Enter expiry date (MM/YY): ");
                String expiryDate = scanner.nextLine();

                cart.pay(new CreditCardStrategy(name, cardNumber, cvv, expiryDate));
                break;

            default:
                System.out.println("Invalid payment option. Transaction cancelled.");
                break;
        }

        System.out.println("Thank you for shopping with us!");
        scanner.close();
    }
}
