import java.util.List;

interface ProductsDAO {
    List<Product> all(); // get all the product records
    void insert(Product product); // persist new product to the ArrayList [local collection]
}
