public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    private static String bankName = "Swiss bank";
    private static int totalAccountsCreated = 0;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        totalAccountsCreated++;
    }

    public void displayAccountDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static int getTotalAccountsCreated() {
        return totalAccountsCreated;
    }

    public static void setBankName(String newBankName) {
        bankName = newBankName;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1011111111", "Abid bin jahangir", 500000000000000000.0);
        BankAccount account2 = new BankAccount("1022222222", "nahian T shaan", 250.0);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccountsCreated());
    }
}