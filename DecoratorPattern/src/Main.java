public class Main {

    public static void main(String[] args) {

        Drink drink1 = new Cream(new Chocolate(new BlackCoffee()));
        System.out.println(drink1.getDescription() + " " + drink1.getCost());

        Drink drink2 = new Milk(new LatteCoffee());
        System.out.println(drink2.getDescription() + " " + drink2.getCost());

    }
}
