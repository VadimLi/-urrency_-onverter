package converter_model.currency_parser;

import org.jsoup.nodes.Element;

import java.io.IOException;

public class USDParser implements StrategyParser {

    private static final String ID_CURRENCY = "R01235";

    @Override
    public Double getParserCurrency() throws IOException {
        final Element idCurrency = StrategyParser.super.getDoc().getElementById(ID_CURRENCY);
        String usd = idCurrency.getElementsByTag(TAG).first().text();
        usd = usd.replace(',', '.');
        return Double.parseDouble(usd);
    }

}
