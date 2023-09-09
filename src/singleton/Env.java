package singleton;

public class Env extends Config{

    public void setting() {
        System.out.println("시스템 환경 설정");
    }

    public static Env getInstance() {
        if (config == null) {
            System.out.println("Env 객체 생성");
            config = new Env();
        }
        System.out.println("Env 객체 반환");
        return (Env) config;
    }
}
