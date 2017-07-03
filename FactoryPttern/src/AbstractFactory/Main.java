package AbstractFactory;


import AbstractFactory.factories.AmericanRestaurant;
import AbstractFactory.factories.MexicanRestaurant;


public class Main {

    public static void main(String[] args) {
        MexicanRestaurant mexicanRestaurant = new MexicanRestaurant();
        AmericanRestaurant americanRestaurant = new AmericanRestaurant();

        Pizza mexicanCheesePizza = mexicanRestaurant.getPizza();
        Pizza americanCheesePizza = americanRestaurant.getPizza();

        System.out.println(mexicanCheesePizza);
        System.out.println(americanCheesePizza);

    }
}

