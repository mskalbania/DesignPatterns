package AbstractFactory.ingredients;

import AbstractFactory.ingredients.Dough;

public class ThinDough implements Dough {
    @Override
    public String getDescription() {
        return "ThinDough";
    }
}
