public class Run {

    public static void main(String[] args) {

        Meal meal1 = Meal.buildMeal()
                .withBeefBurger()
                .withChickenBurger()
                .withCoke()
                .withPepsi()
                .withPepsi()
                .withPepsi()
                .prepare();

        meal1.showItemsInList();
        System.out.println(meal1.getTotalCost());

    }
}
