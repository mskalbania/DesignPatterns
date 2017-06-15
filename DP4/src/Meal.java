import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> itemList;

    public Meal() {
        itemList = new ArrayList<>();
    }

    public Meal(List<Item> items){
        itemList = items;
    }

    public static MealBuilder buildMeal(){
        return new MealBuilder();
    }

    public void addItemToList(Item item) {
        itemList.add(item);
    }

    public float getTotalCost() {
        return itemList.stream()
                .map(Item::price)
                .reduce(0.0f, (item1, item2) -> item1 + item2);
    }

    public void showItemsInList(){
        itemList.forEach(item -> System.out.println(item.name()
                + " | " + item.packing().pack() + " | " + item.price()));
    }



}
