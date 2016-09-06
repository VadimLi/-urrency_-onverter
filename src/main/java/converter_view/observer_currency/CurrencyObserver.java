package converter_view.observer_currency;

import converter_model.currency.FactoryCurrency;

import java.io.IOException;

public interface CurrencyObserver {
    void updateResult(final FactoryCurrency factoryCurrency) throws IOException;
}
