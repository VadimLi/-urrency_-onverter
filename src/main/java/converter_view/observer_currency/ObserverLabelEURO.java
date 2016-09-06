package converter_view.observer_currency;

import converter_model.currency.FactoryCurrency;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ObserverLabelEURO extends InputOfTransfer implements CurrencyObserver {

    private static final String EURO = "EURO";

    private final TextField fieldEURO;

    public ObserverLabelEURO(final TextField fieldEURO) {
        this.fieldEURO = fieldEURO;
    }

    @Override
    public void updateResult(final FactoryCurrency factoryCurrency)  {
        double valueOfCurrency = 0;
        try {
            valueOfCurrency = factoryCurrency.getCurrency(EURO).getValueOfCurrency();
        } catch (IOException e) {
            e.printStackTrace();
        }
        final double result = super.getValueOfTransfer(fieldEURO) * valueOfCurrency;
        this.setText(EURO + "= " + String.valueOf(result));
    }

}

