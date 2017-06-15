package currencyExchanger;

import java.util.HashMap;
import java.util.Map;

public class NPBService {

    private Map<String,ExchangeRates> targetRates;

    public NPBService() {
        this.targetRates = new HashMap<>();
    }


}
