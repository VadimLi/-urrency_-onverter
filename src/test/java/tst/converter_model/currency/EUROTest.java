package tst.converter_model.currency;

import converter_model.ContextCurrency;
import converter_model.currency.EURO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EUROTest {

    @Test
    public void testGetValueOfTransfer() throws Exception {
        final EURO euro = new EURO();
        Double inputCurrencyEuro = ContextCurrency.EURO.getValueOfCurrency();
        Double actualCurrencyEuro = euro.getValueOfCurrency();
        assertEquals(inputCurrencyEuro, actualCurrencyEuro);
    }

}