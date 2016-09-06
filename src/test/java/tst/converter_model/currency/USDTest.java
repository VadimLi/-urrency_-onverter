package tst.converter_model.currency;

import converter_model.ContextCurrency;
import converter_model.currency.USD;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class USDTest {

    @Test
    public void testGetValueOfTransfer() throws Exception {
        final USD usd = new USD();
        Double inputCurrencyEuro = ContextCurrency.USD.getValueOfCurrency();
        Double actualCurrencyEuro = usd.getValueOfCurrency();
        assertEquals(inputCurrencyEuro, actualCurrencyEuro);
    }

}