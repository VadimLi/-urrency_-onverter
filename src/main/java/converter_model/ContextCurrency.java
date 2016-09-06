package converter_model;

import converter_model.currency_parser.EUROParser;
import converter_model.currency_parser.StrategyParser;
import converter_model.currency_parser.USDParser;

import java.io.IOException;

public enum ContextCurrency {

    USD(new USDParser()),
    EURO(new EUROParser());

    private final StrategyParser strategyParser;

    ContextCurrency(final StrategyParser strategyParser) {
        this.strategyParser = strategyParser;
    }

    public Double getValueOfCurrency() throws IOException {
        return strategyParser.getParserCurrency();
    }

}
