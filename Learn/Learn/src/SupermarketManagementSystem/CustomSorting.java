package SupermarketManagementSystem;

import java.util.Comparator;

public class CustomSorting implements Comparator<ESProduct> {
    @Override
    public int compare(ESProduct o1, ESProduct o2) {
//        if (o1.getPrice() > o2.getPrice()) {
//            return -1;
//        } else if (o1.getPrice()< o2.getPrice()) {
//            return 1;
//        } else {
//            return 0;
//        }
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
