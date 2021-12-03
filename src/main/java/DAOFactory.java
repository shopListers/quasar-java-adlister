public class DAOFactory {
    private static ProductsDAO productsDao;

    public static ProductsDAO getProductsDao() {
        if (productsDao == null) {
            productsDao = new ArrayListProducts();
        }
        return productsDao;
    }


}
