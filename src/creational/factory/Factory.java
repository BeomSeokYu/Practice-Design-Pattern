package creational.factory;

public class Factory {
    public static final String KOREAN = "ko";
    public static final String ENGLISH = "en";

    public static Language getInstance(String type) {
        return switch (type) {
            case KOREAN -> new Korean();
            case ENGLISH -> new English();
            default -> new Korean();
        };
    }
}
