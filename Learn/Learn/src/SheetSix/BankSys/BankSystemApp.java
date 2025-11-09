package SheetSix.BankSys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankSystemApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1000);
        BankAccount acc2 = new BankAccount(500);
        BankAccount acc3 = new BankAccount(2000);

        SavingsAccount savAcc = new SavingsAccount(5);
        SavingsAccount savAcc2 = new SavingsAccount(10);

        CheckingAccount chk1 = new CheckingAccount();
        CheckingAccount chk2 = new CheckingAccount();

        chk1.deposit(acc1 , 200);
        chk1.withdraw(acc1 , 100);
        savAcc.addInterst(acc1);

        chk2.deposit(acc2, 200);
        savAcc2.addInterst(acc2);

        System.out.println("Account 1 balance after interest: $" + acc1.getBalance());
        System.out.println("Account 2 balance after interest: $" + acc2.getBalance());

        System.out.println("\n---- Transfers ----");
        chk1.Transfer(acc1, acc2, 150);
        chk2.Transfer(acc2, acc3, 100);

        System.out.println("Account 1 balance: $" + acc1.getBalance());
        System.out.println("Account 2 balance: $" + acc2.getBalance());
        System.out.println("Account 3 balance: $" + acc3.getBalance());

        System.out.println("\n---- Deducting Fees ----");
        chk1.deductFees(acc1);
        chk2.deductFees(acc2);

        System.out.println("Account 1 balance after fees: $" + acc1.getBalance());
        System.out.println("Account 2 balance after fees: $" + acc2.getBalance());

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);

        Collections.sort(accounts, new NameCompare());

        System.out.println("\n---- Accounts sorted by balance (descending) ----");
        for (BankAccount acc : accounts) {
            System.out.println("Balance: $" + acc.getBalance());
        }
    }
}
