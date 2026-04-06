import java.util.Scanner;
interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid: RS." + amount + " using credit card");
    }
}
class DebitCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid: Rs." + amount + " using debit card");
    }
}
class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid: Rs." + amount + " using UPI method");
    }
}
class User {
    String name;
    double balance;
    User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    void display() {
        System.out.println("User: " + name);
        System.out.println("Balance: Rs." + balance);
    }
}
class Customer extends User {
    Customer(String name, double balance) {
        super(name, balance);
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void makePayment(Payment p, double amount) {
        if (amount <= balance) {
            balance -= amount;
            p.pay(amount);
        } else {
            System.out.println("Payment failed: Low balance");
        }
    }
}

public class BankATMapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer("Dhivakaran Dhinakaran", 9000);
        int choice;
        do {
            System.out.println("\napp list options:");
            System.out.println("1. Display Details");
            System.out.println("2. To deposit");
            System.out.println("3. To withdraw");
            System.out.println("4. To make Payment");
            System.out.println("5. Exit");
            System.out.print("Enter ur choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    c.display();
                    break;
                case 2:
                    System.out.print("Enter amount: Rs.");
                    double dep = sc.nextDouble();
                    c.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter amount: Rs.");
                    double wd = sc.nextDouble();
                    c.withdraw(wd);
                    break;
                case 4:
                    System.out.println("Select Payment Method:");
                    System.out.println("1. Credit Card");
                    System.out.println("2. Debit Card");
                    System.out.println("3. UPI");
                    int payChoice = sc.nextInt();
                    System.out.print("Enter amount: Rs.");
                    double amt = sc.nextDouble();
                    Payment p = null;
                    if (payChoice == 1)
                        p = new CreditCardPayment();
                    else if (payChoice == 2)
                        p = new DebitCardPayment();
                    else if (payChoice == 3)
                        p = new UpiPayment();
                    else {
                        System.out.println("Invalid option");
                        break;
                    }
                    c.makePayment(p, amt); // polymorphism
                    break;
                case 5:
                    System.out.println("Thank you ");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}
