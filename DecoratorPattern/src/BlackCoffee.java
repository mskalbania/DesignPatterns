import java.math.BigDecimal;

public class BlackCoffee extends Drink {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("2.99");
    }

    @Override
    public String getDescription() {
        return "Black Coffee";
    }
}
