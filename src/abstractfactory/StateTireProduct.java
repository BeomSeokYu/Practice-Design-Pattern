package abstractfactory;

public class StateTireProduct implements TireProduct {
    @Override
    public void makeAssemble() {
        System.out.println("미국형 타이어 장착");
    }
}
