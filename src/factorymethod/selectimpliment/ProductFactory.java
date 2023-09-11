package factorymethod.selectimpliment;

import factorymethod.LgProduct;
import factorymethod.Product;
import factorymethod.SamsungProduct;

public class ProductFactory extends Factory {
    public static final String LG = "lg";
    public static final String SAMSUNG = "samsung";

    @Override
    public Product createProduct(String brand) {
        return switch (brand) {
            case LG -> new LgProduct();
            case SAMSUNG -> new SamsungProduct();
            default -> new LgProduct();
        };
    }
}
