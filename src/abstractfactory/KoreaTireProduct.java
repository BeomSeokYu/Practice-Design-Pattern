package abstractfactory;

public class KoreaTireProduct implements TireProduct {
    @Override
    public void makeAssemble() {
        System.out.println("한국형 타이어 장착");
    }
}
