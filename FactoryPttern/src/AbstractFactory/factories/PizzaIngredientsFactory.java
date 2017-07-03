package AbstractFactory.factories;

import AbstractFactory.ingredients.Cheese;
import AbstractFactory.ingredients.Dough;
import AbstractFactory.ingredients.Sauce;

public interface PizzaIngredientsFactory {

    Sauce createSauce();
    Dough createDough();
    Cheese createCheese();

}
