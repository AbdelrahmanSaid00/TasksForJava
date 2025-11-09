package SheetSix.BankSys;

import java.util.Comparator;

public class NameCompare implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return Double.compare(o1.getBalance(), o2.getBalance());
    }
}
