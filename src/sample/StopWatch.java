package sample;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Handler;

public class StopWatch {

    static int Milliseconds = 0;

    static int Seconds = 0;

    static int Minutes = 0;

    static int Hours = 0;

    static int Days = 0;

    static int startCounter = 0;

    static Boolean State = false;

    public static void display(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Stopwatch");
        window.setMinWidth(250);
        window.setMinHeight(500);
        GridPane gp = new GridPane();

        Label days = new Label("0");
        gp.setConstraints(days, 0,0);

        Label hours = new Label("0");
        gp.setConstraints(hours, 1,0);

        Label minutes = new Label("0");
        gp.setConstraints(minutes,2,0);

        Label seconds = new Label("0");
        gp.setConstraints(seconds,3,0);

        Label milliseconds = new Label("0");
        gp.setConstraints(milliseconds, 4,0);

        //Handler mainHandler = new Handler()
        // Task<Void> longRunningTask = new Task<Void>(){}
        Timer mt = new Timer();

        //Platform.runLater is not updating gui. It hangs the gui instead
        TimerTask tm = new TimerTask() {
            @Override
            public void run() {

                Platform.runLater(() -> {

                    window.setOnCloseRequest(event-> {
                        startCounter = 0;
                        mt.cancel();
                        mt.purge();
                        Milliseconds = 0;
                        Seconds = 0;
                        Minutes = 0;
                        Hours = 0;
                        Days = 0;
                    });


                    if (State) {
                        try {

                            if (Milliseconds > 999) {
                                Milliseconds = 0;
                                Seconds++;
                            }
                            if (Seconds > 59) {
                                Milliseconds = 0;
                                Seconds = 0;
                                Minutes++;
                            }
                            if (Minutes > 59) {
                                Milliseconds = 0;
                                Seconds = 0;
                                Minutes = 0;
                                Hours++;
                            }
                            if (Hours > 23) {
                                Milliseconds = 0;
                                Seconds = 0;
                                Minutes = 0;
                                Hours = 0;
                                Days++;
                            }
                            milliseconds.setText(" : " + Milliseconds);
                            Milliseconds++;
                            seconds.setText(" : " + Seconds);
                            minutes.setText(" : " + Minutes);
                            hours.setText(" : " + Hours);
                            days.setText(" : " + Days);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                });
            }
        };

        Button start = new Button("Start");
        GridPane.setConstraints(start, 0,1);
        start.setOnAction(event -> {
            State = true;
            if(startCounter == 0) {
                mt.scheduleAtFixedRate(tm, 1, 1);
                startCounter++;
            }

        });
        Button stop = new Button("Stop");
        GridPane.setConstraints(stop,1,1);
        stop.setOnAction(event-> {
            State = false;
            /*if(!State){
                mt.cancel();
            }*/
        });

        Button restart = new Button("Restart");
        GridPane.setConstraints(restart, 2,1);
        restart.setOnAction(event-> {
            State = false;
            Milliseconds = 0;
            milliseconds.setText(":0");
            Seconds = 0;
            seconds.setText(":0");
            Minutes = 0;
            minutes.setText(":0");
            Hours = 0;
            hours.setText(":0");
            Days = 0;
            days.setText(":0");

        });





        gp.getChildren().addAll(milliseconds,seconds, minutes, hours, days, start, stop, restart);
        Scene scene = new Scene(gp);
        window.setScene(scene);
        window.show();
    }
    public void Start(Timer mt){

    }

}
