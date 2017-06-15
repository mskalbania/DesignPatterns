package currencyExchanger;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRates {

    private String currencyName;
    private Map<String, ExchangeRate> exchangeRatesMap;

    public ExchangeRates(String currencyName) {
        this.currencyName = currencyName;
        this.exchangeRatesMap = new HashMap<>();
    }

    public ExchangeRates(String currencyName, Map<String, ExchangeRate> exchangeRatesMap) {
        this.currencyName = currencyName;
        this.exchangeRatesMap = exchangeRatesMap;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public Map<String, ExchangeRate> getExchangeRatesMap() {
        return exchangeRatesMap;
    }

    static class ExchangeRate {
        private BigDecimal sellPrice;
        private BigDecimal buyPrice;

        public ExchangeRate(BigDecimal sellPrice, BigDecimal buyPrice) {
            this.sellPrice = sellPrice;
            this.buyPrice = buyPrice;
        }

        public BigDecimal getSellPrice() {
            return sellPrice;
        }

        public BigDecimal getBuyPrice() {
            return buyPrice;
        }
    }
}

