package converter_controller;

import converter_model.currency.FactoryCurrency;
import converter_view.ConverterCurrencyView;
import converter_view.observer_currency.CurrencyObserver;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class CurrencyController {

    private final ConverterCurrencyView converterCurrencyView;

    private final FactoryCurrency factoryCurrency;

    public CurrencyController(final ConverterCurrencyView converterCurrencyView) {
        this.converterCurrencyView = converterCurrencyView;

        factoryCurrency = new FactoryCurrency();
    }

    public Button getResultButton() {
        return converterCurrencyView.getResultButton();
    }

    public void addResult()  {
        converterCurrencyView.setResult((CurrencyObserver) converterCurrencyView.getLabelResultUSD());
        converterCurrencyView.setResult((CurrencyObserver) converterCurrencyView.getLabelResultEURO());
        try {
            converterCurrencyView.updateResult(factoryCurrency);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public VBox getVbox() {
        return converterCurrencyView.getVbox();
    }

}