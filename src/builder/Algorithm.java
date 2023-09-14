package builder;

public abstract class Algorithm {
    protected Computer composite;

    public abstract void setCpu(String cpu);
    public abstract void setRam(int ... sizes);
    public abstract void setStorage(int ... sizes);

    public Computer getInstance() {
        return this.composite;
    }
}
