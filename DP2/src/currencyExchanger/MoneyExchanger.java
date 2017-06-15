package currencyExchanger;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Collections;
import java.util.Map;

import static currencyExchanger.ExchangeRates.*;

//Not thread safe currencyExchanger.MoneyExchanger Singleton
public class MoneyExchanger {

    private static MoneyExchanger instance;
    private Map<String, ExchangeRates> rates;

    private MoneyExchanger() {
    }

    public void loadRates(Map<String, ExchangeRates> rates) {
        this.rates = rates;
    }

    public static MoneyExchanger getInstance() {
        if (instance == null) {
            instance = new MoneyExchanger();
        }
        return instance;
    }

    public Map<String, ExchangeRates> getRates() {
        return Collections.unmodifiableMap(rates);
    }

    public Money buy(String currentCurrency, String targetCurrency, BigDecimal amount) {
        ExchangeRates tempRates = rates.getOrDefault(currentCurrency, null);
        if (tempRates != null) {
            ExchangeRate tempRate = tempRates.getExchangeRatesMap().getOrDefault(targetCurrency, null);
            if (tempRate != null) {
                BigDecimal targetAmount = amount.divide(tempRate.getSellPrice(), new MathContext(5));
                return new Money(targetAmount, targetCurrency);
            }
        }
        throw new RuntimeException("Either current or target not found in db");
    }
}