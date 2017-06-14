import java.math.BigDecimal;

public class ExchangeRate {

    private BigDecimal buyPrice;
    private BigDecimal sellPrice;

    public ExchangeRate(BigDecimal buyPrice, BigDecimal sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }
}
