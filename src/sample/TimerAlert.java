package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TimerAlert {
    public static void display(String Message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Timer Alert");
        window.setMinWidth(250);
        GridPane gp = new GridPane();

        Label message = new Label("The timer has reached 0. Time is up.");
        gp.setConstraints(message, 0,0);

        Label mcontinued = new Label(Message);
        gp.setConstraints(mcontinued, 0,1);


        gp.getChildren().addAll(message, mcontinued);

        Scene scene = new Scene(gp);
        window.setScene(scene);
        window.showAndWait();
    }
}
