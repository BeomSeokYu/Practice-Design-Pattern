package structural.bridge.patterndesign1;

public class Language {
    private English english;
    private Korean korean;

    public English getEnglish() {
        return english;
    }

    public void setEnglish(English english) {
        this.english = english;
    }

    public Korean getKorean() {
        return korean;
    }

    public void setKorean(Korean korean) {
        this.korean = korean;
    }
}
