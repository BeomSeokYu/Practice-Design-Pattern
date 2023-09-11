package factorymethod;

public class ProductFactory extends Factory{
    public static final String LG = "lg";
    public static final String SAMSUNG = "samsung";

    @Override
    public LgProduct createProduct() {
        return new LgProduct();
    }
}
