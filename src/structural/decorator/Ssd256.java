package structural.decorator;

public class Ssd256 extends Decorate{
    public Component base;

    public Ssd256(Component concrete) {
        this.base = concrete;
    }

    @Override
    public String product() {
        return this.base.product() + ", ssd256";
    }

    @Override
    public int price() {
        return this.base.price() + 60000;
    }
}
