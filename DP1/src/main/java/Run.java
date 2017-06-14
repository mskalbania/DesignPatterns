public class Run {
    public static void main(String[] args) {

        //Singleton tests

        new Thread(() -> System.out.println(Singleton.getThreadSafeInstance())).start();
        System.out.println(Singleton.getThreadSafeInstance());
        new Thread(() -> System.out.println(Singleton.getNonThreadSafeInstance())).start();

        //Builder tests

        //Dynamically building products
        Product water = Product.buildProduct()
                .withName("Water")
                .withCategory("Food")
                .withExpirationDate("21.10.2019")
                .withPrice(12)
                .build();

        System.out.println();
        System.out.println(water);

    }
}
