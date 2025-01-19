import java.util.Scanner;

public class BankingApp {

    private static User[] users = {
            new User(412435, 7452, "Chris Sandoval", 32000),
            new User(264863, 1349, "Marc Yim", 1000)
    };
    private static User currentUser = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loggedIn = false;

        // User login loop
        while (!loggedIn) {
            System.out.println("Enter User ID:");
            int userId = scanner.nextInt();
            System.out.println("Enter PIN:");
            int pin = scanner.nextInt();

            // Verify user login
            loggedIn = login(userId, pin);

            if (!loggedIn) {
                System.out.println("Invalid User ID or PIN. Please try again.");
            }
        }

        System.out.println("Login Successful! Welcome, " + currentUser.getName());

        // Main menu
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Cash-in");
            System.out.println("3. Transfer Money");
            System.out.println("4. Logout");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    cashIn();
                    break;
                case 3:
                    transferMoney();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return; // Exits the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Login method
    private static boolean login(int userId, int pin) {
        for (User user : users) {
            if (user.getUserId() == userId && user.getPin() == pin) {
                currentUser = user; // Set current user
                return true;
            }
        }
        return false;
    }

    // Check balance method
    private static void checkBalance() {
        System.out.println("Current balance: $" + currentUser.getBalance());
    }

    // Cash-in method
    private static void cashIn() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            currentUser.deposit(amount);
            System.out.println("Deposit successful! New balance: $" + currentUser.getBalance());
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Transfer money method
    private static void transferMoney() {
        System.out.print("Enter recipient's User ID: ");
        int recipientId = scanner.nextInt();

        User recipient = null;
        // Find the recipient user
        for (User user : users) {
            if (user.getUserId() == recipientId) {
                recipient = user;
                break;
            }
        }

        if (recipient == null) {
            System.out.println("User ID not found.");
            return;
        }

        System.out.print("Enter amount to transfer: $");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            return;
        }

        // Transfer money
        if (currentUser.transfer(recipient, amount)) {
            System.out.println("Transfer successful! New balance: $" + currentUser.getBalance());
            System.out.println("Recipient's new balance: $" + recipient.getBalance());
        } else {
            System.out.println("Insufficient balance to transfer.");
        }
    }
}
