package SheetSix.BankSys;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public void Transfer (BankAccount account, double amount){
        if(amount <= balance){
            this.withdraw(amount);
            account.deposit(amount);
        } else {
            System.out.println("Insufficient funds for transfer");
        }
    }
}
