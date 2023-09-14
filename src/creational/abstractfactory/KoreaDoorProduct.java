package creational.abstractfactory;

public class KoreaDoorProduct implements DoorProduct {
    @Override
    public void makeAssemble() {
        System.out.println("한국형 도어 장착");
    }
}
