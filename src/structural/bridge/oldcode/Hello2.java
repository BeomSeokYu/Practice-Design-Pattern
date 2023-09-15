package structural.bridge.oldcode;

public class Hello2 {
    public static final String KOREAN = "KOREAN";
    public static final String ENGLISH = "ENGLISH";

    public String greeting(String lang) {
        switch (lang) {
            case KOREAN -> {
                return "안녕하세요";
            }
            case ENGLISH -> {
                return "hello";
            }
        }
        return null;
    }
}
