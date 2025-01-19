import java.util.Scanner;

// User class to store user details
class User {
    private int userId;
    private int pin;
    private String name;
    private double balance;

    // Constructor to initialize user details
    public User(int userId, int pin, String name, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    // Getter and Setter methods
    public int getUserId() {
        return userId;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(User recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            return true;
        } else {
            return false;
        }
    }
}

