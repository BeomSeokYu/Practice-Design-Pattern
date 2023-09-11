package factorymethod;

public abstract class Factory {
    public final LgProduct create() {
        return this.createProduct(); // 하위 클래스로 위임
    }

    public abstract LgProduct createProduct();
}
