import converter_controller.CurrencyController;
import converter_view.ConverterCurrencyView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConverterCurrencyDemo extends Application {

    private static final String TITLE = "Converter currency";

    private static final int WIDTH_FRAME = 500;

    private static final int HEIGHT_FRAME = 400;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final CurrencyController currencyController = new CurrencyController(new ConverterCurrencyView());
        final Scene scene = new Scene(new javafx.scene.Group());
        stage.setTitle(TITLE);
        stage.setWidth(WIDTH_FRAME);
        stage.setHeight(HEIGHT_FRAME);
        currencyController.getResultButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                currencyController.addResult();
            }
        });

        ((Group) scene.getRoot()).getChildren().addAll(currencyController.getVbox());

        stage.setScene(scene);
        stage.show();
    }

}
