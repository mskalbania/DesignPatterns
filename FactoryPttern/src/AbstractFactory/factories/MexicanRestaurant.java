package AbstractFactory.factories;

import AbstractFactory.CheesePizza;
import AbstractFactory.Pizza;

public class MexicanRestaurant implements Restaurant {
    @Override
    public Pizza getPizza() {
        return new CheesePizza(new MexicanIngredients());
    }
}
