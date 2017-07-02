import java.math.BigDecimal;

public class LatteCoffee extends Drink {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("4.99");
    }

    @Override
    public String getDescription() {
        return "Latte Coffee";
    }
}
