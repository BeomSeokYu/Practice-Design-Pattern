package singleton;

public class Config {
//    private static Config config;
    protected static Config config;

//    private Config() {
//        System.out.println("객체 생성 완료");
//    }

    // protected를 통해 상속이 가능하게 처리하여 확장 가능
    protected Config() {
        System.out.println("Config 생성 완료");
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

}
