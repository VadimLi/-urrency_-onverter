package converter_model.currency_parser;

import org.jsoup.nodes.Element;
import java.io.IOException;

public class EUROParser implements StrategyParser{

    private static final String ID_CURRENCY = "R01239";

    @Override
    public Double getParserCurrency() throws IOException {
        final Element idCurrency = StrategyParser.super.getDoc().getElementById(ID_CURRENCY);
        String euro = idCurrency.getElementsByTag(TAG).first().text();
        euro = euro.replace(',', '.');
        return Double.parseDouble(euro);
    }

}
