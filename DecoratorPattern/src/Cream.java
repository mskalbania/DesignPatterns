import java.math.BigDecimal;

public class Cream extends Addon {

    private Drink drink;

    public Cream(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " with Cream";
    }

    @Override
    public BigDecimal getCost() {
        return drink.getCost().add(new BigDecimal("1.00"));
    }
}
