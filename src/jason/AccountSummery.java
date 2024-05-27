package jason;

public class AccountSummery {
    private String accountNumber;
    private double balance;

    public AccountSummery(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String getAccountSummary() {
        return "Account Number: " + accountNumber + "\n" + "Balance: " + balance;
    }
}
