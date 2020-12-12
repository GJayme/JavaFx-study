package javafxstudy;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox boxPrincipal = new VBox();

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
