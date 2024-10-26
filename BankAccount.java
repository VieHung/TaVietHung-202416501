import java.util.Scanner;

public class BankAccount{
    private String name;
    private double balance;
    int i = 0;
    String transaction_history = "Transaction History: ";

    public BankAccount(String name, double initial_balance){
        this.name=name;
        this.balance= initial_balance; 
    }

    public String getName(){
        return this.name;
    }
    public double getbalance(){
        return this.balance;
    }

    public void deposit(double mount){
        if (mount>0) {
            this.balance += mount;
            System.out.println("Deposit " + mount);
            transaction_history += "\nDeposit " + mount;
        }
        else {
            System.out.println("Error!");
        }
    }

    public void withdraw(double mount){
        if (mount >= 0 && mount <= this.balance && i<3 ) {
            this.balance -= mount;
            i = i+1;
            System.out.println("Withdraw " + mount);
            transaction_history += "\nWithdraw " + mount;
        }
        else if ( i>= 3){
            System.out.println("Vuot qua so lan rut!");
        }
        else {
            System.out.println("Error!");
        }
    }
    
    public String getTransactionHistory(){
        return this.transaction_history;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name ");
        String name = scanner.nextLine();
        System.out.println("Enter Balance ");
        Double initial_balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name,initial_balance);     
        while (true) {
            System.out.print("Do you want to deposit/withdraw? (Y/N): ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("N")) {
                break;
            } else if (command.equalsIgnoreCase("Y")) {
                System.out.print("Enter command (Deposit, Withdraw, or Exit): ");
                String action = scanner.nextLine();

                if (action.equalsIgnoreCase("Deposit")) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    account.deposit(amount);
                } else if (action.equalsIgnoreCase("Withdraw")) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); 
                    account.withdraw(amount);
                } else if (action.equalsIgnoreCase("Exit")) {
                    break;
                } else {
                    System.out.println("Invalid command!");
                }
            } else {
                System.out.println("Please enter Y or N.");
            }
        }   

        System.out.println("Account "  + account.getName());
        System.out.println("Balance " + account.getbalance());
        System.out.println(account.getTransactionHistory());

    scanner.close();
    }
}