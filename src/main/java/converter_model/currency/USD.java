package converter_model.currency;

import converter_model.ContextCurrency;

import java.io.IOException;

public class USD implements CurrencyOfTransfer {

    protected static final ContextCurrency CURRENCY_USD = ContextCurrency.USD;

    @Override
    public double getValueOfCurrency() throws IOException {
        return CURRENCY_USD.getValueOfCurrency();
    }

}
