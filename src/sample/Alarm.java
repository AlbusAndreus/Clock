package sample;

import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicReference;

public class Alarm {

    public static void display() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Timer");
        window.setMinWidth(250);
        window.setMinHeight(500);
        GridPane gp = new GridPane();

        Label pickaDate = new Label("Pick a date for the reminder");
        gp.setConstraints(pickaDate, 0, 0);

        DatePicker datePicker = new DatePicker();
        gp.setConstraints(datePicker, 0, 1);
        Label pickaTime = new Label("Pick a time for the reminder.");
        gp.setConstraints(pickaTime, 0, 2);


        Spinner Hour = new Spinner();
        gp.setConstraints(Hour, 0, 3);
        Hour.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,23));

        Spinner Minute = new Spinner();
        gp.setConstraints(Minute, 1, 3);
        Minute.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,59));

        Spinner Second = new Spinner();
        gp.setConstraints(Second, 2, 3);
        Second.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,59));

        ArrayList<String> e = new ArrayList<>();
        e.add("AM");
        e.add("PM");

        ComboBox cb = new ComboBox(FXCollections.observableArrayList(e));
        gp.setConstraints(cb, 3, 3);


        boolean state = true;


        FileChooser musicChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Wav files, (*.wav)", "wav");
        musicChooser.getExtensionFilters().add(extFilter);

        String filepath;
        Button chooseFile = new Button("Choose File");
        gp.setConstraints(chooseFile, 0, 4);
        chooseFile.setOnAction(event -> {
            File music = musicChooser.showOpenDialog(null);
            // filepath.set(music.getPath());
        });


        Button setAlarm = new Button("Set Alarm");
        gp.setConstraints(setAlarm, 0, 5);
        setAlarm.setOnAction(event -> {
            int hours = (int) Hour.getValue();
            int minutes = (int) Minute.getValue();
            int seconds = (int) Second.getValue();

            if(Hour.getValue()==null){
                hours = 0;
            }
            if(Minute.getValue()==null){
                minutes = 0;
            }
            if(Second.getValue()==null){
                seconds = 0;
            }


            LocalDate localDate = datePicker.getValue();
            Calendar ft = Calendar.getInstance();
            ft.set(localDate.getYear(), localDate.getMonthValue()-1, localDate.getDayOfMonth());
            ft.set(Calendar.HOUR, hours );
            ft.set(Calendar.MINUTE, minutes);
            ft.set(Calendar.SECOND, seconds);
            //int Time =  hours+ minutes + seconds;

            while (state) {
                Calendar now = Calendar.getInstance();
                long currentdatetime = System.currentTimeMillis();
                now.setTimeInMillis(currentdatetime);
                if (now.get(Calendar.YEAR) == ft.get(Calendar.YEAR) && now.get(Calendar.MONTH) == ft.get(Calendar.MONTH) && now.get(Calendar.HOUR_OF_DAY) == (int) Hour.getValue() && now.get(Calendar.MINUTE) == (int) Minute.getValue() && now.get(Calendar.SECOND) == (int) Second.getValue())  {
                    sample.TimerAlert.display("Time is up.");
                    break;
                }
            }
/*
            int Hour = 0;
            int Minute = 0;

            for(int count = 0; count < time.length()-1; count++){
                if(time.charAt(count) == ':' && time.charAt(count+1) != ':'){
                    String minute = time.substring(count+1, time.length()-1);
                    Minute = Integer.parseInt(minute);
                    String hour = time.substring(0, count-1);
                    Hour =  Integer.parseInt(hour);
                }else if(!time.contains(":")){
                    String Message = "Improperly formatted Time. There must be a ':' to separate hours from minutes";
                    ErrorAlert.display(Message);
                }else if (time.contains("::")){
                    String Message = "Improperly formatted time. Too many ':'s.";
                    ErrorAlert.display(Message);
                }
            }*/
            /*
            Hour = Hour*60*60*1000;
            Minute = Minute*60*1000;

            Calendar datetime = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm zzz");
            //datetime.setTime(sdf.parse(date, Time));

            LocalDate selectedDate = datePicker.getValue();

            Timer timer1 = new Timer();
            TimerTask tt = new TimerTask(){
                public void run(){
                    Calendar cal = Calendar.getInstance(); //this is the method you should use, not the Date(), because it is desperated.

                    int hour = cal.get(Calendar.HOUR);
                    int minute = cal.get(Calendar.MINUTE);
                    */
                    /*if(hour == datetime.getHours() && minute == datetime.getMinutes()){
                        System.out.println("doing the scheduled task");


                }
            }*/




            // playMusic(filepath);
        });

        gp.getChildren().addAll(pickaDate,datePicker,pickaTime,Hour, Second, Minute, chooseFile, setAlarm);

        Scene scene = new Scene(gp);
        window.setScene(scene);
        window.showAndWait();
    }
    public static void playMusic(String filepath){
        InputStream music;

        try{
            music = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}