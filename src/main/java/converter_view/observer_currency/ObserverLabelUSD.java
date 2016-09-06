package converter_view.observer_currency;

import converter_model.currency.FactoryCurrency;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ObserverLabelUSD extends InputOfTransfer implements CurrencyObserver {

    private static final String USD = "USD";

    private final TextField fieldUSD;

    public ObserverLabelUSD(final TextField fieldUSD) {
         this.fieldUSD = fieldUSD;
    }

    @Override
    public void updateResult(final FactoryCurrency factoryCurrency)  {
        double valueOfCurrency = 0;
        try {
            valueOfCurrency = factoryCurrency.getCurrency(USD).getValueOfCurrency();
        } catch (IOException e) {
            e.printStackTrace();
        }

        final double result = super.getValueOfTransfer(fieldUSD) * valueOfCurrency;
        this.setText(USD + "= " + String.valueOf(result));
    }

}
