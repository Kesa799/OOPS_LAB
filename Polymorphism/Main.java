// Base class
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        System.out.println("Withdraw method in Account");
    }
}

// Savings Account
class SavingsAccount extends Account {
    double minBalance = 500;

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Savings Withdraw: " + amount);
        } else {
            System.out.println("Cannot withdraw! Minimum balance required: " + minBalance);
        }
    }
}

// Current Account
class CurrentAccount extends Account {
    double overdraftLimit = 1000;

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Current Withdraw: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Savings Account
        Account s = new SavingsAccount(2000);
        s.deposit(500);
        s.withdraw(1800);
        System.out.println("Balance: " + s.balance);

        System.out.println();

        // Current Account
        Account c = new CurrentAccount(1000);
        c.deposit(500);
        c.withdraw(2000);
        System.out.println("Balance: " + c.balance);
    }
}