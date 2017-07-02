import java.math.BigDecimal;

public class Milk extends Addon {

    private Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " with Milk";
    }

    @Override
    public BigDecimal getCost() {
        return drink.getCost().add(new BigDecimal("0.3"));
    }
}
