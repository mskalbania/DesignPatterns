package AbstractFactory;

import AbstractFactory.factories.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory){
        setCheese(pizzaIngredientsFactory.createCheese());
        setDough(pizzaIngredientsFactory.createDough());
        setSauce(pizzaIngredientsFactory.createSauce());
    }

}
