package AbstractFactory.ingredients;

import AbstractFactory.ingredients.Cheese;

public class MozzarellaCheese implements Cheese {
    @Override
    public String getDescription() {
        return "MozzarellaCheese";
    }
}
