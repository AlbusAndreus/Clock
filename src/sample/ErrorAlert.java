package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ErrorAlert {

    public static void display(String Message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Timer");
        window.setMinWidth(250);
        GridPane gp = new GridPane();

        String message = Message;
        Label Message1 = new Label(message);
        gp.setConstraints(Message1, 0,0);

        gp.getChildren().setAll(Message1);

        Scene scene = new Scene(gp);
        window.setScene(scene);
        window.showAndWait();
    }
}
