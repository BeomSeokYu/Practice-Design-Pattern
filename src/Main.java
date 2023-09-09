import factory.Factory;
import factory.Hello;

public class Main {
    public static void main(String[] args) {
        /* Factory */
        System.out.println(new Hello().greeting(Factory.KOREAN));
        System.out.println(new Hello().greeting(Factory.ENGLISH));
        // Sinple Factory
        System.out.println(new factory.simplefactory.Hello().greeting(Factory.KOREAN));
        System.out.println(new factory.simplefactory.Hello().greeting(Factory.ENGLISH));
    }
}