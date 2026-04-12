// Interface
interface Payment {
    void processPayment(double amount);
}

// CreditCard class
class CreditCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// DebitCard class
class DebitCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Debit Card");
    }
}

// UPI class
class UPI implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Array of amounts
        double[] amounts = {1000, 500, 200};

        // Array of payment methods
        Payment[] methods = {
            new CreditCard(),
            new DebitCard(),
            new UPI()
        };

        // Process payments
        for (int i = 0; i < amounts.length; i++) {
            methods[i].processPayment(amounts[i]);
        }
    }
}