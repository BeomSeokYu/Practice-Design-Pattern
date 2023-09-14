package creational.factory.simplefactory;

import static creational.factory.Factory.ENGLISH;
import static creational.factory.Factory.KOREAN;

public class Hello {
    public String greeting(String type) {
        return factory(type).text();
    }

    public static Language factory(String type) {
        return switch (type) {
            case KOREAN -> new Korean();
            case ENGLISH -> new English();
            default -> new Korean();
        };
    }
}
