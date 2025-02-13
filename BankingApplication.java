import java.util.Scanner;

public class BankingApplication{
       private static double  balance;
     public void setBalance(double balance){
         this.balance=balance;
     }
     public double getBalance(){
         return balance;
     }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printHeader();
            System.out.println("\t\t\t\t\t\t\t\u001B[33m1. Deposit\u001B[0m");
            System.out.println("\t\t\t\t\t\t\t\u001B[32m2. Withdraw\u001B[0m");
            System.out.println("\t\t\t\t\t\t\t\u001B[34m3. Check Balance\u001B[0m");
            System.out.println("\t\t\t\t\t\t\t\u001B[31m4. Exit\u001B[0m");
            System.out.print("\n\t\t\t\t\t\t\t\u001B[35mChoose an option: \u001B[0m");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("\n\u001B[36m=======================================");
                    System.out.println("        Thank you for using our banking system!");
                    System.out.println("=======================================\u001B[0m");
                    return;
                default:
                    System.out.println("\n\u001B[31mInvalid choice. Please try again.\u001B[0m");
            }
        }
    }

    private static void printHeader() {
        System.out.println("\n\u001B[36m\t\t\t\t\t=======================================");
        System.out.println("\t\t\t\t\t\t\tSimple Bank App");
        System.out.println("\t\t\t\t\t=======================================\u001B[0m\n");
    }

    public void MyDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\n\u001B[32m$" + amount + " deposited successfully!\u001B[0m\n");
        } else {
            System.out.println("\n\u001B[31mInvalid amount. Please enter a positive value.\u001B[0m\n");
        }
    }

    public static void deposit() {
        System.out.print("\n\u001B[33mEnter deposit amount: \u001B[0m");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("\n\u001B[32m=======================================");
            System.out.println("        $" + amount + " deposited successfully!");
            System.out.println("=======================================\u001B[0m\n");
        } else {
            System.out.println("\n\u001B[31mInvalid amount. Please enter a positive value.\u001B[0m\n");
        }
    }

    // Withdraw method for testing
    public boolean MyWithdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\n\u001B[32m$" + amount + " withdrawn successfully!\u001B[0m\n");
            return true;
        } else {
            System.out.println("\n\u001B[31mInsufficient funds or invalid amount.\u001B[0m\n");
            return false;
        }
    }


    private static void withdraw() {
        System.out.print("\n\u001B[33mEnter withdrawal amount: \u001B[0m");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\n\u001B[32m=======================================");
            System.out.println("        $" + amount + " withdrawn successfully!");
            System.out.println("=======================================\u001B[0m\n");
        } else {
            System.out.println("\n\u001B[31mInsufficient funds or invalid amount.\u001B[0m\n");
        }
    }

    // Check balance method for testing
    public String MyCheckBalance() {
        return "Your current balance: $" + balance;

    }

    private static void checkBalance() {
        System.out.println("\n\u001B[34m=======================================");
        System.out.println("        Your current balance: $" + balance);
        System.out.println("=======================================\u001B[0m\n");
    }
}
