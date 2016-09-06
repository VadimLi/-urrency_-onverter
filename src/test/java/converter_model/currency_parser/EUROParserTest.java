package converter_model.currency_parser;

import converter_model.ContextCurrency;
import junit.framework.TestCase;
import org.junit.Test;


public class EUROParserTest extends TestCase {

    @Test
    public void testGetParserCurrency() throws Exception {
        final EUROParser euroParser = new EUROParser();
        final double inputValue = ContextCurrency.EURO.getValueOfCurrency();
        final double actualValue = euroParser.getParserCurrency();
        assertEquals(inputValue, actualValue);
    }

}