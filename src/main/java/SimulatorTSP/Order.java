package SimulatorTSP;

import java.util.ArrayList;

/**
 * Created by Ivan on 03/05/2017.
 */
public class Order {
    private ArrayList<Product> products;

    public Order(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
