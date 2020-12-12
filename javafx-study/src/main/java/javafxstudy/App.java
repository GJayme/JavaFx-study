package javafxstudy;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        Button botaoA = new Button("A");
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");

        botaoA.setOnAction(e-> System.out.println("A"));
        botaoB.setOnAction(e-> System.out.println("B"));
        botaoC.setOnAction(e-> System.out.println("C"));


        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().add(botaoA);
        box.getChildren().add(botaoB);
        box.getChildren().add(botaoC);

        Scene unicaCena = new Scene(box, 150,  100);

        stage.setScene(unicaCena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}