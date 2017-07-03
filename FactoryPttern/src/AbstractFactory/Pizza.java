package AbstractFactory;

import AbstractFactory.ingredients.Cheese;
import AbstractFactory.ingredients.Dough;
import AbstractFactory.ingredients.Sauce;

public abstract class Pizza {

    private Sauce sauce;
    private Cheese cheese;
    private Dough dough;

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "\nSauce: " + sauce.getDescription() +
                "Cheese: " + cheese.getDescription() +
                "Dough: " + dough.getDescription();
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }
}
