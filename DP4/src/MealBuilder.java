public class MealBuilder {

    private Meal ongoingMealBuilding;

    public MealBuilder(){
        ongoingMealBuilding = new Meal();
    }

    public Meal prepare(){
        return ongoingMealBuilding;
    }

    public MealBuilder withChickenBurger(){
        ongoingMealBuilding.addItemToList(new ChickenBurger());
        return this;
    }

    public MealBuilder withBeefBurger(){
        ongoingMealBuilding.addItemToList(new BeefBurger());
        return this;
    }

    public MealBuilder withCoke(){
        ongoingMealBuilding.addItemToList(new Coke());
        return this;
    }

    public MealBuilder withPepsi(){
        ongoingMealBuilding.addItemToList(new Pepsi());
        return this;
    }


}
