package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane gridPane = new GridPane();
        primaryStage.setTitle("Alarm, Timer, and StopWatch");
        primaryStage.setScene(new Scene(gridPane, 300, 275));
        primaryStage.show();
        Image icon = new Image("sample/Clock bitmap icon.jpg");
        primaryStage.getIcons().add(icon);

        Button Clock = new Button("Clock");
        GridPane.setConstraints(Clock, 0,0);
        Clock.setOnAction(event ->{
           sample.Clock.display();
        });

        //Timer button that launches the Timer window
        Button Timer = new Button("Timer");
        GridPane.setConstraints(Timer, 0,1);
        Timer.setOnAction(e->{
            sample.Timer.display();
        });

        //launches the Alarm window
        Button Alarm = new Button("Alarm");
        GridPane.setConstraints(Alarm, 0,2);
        Alarm.setOnAction(e->{
            sample.Alarm.display();
        });

        //launches the StopWatch window
        Button StopWatch = new Button("StopWatch");
        GridPane.setConstraints(StopWatch, 0,3);
        StopWatch.setOnAction(e->{
            sample.StopWatch.display();
        });


        gridPane.getChildren().addAll(Timer, Alarm, StopWatch, Clock);
    }


    public static void main(String[] args) {
        launch(args);
    }
}