import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

//Not thread safe MoneyExchanger Singleton
public class MoneyExchanger {

    private static MoneyExchanger instance;
    private Map<String, ExchangeRate> rates;

    private MoneyExchanger() {
        rates = new HashMap<>();

        rates.put("USD", new ExchangeRate(new BigDecimal(3.7220), new BigDecimal(3.7269)));
        rates.put("EUR", new ExchangeRate(new BigDecimal(4.2341), new BigDecimal(4.2556)));
        rates.put("GBP", new ExchangeRate(new BigDecimal(4.7412), new BigDecimal(4.7812)));
        rates.put("CHF", new ExchangeRate(new BigDecimal(3.8412), new BigDecimal(3.8812)));
    }

    public static MoneyExchanger getInstance() {
        if (instance == null) {
            instance = new MoneyExchanger();
        }
        return instance;
    }

    public void addRate(String currency, BigDecimal buyPrice, BigDecimal sellPrice) {
        rates.put(currency, new ExchangeRate(buyPrice, sellPrice));
    }

    public Money buy(BigDecimal amount, String targetCurrency) {
        ExchangeRate rate = rates.getOrDefault(targetCurrency, null);
        if (rate != null) {
            BigDecimal amountInTargetCurrency = amount.divide(rate.getSellPrice(), new MathContext(5));
            return new Money(amountInTargetCurrency, targetCurrency);
        }
        throw new RuntimeException("Target currency not found");
    }

    public Money sell(Money money) {
        ExchangeRate rate = rates.getOrDefault(money.getCurrency(), null);
        if (rate != null) {
            BigDecimal amountInPLN = money.getAmount().multiply(rate.getBuyPrice(), new MathContext(5));
            return new Money(amountInPLN, "PLN");
        }
        throw new RuntimeException("Money currency not found in db");
    }
}
