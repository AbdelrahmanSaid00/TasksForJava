package SheetSix.BankSys;

public class CheckingAccount {
    private int transactionCount;
    private static int noOfFreeTransaction = 3;
    private static double transactionFees = 5.0;

    public CheckingAccount() {
        this.transactionCount = 0;
    }

    public void deposit(BankAccount account, double amount) {
        account.deposit(amount);
        transactionCount++;
    }

    public void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
        transactionCount++;
    }

    public void Transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        fromAccount.Transfer(toAccount, amount);
        transactionCount++;
    }

    public void deductFees(BankAccount account) {
        if (transactionCount > noOfFreeTransaction) {
            int extraTransactions = transactionCount - noOfFreeTransaction;
            double totalFees = extraTransactions * transactionFees;

            if (account.getBalance() >= totalFees) {
                account.withdraw(totalFees);
                System.out.println("Fees deducted: " + totalFees);
            } else {
                System.out.println("Insufficient funds to deduct fees");
            }
        } else {
            System.out.println("No fees to deduct (within free transactions).");
        }

        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public static void setNoOfFreeTransaction(int free) {
        noOfFreeTransaction = free;
    }

    public static void setTransactionFees(double fee) {
        transactionFees = fee;
    }

    public static int getNoOfFreeTransaction() {
        return noOfFreeTransaction;
    }

    public static double getTransactionFees() {
        return transactionFees;
    }
}
