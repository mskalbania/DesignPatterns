package currencyExchanger;

import org.json.JSONArray;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static currencyExchanger.ExchangeRates.ExchangeRate;

public class JSONParser {

    public static ExchangeRates parseAllRatesForPLN(JSONObject ratesForPLN) {

        Map<String, ExchangeRate> exchangeRateMap = new HashMap<>();
            JSONArray ratesArray = ratesForPLN.getJSONArray("rates");
            for (Object singleRecord : ratesArray) {
                String currentCurrencyName = ((JSONObject) singleRecord).getString("currency");
                BigDecimal rate = ((JSONObject) singleRecord).getBigDecimal("mid");
                exchangeRateMap.put(currentCurrencyName, new ExchangeRate(rate, rate));
            }

        return new ExchangeRates("PLN", exchangeRateMap);
    }
}
