package creational.factory;

public class Hello {
    public String greeting(String type) {
        return Factory.getInstance(type).text();
    }
}
