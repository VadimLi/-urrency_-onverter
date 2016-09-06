package converter_view;

import converter_model.currency.FactoryCurrency;
import converter_view.observer_currency.Currency;
import converter_view.observer_currency.CurrencyObserver;
import converter_view.observer_currency.ObserverLabelEURO;
import converter_view.observer_currency.ObserverLabelUSD;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ConverterCurrencyView {

    private final TextField fieldCurrency = new TextField();

    private final ObserverLabelUSD labelResultUSD = new ObserverLabelUSD(fieldCurrency);

    private final ObserverLabelEURO labelResultEURO = new ObserverLabelEURO(fieldCurrency);

    private final Button resultButton = new Button();

    private final Currency currency = new Currency();

    private final VBox vBox = new VBox();

    public ConverterCurrencyView() {
        final HBox hBox = new HBox();
        hBox.getChildren().addAll(fieldCurrency,
                                  resultButton,
                                  labelResultUSD,
                                  labelResultEURO);
        hBox.setSpacing(ConstantsView.H_BOX_SPACING);
        vBox.getChildren().addAll(hBox);
        vBox.setSpacing(ConstantsView.V_BOX_SPACING);
        vBox.setPadding(new Insets( ConstantsView.V_BOX_PADDING_BOTTOM,
                                    ConstantsView.V_BOX_PADDING_LEFT,
                                    ConstantsView.V_BOX_PADDING_RIGHT,
                                    ConstantsView.V_BOX_PADDING_TOP));
    }

    public Label getLabelResultUSD() {
        labelResultUSD.setMinWidth(ConstantsView.MIN_WIDTH_RESULT_LABEL);
        return labelResultUSD;
    }

    public Label getLabelResultEURO() {
        labelResultEURO.setMinWidth(ConstantsView.MIN_WIDTH_RESULT_LABEL);
        return labelResultEURO;
    }

    public Button getResultButton() {
        resultButton.setText(ConstantsView.TEXT_RESULT_BUTTON);
        resultButton.setMinWidth(ConstantsView.MIN_SIZE_RESULT_BUTTON);
        return resultButton;
    }

    public VBox getVbox() {
        return vBox;
    }

    public void setResult(final CurrencyObserver labelResult) {
        currency.addCurrency(labelResult);
    }

    public void updateResult(final FactoryCurrency factoryCurrency) throws IOException {
        currency.updateResult(factoryCurrency);
    }

}
