import java.util.ArrayList;
import java.util.List;

public class MealBuilder {

    private List<Item> itemList;

    public MealBuilder(){
        itemList = new ArrayList<>();
    }

    public MealBuilder withChickenBurger(){
        itemList.add(new ChickenBurger());
        return this;
    }

    public MealBuilder withBeefBurger(){
        itemList.add(new BeefBurger());
        return this;
    }

    public MealBuilder withCoke(){
        itemList.add(new Coke());
        return this;
    }

    public MealBuilder withPepsi(){
        itemList.add(new Pepsi());
        return this;
    }

    public Meal prepare(){
        return new Meal(itemList);
    }

}
