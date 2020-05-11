package sample;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.TimerTask;

public class Timer {

    public static void display(){
        //Creates the stage and window
        //Sets window to take up focus of program and disallows user to click in main window until this window is closed
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Timer");
        window.setMinWidth(250);
        GridPane gp = new GridPane();


        //creates and positions labels and textfields for time parameters
        Label hours = new Label("Hours");
        gp.setConstraints(hours, 0,0);
        Label minutes = new Label("Minutes");
        gp.setConstraints(minutes, 0,1);
        Label seconds = new Label("Seconds");
        gp.setConstraints(seconds,0,2);
        TextField Hours = new TextField();
        gp.setConstraints(Hours, 1,0);
        TextField Minutes = new TextField();
        gp.setConstraints(Minutes, 1,1);
        TextField Seconds = new TextField();
        gp.setConstraints(Seconds, 1,2);

        //Message to user to enter text for personalizable message in textarea
        Label message = new Label("Enter a message to show in the alert box when time is up.");
        gp.setConstraints(message, 0,3);

        //area where user enters personalized message
        TextArea MessageArea = new TextArea();
        gp.setConstraints(MessageArea, 0,4);

        //close button and its function
        Button closeButton = new Button("Close Window");
        gp.setConstraints(closeButton, 0,5);
        closeButton.setOnAction(e-> window.close());

        //Button that sets the timer in motion and its code
        Button setTimer = new Button("Set Timer");
        gp.setConstraints(setTimer, 1,5);
        setTimer.setOnAction(e->{

            int hours1;
            int minutes1;
            int seconds1;

            if(Hours.getText().isEmpty()){
                hours1 = 0;
            }else{
                hours1 = Integer.parseInt(Hours.getText())* 1000 * 60 * 60;
            }

            if(Minutes.getText().isEmpty()){
                minutes1 = 0;
            }else{
                minutes1 = Integer.parseInt(Minutes.getText())*1000*60;
            }

            if(seconds.getText().isEmpty()){
                seconds1 = 0;
            }else{
                seconds1 = Integer.parseInt(Seconds.getText()) * 1000;
            }

            int totaltime = hours1 + minutes1 + seconds1;
            String Message = MessageArea.getText();
            java.util.Timer timer = new java.util.Timer();

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Platform.runLater(()-> {
                        Alarm.playMusic("//C:/users/aleka/desktop/Old-alarm-clock-sound.wav");
                        TimerAlert.display(Message);

                    });

                }}, totaltime);




        });
        gp.getChildren().addAll(closeButton, hours, minutes, seconds, Hours, Minutes, Seconds, setTimer, message, MessageArea);

        //code that sets the scene in motion and shows the window and disables clicking in other windows of program until window is closed
        Scene scene = new Scene(gp);
        window.setScene(scene);
        window.showAndWait();
    }
}
