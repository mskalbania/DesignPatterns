package AbstractFactory.factories;

import AbstractFactory.ingredients.*;

public class AmericanIngredients implements PizzaIngredientsFactory {
    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
