package AbstractFactory.factories;

import AbstractFactory.ingredients.*;

public class MexicanIngredients implements PizzaIngredientsFactory {
    @Override
    public Sauce createSauce() {
        return new CheeseSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
