import java.math.BigDecimal;

public class Chocolate extends Addon {
    private Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " with Chocolate";
    }

    @Override
    public BigDecimal getCost() {
        return drink.getCost().add(new BigDecimal("0.6"));
    }
}
