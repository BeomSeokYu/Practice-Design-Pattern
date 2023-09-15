import creational.abstractfactory.*;
import creational.builder.Builder;
import creational.builder.Computer;
import creational.builder.ProductModel;
import creational.builder.createcustom.CustomBuilder;
import creational.builder.createcustom.CustomFactory;
import creational.factory.Factory;
import creational.factory.Hello;
import creational.factorymethod.LgProduct;
import creational.factorymethod.Product;
import creational.factorymethod.ProductFactory;
import creational.prototype.Prototype;
import creational.singleton.Env;
import structural.adapter.Adapter;
import structural.adapter.Objects;
import structural.bridge.patterndesign1.English;
import structural.bridge.patterndesign1.Korean;
import structural.bridge.patterndesign1.Language;
import structural.bridge.oldcode.Greeting;
import structural.bridge.oldcode.Hello2;
import structural.bridge.patterndesign2.Message;

class Main {
    public static void main(String[] args) {
//        Creational.factory();
//        Creational.singleton();
//        Creational.factoryMethod();
//        Creational.abstractFactory();
//        Creational.builder();
//        Creational.prototype();

//        Structural.adapter();
        Structural.bridge();
    }


    /****************************************************************
     * CREATIONAL PATTERN
     ****************************************************************/
    static class Creational {
        public static void factory() {
            /* Factory */
            System.out.println(new Hello().greeting(Factory.KOREAN));
            System.out.println(new Hello().greeting(Factory.ENGLISH));
            // Sinple Factory
            System.out.println(new creational.factory.simplefactory.Hello().greeting(Factory.KOREAN));
            System.out.println(new creational.factory.simplefactory.Hello().greeting(Factory.ENGLISH));
        }

        public static void singleton() {
            /* Singleton */
//        System.out.println(Config.getInstance());
//        System.out.println(Config.getInstance());
            System.out.println(Env.getInstance()); // Config 상속
            System.out.println(Env.getInstance());
            Env.getInstance().setting();
        }

        public static void factoryMethod() {
            /* Factory Method */
            creational.factorymethod.Factory factory = new ProductFactory();
            LgProduct lgProduct = factory.create();
            lgProduct.name();
            creational.factorymethod.selectimpliment.Factory selFactory = new creational.factorymethod.selectimpliment.ProductFactory();
            Product gram = selFactory.create(creational.factorymethod.selectimpliment.ProductFactory.SAMSUNG);
            Product galbook = selFactory.create(creational.factorymethod.selectimpliment.ProductFactory.LG);
            gram.name();
            galbook.name();
        }

        public static void abstractFactory() {
            /* Abstract Factory */
            TireProduct tireProduct;
            DoorProduct doorProduct;

            KoreaFactory koreaFactory = new KoreaFactory();
            tireProduct = koreaFactory.createTire();
            doorProduct = koreaFactory.createDoor();
            tireProduct.makeAssemble();
            doorProduct.makeAssemble();
            System.out.println(tireProduct instanceof KoreaTireProduct);

            StateFactory stateFactory = new StateFactory();
            tireProduct = stateFactory.createTire();
            doorProduct = stateFactory.createDoor();
            tireProduct.makeAssemble();
            doorProduct.makeAssemble();
            System.out.println(tireProduct instanceof StateTireProduct);
        }

        public static void builder() {
            /* Builder */
            Builder builder = new creational.builder.Factory(new ProductModel());
            Computer buildCom = (Computer) builder.defaultBuilder().build();
            System.out.println(buildCom);
            System.out.println("================================================================");
            CustomBuilder customBuilder = new CustomFactory(new ProductModel());
            Computer customBuildCom = (Computer) customBuilder
                    .setCpu("i9-13900")
                    .setRam(16, 16)
                    .setStorage(256, 512)
                    .build();
            System.out.println(customBuildCom);
        }

        public static void prototype() {
            /* Prototype */
            Prototype obj1 = new Prototype();
            obj1.setValue(100);
            Prototype obj2 = obj1.clone();
            System.out.println("obj1 value = " + obj1.getValue());
            System.out.println("obj2 value = " + obj2.getValue());
        }
    }

    /****************************************************************
     * STRUCTURAL PATTERN
     ****************************************************************/
    static class Structural {
        public static void adapter() {
            Adapter obj = new Objects();
            System.out.println(obj.twiceOf(5));
            System.out.println(obj.halfOf(4));
        }

        public static void bridge() {
            System.out.println(new structural.bridge.oldcode.Hello().greeting());
            System.out.println(new Hello2().greeting(Hello2.KOREAN));
            System.out.println(new Greeting().greeting_ko());

            // 패턴 1
            Language language = new Language();
            language.setEnglish(new English());
            language.setKorean(new Korean());
            System.out.println(language.getEnglish().greeting());
            System.out.println(language.getKorean().greeting());

            // 패턴 2
            structural.bridge.patterndesign2.Language korean = new Message(new structural.bridge.patterndesign2.Korean());
            structural.bridge.patterndesign2.Language english = new Message(new structural.bridge.patterndesign2.English());
            System.out.println(korean.greeting());
            System.out.println(english.greeting());
        }
    }

    /****************************************************************
     * BEHAVIORAL PATTERN
     ****************************************************************/
    static class Behavioral {

    }
}