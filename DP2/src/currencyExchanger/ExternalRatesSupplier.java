package currencyExchanger;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class ExternalRatesSupplier {

    private Map<String, ExchangeRates> targetRates;

    public ExternalRatesSupplier() {
        this.targetRates = new HashMap<>();
    }

    private void updateRatesForPLN() {

        try {
            JSONObject PLNObjectReceived = JSONReader.getJSON("http://api.nbp.pl/api/exchangerates/tables/a");
            ExchangeRates parsedPLNRates = JSONParser.parseAllRatesForPLN(PLNObjectReceived);
            targetRates.put("PLN",parsedPLNRates);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, ExchangeRates> getTargetRates() {
        updateRatesForPLN();
        return targetRates;
    }
}
