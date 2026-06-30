class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main2 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountHolder("Mohammed Arif");
        b.setAccountNumber("ACC12345");
        b.setBalance(10000.75);

        System.out.println(b.getAccountHolder());
        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
    }
}
