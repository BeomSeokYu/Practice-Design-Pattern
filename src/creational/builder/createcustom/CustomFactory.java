package creational.builder.createcustom;

import creational.builder.Algorithm;
import creational.builder.Builder;

public class CustomFactory extends CustomBuilder {

    public CustomFactory(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public CustomBuilder setCpu(String cpu) {
        this.algorithm.setCpu(cpu);
        return this;
    }

    @Override
    public CustomBuilder setRam(int ... rams) {
        this.algorithm.setRam(rams);
        return this;
    }

    @Override
    public CustomBuilder setStorage(int ... storages) {
        this.algorithm.setStorage(storages);
        return this;
    }

    @Override
    public Builder defaultBuilder() {
        return this;
    }
}
