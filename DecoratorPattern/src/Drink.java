import java.math.BigDecimal;

public abstract class Drink {

    private String description;

    public String getDescription(){
        return description;
    }

    public abstract BigDecimal getCost();
}
