package currencyExchanger;

import java.math.BigDecimal;
import java.util.Set;

public class Run {

    public static void main(String[] args) {
        ExternalRatesSupplier externalRatesSupplier = new ExternalRatesSupplier();
        MoneyExchanger moneyExchanger = MoneyExchanger.getInstance();
        moneyExchanger.loadRates(externalRatesSupplier.getTargetRates());

        //showAvailableCurrencyCourses(moneyExchanger);

        Money boughtEuro = moneyExchanger.buy("PLN","euro",new BigDecimal("200"));
        System.out.println(boughtEuro);
    }

    public static void showAvailableCurrencyCourses(MoneyExchanger moneyExchanger){
        moneyExchanger.getRates().values().stream()
                .map(ExchangeRates::getExchangeRatesMap)
                .forEach(map -> {
                    Set keySet = map.keySet();
                    for(Object s : keySet){
                        System.out.println(s.toString());
                        ExchangeRates.ExchangeRate exchangeRate = map.get(s);
                        System.out.println(exchangeRate.getBuyPrice() + " " + exchangeRate.getSellPrice());
                    }
                });
    }
}
