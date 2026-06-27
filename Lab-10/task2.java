interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

class DBBL implements ATMService {
    private double balance;

    public DBBL(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Transaction failed: Invalid amount or insufficient funds.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Transaction failed: Invalid deposit amount.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        ATMService dbblATM = new DBBL(10000.0);

        dbblATM.checkBalance();
        dbblATM.deposit(5000.0);
        dbblATM.withdraw(3000.0);
        dbblATM.checkBalance();
    }
}