package builder;

public class ProductModel extends Algorithm {

    public ProductModel() {
        System.out.println("빌드 객체를 저장");
        this.composite = new Computer();
    }

    @Override
    public void setCpu(String cpu) {
        System.out.println("set cpu");
        this.composite.cpu = cpu;
    }

    @Override
    public void setRam(int ... sizes) {
        System.out.println("set ram");
        for(int size : sizes) {
            System.out.println("슬롯 " + size + "GB 장착");
            composite.ram.add(new Memory(size));
        }
    }

    @Override
    public void setStorage(int ... sizes) {
        System.out.println("set storage");
        for(int size : sizes) {
            System.out.println("슬롯 " + size + "GB 장착");
            composite.storage.add(new Storage(size));
        }
    }
}
