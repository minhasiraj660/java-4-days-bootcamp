package Day2;

public class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("Rahul", 1001, 5000);

        BankAccount account2 =
                new BankAccount("Anu", 1005, 8000);

        account1.deposit(2000);
        account2.deposit(3000);

        account1.withdraw(1000);

        System.out.println("Account 1 Details:");
        account1.displayDetails();

        System.out.println();

        System.out.println("Account 2 Details:");
        account2.displayDetails();
    }
}
