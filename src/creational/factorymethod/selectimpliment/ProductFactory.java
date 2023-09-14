package creational.factorymethod.selectimpliment;

import creational.factorymethod.LgProduct;
import creational.factorymethod.Product;
import creational.factorymethod.SamsungProduct;

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
