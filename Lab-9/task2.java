public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountDetails(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + maskAccountNumber(accountNumber));
        System.out.println("Current Balance: $" + balance);
    }

    private String maskAccountNumber(String accNum) {
        if (accNum != null && accNum.length() > 4) {
            return "**" + accNum.substring(accNum.length() - 4);
        }
        return accNum;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountDetails("abid", "1234567890", 1500.50);
        account.deposit(50000000.00);
        account.withdraw(20000.25);

        account.showAccountInfo();
    }
}