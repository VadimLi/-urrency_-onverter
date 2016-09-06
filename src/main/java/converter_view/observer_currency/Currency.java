package converter_view.observer_currency;

import converter_model.currency.FactoryCurrency;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Currency {

    private final List<CurrencyObserver> currencyObserverList;

    public Currency() {
        currencyObserverList = new ArrayList<>();
    }

    public void addCurrency(final CurrencyObserver currencyObserver) {
        currencyObserverList.add(currencyObserver);
    }

    public void updateResult(final FactoryCurrency factoryCurrency) throws IOException {
        for(final CurrencyObserver currency : currencyObserverList) {
            currency.updateResult(factoryCurrency);
        }
    }

}
