import java.util.ArrayList;
import java.util.List;

public class ArrayListProducts implements ProductsDAO {

    private List<Product> productsList = new ArrayList();

    // When an instance of this class is created, we'll populate the
    // products array list with data, "faking" the records
    public ArrayListProducts() {
        insert(new Product("hammer", 9.99));
        insert(new Product("screwdriver", 9.99));
        insert(new Product("drill", 19.99));
    }

    // Persist a new record. We'll simulate this by adding the passed object
    // to our internal array list of products.
    public void insert(Product product) {
        this.productsList.add(product);
    }

    public List<Product> all() {
        return this.productsList;
    }

}
