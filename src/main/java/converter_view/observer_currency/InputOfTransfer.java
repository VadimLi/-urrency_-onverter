package converter_view.observer_currency;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InputOfTransfer extends Label{

    private double res;

    protected double getValueOfTransfer(final TextField fieldOfTransfer) {
        try {
            final double fieldValue = Double.parseDouble(fieldOfTransfer.getText());
            if(fieldValue >= 0) {
                this.res = fieldValue;
            } else {
                this.res = 0.0;
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
