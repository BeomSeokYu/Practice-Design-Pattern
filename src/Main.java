import abstractfactory.*;
import factorymethod.LgProduct;
import factorymethod.Factory;
import factorymethod.Product;
import factorymethod.ProductFactory;

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
}