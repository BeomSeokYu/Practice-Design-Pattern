package creational.builder;

public abstract class Builder {
    // 알고리즘 저장
    protected Algorithm algorithm;

    // 알고리즘 설정
    public Algorithm setAlgorithm(Algorithm algorithm) {
        System.out.println("알고리즘 설정");
        this.algorithm = algorithm;
        return this.algorithm;
    }

    // 생성 객체 반환
    public Object build() {
        return this.algorithm.getInstance();
    }

    // 기본값 생성 빌더 반환
    public abstract Builder defaultBuilder();
}
