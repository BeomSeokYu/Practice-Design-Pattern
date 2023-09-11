package factorymethod.selectimpliment;

import factorymethod.Product;

public abstract class Factory {
    public final Product create(String brand) {
        return this.createProduct(brand); // 하위 클래스로 위임
    }

    public abstract Product createProduct(String brand);
}
