import java.math.BigDecimal;
//SINGLETON EXAMPLE
//CONVERTS PLN TO ANY & ANY TO PLN
public class Run {
    public static void main(String[] args) {

        MoneyExchanger moneyExchanger = MoneyExchanger.getInstance();

        Money boughtUSD = moneyExchanger.buy(new BigDecimal(20), "USD");
        Money boughtEUR = moneyExchanger.buy(new BigDecimal(100), "EUR");
        Money boughtGBP = moneyExchanger.buy(new BigDecimal(500), "GBP");
        Money boughtCHF = moneyExchanger.buy(new BigDecimal(1000), "CHF");

        System.out.println(boughtUSD);
        System.out.println(boughtEUR);
        System.out.println(boughtGBP);
        System.out.println(boughtCHF);

        Money sellUSD = moneyExchanger.sell(boughtUSD);
        Money sellEUR = moneyExchanger.sell(boughtEUR);

        System.out.println("-------");
        System.out.println(sellUSD);
        System.out.println(sellEUR);
    }
}
