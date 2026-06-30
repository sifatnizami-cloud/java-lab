
interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    double checkBalance();
}
class DBBL implements ATMService {
    private double balance;

    public DBBL(double initialBalance) {
        this.balance = initialBalance;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override
    public double checkBalance() {
        return balance;
    }
}
public class ATMDemo {
    public static void main(String[] args) {
        System.out.println("=== Task 2: ATM Service (DBBL) ===");
        DBBL atm = new DBBL(1000.0);
        atm.deposit(300.0);
        atm.withdraw(200.0);
        System.out.println("Final balance: $" + atm.checkBalance());
    }
}
