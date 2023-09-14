import builder.*;
import builder.Factory;
import builder.createcustom.CustomBuilder;
import builder.createcustom.CustomFactory;

class Main {
    public static void main(String[] args) {
//        /* Factory */
//        System.out.println(new Hello().greeting(Factory.KOREAN));
//        System.out.println(new Hello().greeting(Factory.ENGLISH));
//        // Sinple Factory
//        System.out.println(new factory.simplefactory.Hello().greeting(Factory.KOREAN));
//        System.out.println(new factory.simplefactory.Hello().greeting(Factory.ENGLISH));

//        /* Singleton */
////        System.out.println(Config.getInstance());
////        System.out.println(Config.getInstance());
//        System.out.println(Env.getInstance()); // Config 상속
//        System.out.println(Env.getInstance());
//        Env.getInstance().setting();

//        /* Factory Method */
//        Factory factory = new ProductFactory();
//        LgProduct lgProduct = factory.create();
//        lgProduct.name();
//        factorymethod.selectimpliment.Factory selFactory = new factorymethod.selectimpliment.ProductFactory();
//        Product gram = selFactory.create(factorymethod.selectimpliment.ProductFactory.SAMSUNG);
//        Product galbook = selFactory.create(factorymethod.selectimpliment.ProductFactory.LG);
//        gram.name();
//        galbook.name();

//        /* Abstract Factory */
//        TireProduct tireProduct;
//        DoorProduct doorProduct;
//
//        KoreaFactory koreaFactory = new KoreaFactory();
//        tireProduct = koreaFactory.createTire();
//        doorProduct = koreaFactory.createDoor();
//        tireProduct.makeAssemble();
//        doorProduct.makeAssemble();
//        System.out.println(tireProduct instanceof KoreaTireProduct);
//
//        StateFactory stateFactory = new StateFactory();
//        tireProduct = stateFactory.createTire();
//        doorProduct = stateFactory.createDoor();
//        tireProduct.makeAssemble();
//        doorProduct.makeAssemble();
//        System.out.println(tireProduct instanceof StateTireProduct);

        /* Builder */
        Builder builder = new Factory(new ProductModel());
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
}