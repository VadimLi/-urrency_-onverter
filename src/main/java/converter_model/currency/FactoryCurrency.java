package converter_model.currency;

public class FactoryCurrency {

    private final String euro = EURO.CURRENCY_EURO.toString();

    private final String usd = USD.CURRENCY_USD.toString();

    public CurrencyOfTransfer getCurrency(final String currency) {
        if(currency == euro) {
           return new EURO();
        } else if(currency == usd) {
           return new USD();
        }
        return null;
    }

}
