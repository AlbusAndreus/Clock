package sample;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Clock {
    //variables for keeping track of date and time from Calender
    static int millis;
    static int seconds;
    static int minutes;
    static int hours;
    static int daysOfMonth;
    static String months;
    static String daysOfWeek;
    static int years;

    public static void display(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Clock");
        window.setMinWidth(250);
        GridPane gp = new GridPane();

        Label milli = new Label();
        GridPane.setConstraints(milli, 7,0);

        Label second = new Label();
        GridPane.setConstraints(second, 6,0);

        Label minute = new Label();
        GridPane.setConstraints(minute, 5,0);

        Label hour = new Label();
        GridPane.setConstraints(hour, 4,0);

        Label dayOfMonth = new Label();
        GridPane.setConstraints(dayOfMonth, 3,0);

        Label month = new Label();
        GridPane.setConstraints(month, 2,0);

        Label dayOfWeek = new Label();
        GridPane.setConstraints(dayOfWeek,1,0);

        Label year = new Label();
        GridPane.setConstraints(year, 0,0);

        Timer tm = new Timer();

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                Platform.runLater(() -> {
                    Calendar now = Calendar.getInstance();

                    millis = now.get(Calendar.MILLISECOND);
                    seconds = now.get(Calendar.SECOND);
                    minutes = now.get(Calendar.MINUTE);
                    hours = now.get(Calendar.HOUR);
                    daysOfMonth = now.get(Calendar.DAY_OF_MONTH);
                    determineDayOfWeek(now.get(Calendar.DAY_OF_WEEK));

                    switch (now.get(Calendar.MONTH)){
                        case 0:
                            months = "January";
                            break;
                        case 1:
                            months = "February";
                            break;
                        case 2:
                            months = "March";
                            break;
                        case 3:
                            months = "April";
                            break;
                        case 4:
                            months = "May";
                            break;
                        case 5:
                            months = "June";
                            break;
                        case 6:
                            months = "July";
                            break;
                        case 7:
                            months = "August";
                            break;
                        case 8:
                            months = "September";
                            break;
                        case 9:
                            months = "October";
                            break;
                        case 10:
                            months = "November";
                            break;
                        case 11:
                            months = "December";
                            break;
                    }
                    years = now.get(Calendar.YEAR);


                    milli.setText(String.valueOf(":" + millis));
                    second.setText(String.valueOf(":" + seconds));
                    minute.setText(String.valueOf(":" + minutes));
                    hour.setText(String.valueOf("-" + hours));
                    dayOfMonth.setText(String.valueOf("-" + daysOfMonth));
                    dayOfWeek.setText(String.valueOf("-" + daysOfWeek));
                    month.setText(String.valueOf("-" + months));
                    year.setText(String.valueOf(years));

                });
            }

        };
        tm.scheduleAtFixedRate(tt,1,1);
        gp.getChildren().addAll(milli, second, minute, hour, dayOfMonth, dayOfWeek, month, year);
        Scene scene = new Scene(gp);
        window.setScene(scene);
        window.showAndWait();
    }
    public static void determineDayOfWeek(int dayOfWeek){

         switch (dayOfWeek){
            case 1:
                daysOfWeek ="Sunday";
                break;
            case 2:
               daysOfWeek = "Monday";
               break;
            case 3:
                daysOfWeek = "Tuesday";
                break;
            case 4:
                daysOfWeek = "Wednesday";
                break;
            case 5:
                daysOfWeek = "Thursday";
                break;
            case 6:
                daysOfWeek = "Friday";
                break;
            case 7:
                daysOfWeek = "Saturday";
                break;
         };

    }
    //figure out why this is going to December when it is May

}
