package abstractfactory;

public class StateDoorProduct implements DoorProduct {
    @Override
    public void makeAssemble() {
        System.out.println("미국형 도어 장착");
    }
}
