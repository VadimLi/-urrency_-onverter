package converter_model.currency_parser;

import converter_model.ContextCurrency;
import junit.framework.TestCase;
import org.junit.Test;

public class USDParserTest extends TestCase {

    @Test
    public void testGetParserCurrency() throws Exception {
        final USDParser usdParser = new USDParser();
        final double inputValue = ContextCurrency.USD.getValueOfCurrency();
        final double actualValue = usdParser.getParserCurrency();
        assertEquals(inputValue, actualValue);
    }

}