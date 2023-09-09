import factory.Factory;
import factory.Hello;
import singleton.Config;
import singleton.Env;

class Main {
    public static void main(String[] args) {
//        /* Factory */
//        System.out.println(new Hello().greeting(Factory.KOREAN));
//        System.out.println(new Hello().greeting(Factory.ENGLISH));
//        // Sinple Factory
//        System.out.println(new factory.simplefactory.Hello().greeting(Factory.KOREAN));
//        System.out.println(new factory.simplefactory.Hello().greeting(Factory.ENGLISH));

        /* Singleton */
//        System.out.println(Config.getInstance());
//        System.out.println(Config.getInstance());
        System.out.println(Env.getInstance()); // Config 상속
        System.out.println(Env.getInstance());
        Env.getInstance().setting();
    }
}