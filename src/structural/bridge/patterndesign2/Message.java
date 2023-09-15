package structural.bridge.patterndesign2;

public class Message extends Language{

    public Message(Hello lang) {
        this.language = lang;
    }

    @Override
    public String greeting() {
        // 브리지 구현
        return this.language.greeting();
    }
}
