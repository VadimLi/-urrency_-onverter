package converter_model.currency_parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public interface StrategyParser {
    Double getParserCurrency() throws IOException;

    String TAG = "Value";

    default Document getDoc() throws IOException {
        final String url = "http://www.cbr.ru/scripts/XML_daily.asp";
        Document doc = Jsoup.connect(url).get();
        return doc;
    }
}
