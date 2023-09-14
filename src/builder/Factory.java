package builder;

public class Factory extends Builder{

    public Factory(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public Builder defaultBuilder() {
        System.out.println("== 기본 값 빌드 중 ==");
        this.algorithm.setCpu("i7");
        this.algorithm.setRam(4, 4, 4, 4);
        this.algorithm.setStorage(1024, 256);
        return this;
    }
}
