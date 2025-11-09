package SheetSix.BankSys;

public class SavingsAccount {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void addInterst(BankAccount account){
        double interest = account.getBalance() * (interestRate / 100);
        account.deposit(interest);
    }
}
