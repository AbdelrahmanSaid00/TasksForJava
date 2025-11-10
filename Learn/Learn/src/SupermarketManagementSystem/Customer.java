package SupermarketManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Product> products = new ArrayList<>();
    public Customer(String name, String email) {
        super(name, email);
    }
    public void AddToCart (Product p)
    {
        products.add(p);
    }
    public void DeleteProduct (Product p)
    {
        products.remove(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void ViewCart () {
        for(Product p : products) {
            p.DisplayDetails();
        }
    }
}
