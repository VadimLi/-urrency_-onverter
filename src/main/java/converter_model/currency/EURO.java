package converter_model.currency;

import converter_model.ContextCurrency;

import java.io.IOException;

public class EURO implements CurrencyOfTransfer {

    protected static final ContextCurrency CURRENCY_EURO = ContextCurrency.EURO;

    @Override
    public double getValueOfCurrency() throws IOException {
        return CURRENCY_EURO.getValueOfCurrency();
    }

}
