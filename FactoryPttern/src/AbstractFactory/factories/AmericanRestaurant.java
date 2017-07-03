package AbstractFactory.factories;

import AbstractFactory.CheesePizza;
import AbstractFactory.Pizza;

public class AmericanRestaurant implements Restaurant {
    @Override
    public Pizza getPizza() {
        return new CheesePizza(new AmericanIngredients());
    }
}
