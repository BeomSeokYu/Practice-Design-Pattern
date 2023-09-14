package builder.createcustom;

import builder.Builder;

public abstract class CustomBuilder extends Builder {
    public abstract CustomBuilder setCpu(String cpu);
    public abstract CustomBuilder setRam(int ... rams);
    public abstract CustomBuilder setStorage(int ... storages);

}
