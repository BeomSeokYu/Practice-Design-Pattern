package structural.adapter;

public class Objects implements Adapter{
    private final Math adapter;

    public Objects() {
        this.adapter = new Math();
    }

    @Override
    public int twiceOf(int num) {
        return (int) this.adapter.twoTime((float) num);
    }

    @Override
    public int halfOf(int num) {
        return (int) this.adapter.halfTime((float) num);
    }
}
