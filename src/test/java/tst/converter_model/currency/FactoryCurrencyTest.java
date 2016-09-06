package tst.converter_model.currency;

import converter_model.currency.FactoryCurrency;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;


public class FactoryCurrencyTest {

    @Test
    public void testGetCurrencyForEURO() throws Exception {
        final FactoryCurrency factoryCurrency = new FactoryCurrency();
        final String inputValue = "EURO";
        assertNotNull(factoryCurrency.getCurrency(inputValue));
    }

    @Test
    public void testGetCurrencyForUSD() throws Exception {
        final FactoryCurrency factoryCurrency = new FactoryCurrency();
        final String inputValue = "USD";
        assertNotNull(factoryCurrency.getCurrency(inputValue));
    }

}