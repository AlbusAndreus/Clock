package sample;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.*;
import java.util.Timer;

public class Clock {
    //variables for keeping track of date and time from Calender for current localtime
    static String meridiem;
    static int millis;
    static int seconds;
    static int minutes;
    static int hours;
    static int daysOfMonth;
    static String months;
    static String daysOfWeek;
    static int years;

    //variables for keeping track of date and time from Calendar for current EST time
    static String NYTMeridiem;
    static int NYTMillis;
    static int NYTSeconds;
    static int NYTMinutes;
    static int NYTHours;
    static int NYTDaysOfMonth;
    static String NYTMonths;
    static String NYTDaysOfWeek;
    static int NYTYears;

    //variables for keeping track of date and time from Calendar for current CST
    static String CSTMeridiem;
    static int CSTMillis;
    static int CSTSeconds;
    static int CSTMinutes;
    static int CSTHours;
    static int CSTDaysOfMonth;
    static String CSTMonths;
    static String CSTDaysOfWeek;
    static int CSTYears;

    //variables for keeping track of date and time from Calendar for current MST
    static String MSTMeridiem;
    static int MSTMillis;
    static int MSTSeconds;
    static int MSTMinutes;
    static int MSTHours;
    static int MSTDaysOfMonth;
    static String MSTMonths;
    static String MSTDaysOfWeek;
    static int MSTYears;

    //variables for keeping track of date and time from Calendar for current PST
    static String PSTMeridiem;
    static int PSTMillis;
    static int PSTSeconds;
    static int PSTMinutes;
    static int PSTHours;
    static int PSTDaysOfMonth;
    static String PSTMonths;
    static String PSTDaysOfWeek;
    static int PSTYears;

    //variables for keeping track of date and time from Calender for current GMT
    static String GMTMeridiem;
    static int GMTMillis;
    static int GMTSeconds;
    static int GMTMinutes;
    static int GMTHours;
    static int GMTDaysOfMonth;
    static String GMTMonths;
    static String GMTDaysOfWeek;
    static int GMTYears;

    //variables for keeping track of date and time from Calender for current CET
    static String CETMeridiem;
    static int CETMillis;
    static int CETSeconds;
    static int CETMinutes;
    static int CETHours;
    static int CETDaysOfMonth;
    static String CETMonths;
    static String CETDaysOfWeek;
    static int CETYears;

    //variables for keeping track of date and time from Calender for current IST
    static String ISTMeridiem;
    static int ISTMillis;
    static int ISTSeconds;
    static int ISTMinutes;
    static int ISTHours;
    static int ISTDaysOfMonth;
    static String ISTMonths;
    static String ISTDaysOfWeek;
    static int ISTYears;

    //variables for keeping track of date and time from Calender for current MSK
    static String MSKMeridiem;
    static int MSKMillis;
    static int MSKSeconds;
    static int MSKMinutes;
    static int MSKHours;
    static int MSKDaysOfMonth;
    static String MSKMonths;
    static String MSKDaysOfWeek;
    static int MSKYears;

    //variables for keeping track of date and time from Calender for current GET
    static String GETMeridiem;
    static int GETMillis;
    static int GETSeconds;
    static int GETMinutes;
    static int GETHours;
    static int GETDaysOfMonth;
    static String GETMonths;
    static String GETDaysOfWeek;
    static int GETYears;

    //variables for keeping track of date and time from Calender for current ORAT
    static String ORATMeridiem;
    static int ORATMillis;
    static int ORATSeconds;
    static int ORATMinutes;
    static int ORATHours;
    static int ORATDaysOfMonth;
    static String ORATMonths;
    static String ORATDaysOfWeek;
    static int ORATYears;

    //variables for keeping track of date and time from Calender for current ALMT
    static String ALMTMeridiem;
    static int ALMTMillis;
    static int ALMTSeconds;
    static int ALMTMinutes;
    static int ALMTHours;
    static int ALMTDaysOfMonth;
    static String ALMTMonths;
    static String ALMTDaysOfWeek;
    static int ALMTYears;

    //variables for keeping track of date and time from Calender for current Beijing
    static String CSTChineMeridiem;
    static int CSTChinaMillis;
    static int CSTChinaSeconds;
    static int CSTChinaMinutes;
    static int CSTChinaHours;
    static int CSTChinaDaysOfMonth;
    static String CSTChinaMonths;
    static String CSTChinaDaysOfWeek;
    static int CSTChinaYears;

    //variables for keeping track of date and time from Calender for current Tokyo
    static String WITMeridiem;
    static int WITMillis;
    static int WITSeconds;
    static int WITMinutes;
    static int WITHours;
    static int WITDaysOfMonth;
    static String WITMonths;
    static String WITDaysOfWeek;
    static int WITYears;

    //variables for keeping track of date and time from Calender for current Sydney
    static String AEDIMerideim;
    static int AEDIMillis;
    static int AEDISeconds;
    static int AEDIMinutes;
    static int AEDIHours;
    static int AEDIDaysOfMonth;
    static String AEDIMonths;
    static String AEDIDaysOfWeek;
    static int AEDIYears;

    //variables for keeping track of date and time from Calender for current Anadyr
    static String ANATMeridiem;
    static int ANATMillis;
    static int ANATSeconds;
    static int ANATMinutes;
    static int ANATHours;
    static int ANATDaysOfMonth;
    static String ANATMonths;
    static String ANATDaysOfWeek;
    static int ANATYears;

    //variables for keeping track of date and time from Calender for current Wellington
    static String NZDTMeridiem;
    static int NZDTMillis;
    static int NZDTSeconds;
    static int NZDTMinutes;
    static int NZDTHours;
    static int NZDTDaysOfMonth;
    static String NZDTMonths;
    static String NZDTDaysOfWeek;
    static int NZDTYears;

    //variables for keeping track of date and time from Calender for current Fairbanks
    static String AHSTMeridiem;
    static int AHSTMillis;
    static int AHSTSeconds;
    static int AHSTMinutes;
    static int AHSTHours;
    static int AHSTDaysOfMonth;
    static String AHSTMonths;
    static String AHSTDaysOfWeek;
    static int AHSTYears;

    //variables for keeping track of date and time from Calender for current Sao Paulo
    static String BRTMeridiem;
    static int BRTMillis;
    static int BRTSeconds;
    static int BRTMinutes;
    static int BRTHours;
    static int BRTDaysOfMonth;
    static String BRTMonths;
    static String BRTDaysOfWeek;
    static int BRTYears;
    public static void display(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Clock");
        window.setMinWidth(800);
        window.setMinHeight(800);
        GridPane gp = new GridPane();

        Label local = new Label("Local:");
        local.setFont(new Font("Times", 32));
        GridPane.setConstraints(local, 0,0);

        Label meridiem = new Label();
        meridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(meridiem, 9,0);

        Label milli = new Label();
        milli.setFont(new Font("Times", 32));
        GridPane.setConstraints(milli, 8,0);

        Label second = new Label();
        second.setFont(new Font("Times", 32));
        GridPane.setConstraints(second, 7,0);

        Label minute = new Label();
        minute.setFont(new Font("Times", 32));
        GridPane.setConstraints(minute, 6,0);

        Label hour = new Label();
        hour.setFont(new Font("Times", 32));
        GridPane.setConstraints(hour, 5,0);

        Label dayOfMonth = new Label();
        dayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(dayOfMonth, 4,0);

        Label month = new Label();
        month.setFont(new Font("Times", 32));
        GridPane.setConstraints(month, 3,0);

        Label dayOfWeek = new Label();
        dayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(dayOfWeek,2,0);

        Label year = new Label();
        year.setFont(new Font("Times", 32));
        GridPane.setConstraints(year, 1,0);

        Label EST = new Label("New York:");
        EST.setFont(new Font("Times", 32));
        GridPane.setConstraints(EST,0,1);

        Label ESTMeridiem = new Label();
        ESTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(ESTMeridiem, 9,1);

        Label NYTMilli = new Label();
        NYTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(NYTMilli,8,1);

        Label NYTSecond = new Label();
        NYTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(NYTSecond, 7,1);

        Label NYTMinute = new Label();
        NYTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(NYTMinute, 6, 1);

        Label NYTHour = new Label();
        NYTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(NYTHour, 5,1);

        Label NYTDayOfMonth = new Label();
        NYTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(NYTDayOfMonth, 4, 1);

        Label NYTMonth = new Label();
        NYTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(NYTMonth, 3,1);

        Label NYTDayOfWeek = new Label();
        NYTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(NYTDayOfWeek, 2,1);

        Label NYTYear = new Label();
        NYTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(NYTYear, 1,1);

        Label CST = new Label("Houston:");
        CST.setFont(new Font("Times",32 ));
        GridPane.setConstraints(CST,0,2);

        Label CSTMeridiem = new Label();
        CSTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTMeridiem, 9,2);

        Label CSTMilli = new Label();
        CSTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTMilli, 8,2);

        Label CSTSecond = new Label();
        CSTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTSecond, 7,2);

        Label CSTMinute = new Label();
        CSTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTMinute, 6,2);

        Label CSTHour = new Label();
        CSTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTHour, 5,2);

        Label CSTDayOfMonth = new Label();
        CSTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTDayOfMonth, 4,2);

        Label CSTMonth = new Label();
        CSTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTMonth, 3,2);

        Label CSTDayOfWeek = new Label();
        CSTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTDayOfWeek, 2,2);

        Label CSTYear = new Label();
        CSTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTYear,1,2);

        Label MST = new Label("Denver:");
        MST.setFont(new Font("Times", 32));
        GridPane.setConstraints(MST,0,3);

        Label MSTMeridiem = new Label();
        MSTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTMeridiem, 9,3);

        Label MSTMilli = new Label();
        MSTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTMilli, 8,3);

        Label MSTSecond = new Label();
        MSTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTSecond, 7,3);

        Label MSTMinute = new Label();
        MSTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTMinute, 6,3);

        Label MSTHour = new Label();
        MSTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTHour, 5,3);

        Label MSTDayOfMonth = new Label();
        MSTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTDayOfMonth, 4,3);

        Label MSTMonth = new Label();
        MSTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTMonth, 3,3);

        Label MSTDayOfWeek = new Label();
        MSTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTDayOfWeek, 2,3);

        Label MSTYear = new Label();
        MSTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSTYear,1,3);

        Label PST = new Label("San Jose:");
        PST.setFont(new Font("Times", 32));
        GridPane.setConstraints(PST, 0,4);

        Label PSTMeridiem = new Label();
        PSTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTMeridiem, 9,4);

        Label PSTMilli = new Label();
        PSTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTMilli, 8,4);

        Label PSTSecond = new Label();
        PSTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTSecond, 7,4);

        Label PSTMinute = new Label();
        PSTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTMinute, 6,4);

        Label PSTHour = new Label();
        PSTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTHour, 5,4);

        Label PSTDayOfMonth = new Label();
        PSTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTDayOfMonth, 4,4);

        Label PSTMonth = new Label();
        PSTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTMonth, 3,4);

        Label PSTDayOfWeek = new Label();
        PSTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTDayOfWeek, 2,4);

        Label PSTYear = new Label();
        PSTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(PSTYear,1,4);

        Label GMT = new Label("London:");
        GMT.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMT, 0,5);

        Label GMTMeridiem = new Label();
        GMTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTMeridiem, 9,5);

        Label GMTMilli = new Label();
        GMTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTMilli, 8,5);

        Label GMTSecond = new Label();
        GMTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTSecond, 7,5);

        Label GMTMinute = new Label();
        GMTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTMinute, 6,5);

        Label GMTHour = new Label();
        GMTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTHour, 5,5);

        Label GMTDayOfMonth = new Label();
        GMTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTDayOfMonth, 4,5);

        Label GMTMonth = new Label();
        GMTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTMonth, 3,5);

        Label GMTDayOfWeek = new Label();
        GMTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTDayOfWeek, 2,5);

        Label GMTYear = new Label();
        GMTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(GMTYear,1,5);

        Label CET = new Label("Paris:");
        CET.setFont(new Font("Times", 32));
        GridPane.setConstraints(CET, 0,6);

        Label CETmeridiem = new Label();
        CETmeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETmeridiem, 9,6);

        Label CETMilli = new Label();
        CETMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETMilli, 8,6);

        Label CETSecond = new Label();
        CETSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETSecond, 7,6);

        Label CETMinute = new Label();
        CETMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETMinute, 6,6);

        Label CETHour = new Label();
        CETHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETHour, 5,6);

        Label CETDayOfMonth = new Label();
        CETDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETDayOfMonth, 4,6);

        Label CETMonth = new Label();
        CETMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETMonth, 3,6);

        Label CETDayOfWeek = new Label();
        CETDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETDayOfWeek, 2,6);

        Label CETYear = new Label();
        CETYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(CETYear,1,6);

        Label IST = new Label("Jerusalem:");
        IST.setFont(new Font("Times", 32));
        GridPane.setConstraints(IST, 0,7);

        Label ISTMeridiem = new Label();
        ISTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTMeridiem, 9,7);

        Label ISTMilli = new Label();
        ISTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTMilli, 8,7);

        Label ISTSecond = new Label();
        ISTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTSecond, 7,7);

        Label ISTMinute = new Label();
        ISTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTMinute, 6,7);

        Label ISTHour = new Label();
        ISTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTHour, 5,7);

        Label ISTDayOfMonth = new Label();
        ISTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTDayOfMonth, 4,7);

        Label ISTMonth = new Label();
        ISTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTMonth, 3,7);

        Label ISTDayOfWeek = new Label();
        ISTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTDayOfWeek, 2,7);

        Label ISTYear = new Label();
        ISTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(ISTYear,1,7);

        Label MSK = new Label("Moscow:");
        MSK.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSK, 0,8);

        Label MSKMeridiem = new Label();
        MSKMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKMeridiem, 9,8);

        Label MSKMilli = new Label();
        MSKMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKMilli, 8,8);

        Label MSKSecond = new Label();
        MSKSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKSecond, 7,8);

        Label MSKMinute = new Label();
        MSKMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKMinute, 6,8);

        Label MSKHour = new Label();
        MSKHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKHour, 5,8);

        Label MSKDayOfMonth = new Label();
        MSKDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKDayOfMonth, 4,8);

        Label MSKMonth = new Label();
        MSKMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKMonth, 3,8);

        Label MSKDayOfWeek = new Label();
        MSKDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKDayOfWeek, 2,8);

        Label MSKYear = new Label();
        MSKYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(MSKYear,1,8);

        Label GET = new Label("T'bilisi:");
        GET.setFont(new Font("Times", 32));
        GridPane.setConstraints(GET, 0,9);

        Label GETMeridiem = new Label();
        GETMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETMeridiem, 9,9);

        Label GETMilli = new Label();
        GETMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETMilli, 8,9);

        Label GETSecond = new Label();
        GETSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETSecond, 7,9);

        Label GETMinute = new Label();
        GETMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETMinute, 6,9);

        Label GETHour = new Label();
        GETHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETHour, 5,9);

        Label GETDayOfMonth = new Label();
        GETDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETDayOfMonth, 4,9);

        Label GETMonth = new Label();
        GETMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETMonth, 3,9);

        Label GETDayOfWeek = new Label();
        GETDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETDayOfWeek, 2,9);

        Label GETYear = new Label();
        GETYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(GETYear,1,9);

        Label ORAT = new Label("Oral:");
        ORAT.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORAT, 0,10);

        Label ORATMeridiem = new Label();
        ORATMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATMeridiem, 9,10);

        Label ORATMilli = new Label();
        ORATMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATMilli, 8,10);

        Label ORATSecond = new Label();
        ORATSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATSecond, 7,10);

        Label ORATMinute = new Label();
        ORATMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATMinute, 6,10);

        Label ORATHour = new Label();
        ORATHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATHour, 5,10);

        Label ORATDayOfMonth = new Label();
        ORATDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATDayOfMonth, 4,10);

        Label ORATMonth = new Label();
        ORATMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATMonth, 3,10);

        Label ORATDayOfWeek = new Label();
        ORATDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATDayOfWeek, 2,10);

        Label ORATYear = new Label();
        ORATYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(ORATYear,1,10);

        Label ALMT = new Label("Almaty:");
        ALMT.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMT, 0,11);

        Label ALMTMeridiem = new Label();
        ALMTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTMeridiem, 9,11);

        Label ALMTMilli = new Label();
        ALMTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTMilli, 8,11);

        Label ALMTSecond = new Label();
        ALMTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTSecond, 7,11);

        Label ALMTMinute = new Label();
        ALMTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTMinute, 6,11);

        Label ALMTHour = new Label();
        ALMTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTHour, 5,11);

        Label ALMTDayOfMonth = new Label();
        ALMTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTDayOfMonth, 4,11);

        Label ALMTMonth = new Label();
        ALMTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTMonth, 3,11);

        Label ALMTDayOfWeek = new Label();
        ALMTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTDayOfWeek, 2,11);

        Label ALMTYear = new Label();
        ALMTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(ALMTYear,1,11);



        Label CSTChina= new Label("Beijing:");
        CSTChina.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChina, 0,12);

        Label CSTChinaMeridiem = new Label();
        CSTChinaMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaMeridiem, 9,12);

        Label CSTChinaMilli = new Label();
        CSTChinaMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaMilli, 8,12);

        Label CSTChinaSecond = new Label();
        CSTChinaSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaSecond, 7,12);

        Label CSTChinaMinute = new Label();
        CSTChinaMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaMinute, 6,12);

        Label CSTChinaHour = new Label();
        CSTChinaHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaHour, 5,12);

        Label CSTChinaDayOfMonth = new Label();
        CSTChinaDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaDayOfMonth, 4,12);

        Label CSTChinaMonth = new Label();
        CSTChinaMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaMonth, 3,12);

        Label CSTChinaDayOfWeek = new Label();
        CSTChinaDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaDayOfWeek, 2,12);

        Label CSTChinaYear = new Label();
        CSTChinaYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(CSTChinaYear,1,12);

        Label WIT= new Label("Tokyo:");
        WIT.setFont(new Font("Times", 32));
        GridPane.setConstraints(WIT, 0,13);

        Label WITMeridiem = new Label();
        WITMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITMeridiem, 9,13);

        Label WITMilli = new Label();
        WITMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITMilli, 8,13);

        Label WITSecond = new Label();
        WITSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITSecond, 7,13);

        Label WITMinute = new Label();
        WITMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITMinute, 6,13);

        Label WITHour = new Label();
        WITHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITHour, 5,13);

        Label WITDayOfMonth = new Label();
        WITDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITDayOfMonth, 4,13);

        Label WITMonth = new Label();
        WITMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITMonth, 3,13);

        Label WITDayOfWeek = new Label();
        WITDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITDayOfWeek, 2,13);

        Label WITYear = new Label();
        WITYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(WITYear,1,13);

        Label AEDI= new Label("Sydney:");
        AEDI.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDI, 0,14);

        Label AEDIMeridiem = new Label();
        AEDIMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDIMeridiem, 9,14);

        Label AEDIMilli = new Label();
        AEDIMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDIMilli, 8,14);

        Label AEDISecond = new Label();
        AEDISecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDISecond, 7,14);

        Label AEDIMinute = new Label();
        AEDIMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDIMinute, 6,14);

        Label AEDIHour = new Label();
        AEDIHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDIHour, 5,14);

        Label AEDIDayOfMonth = new Label();
        AEDIDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDIDayOfMonth, 4,14);

        Label AEDIMonth = new Label();
        AEDIMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDIMonth, 3,14);

        Label AEDIDayOfWeek = new Label();
        AEDIDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDIDayOfWeek, 2,14);

        Label AEDIYear = new Label();
        AEDIYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(AEDIYear,1,14);

        Label ANAT= new Label("Anadyr:");
        ANAT.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANAT, 0,15);

        Label ANATMeridiem = new Label();
        ANATMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATMeridiem, 9,15);

        Label ANATMilli = new Label();
        ANATMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATMilli, 8,15);

        Label ANATSecond = new Label();
        ANATSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATSecond, 7,15);

        Label ANATMinute = new Label();
        ANATMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATMinute, 6,15);

        Label ANATHour = new Label();
        ANATHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATHour, 5,15);

        Label ANATDayOfMonth = new Label();
        ANATDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATDayOfMonth, 4,15);

        Label ANATMonth = new Label();
        ANATMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATMonth, 3,15);

        Label ANATDayOfWeek = new Label();
        ANATDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATDayOfWeek, 2,15);

        Label ANATYear = new Label();
        ANATYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(ANATYear,1,15);


        Label NZDT= new Label("Wellington:");
        NZDT.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDT, 0,16);

        Label NZDTMeridiem = new Label();
        NZDTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTMeridiem, 9,16);

        Label NZDTMilli = new Label();
        NZDTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTMilli, 8,16);

        Label NZDTSecond = new Label();
        NZDTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTSecond, 7,16);

        Label NZDTMinute = new Label();
        NZDTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTMinute, 6,16);

        Label NZDTHour = new Label();
        NZDTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTHour, 5,16);

        Label NZDTDayOfMonth = new Label();
        NZDTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTDayOfMonth, 4,16);

        Label NZDTMonth = new Label();
        NZDTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTMonth, 3,16);

        Label NZDTDayOfWeek = new Label();
        NZDTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTDayOfWeek, 2,16);

        Label NZDTYear = new Label();
        NZDTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(NZDTYear,1,16);

        Label AHST= new Label("Fairbanks:");
        AHST.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHST, 0,17);

        Label AHSTMeridiem = new Label();
        AHSTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTMeridiem, 9,17);

        Label AHSTMilli = new Label();
        AHSTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTMilli, 8,17);

        Label AHSTSecond = new Label();
        AHSTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTSecond, 7,17);

        Label AHSTMinute = new Label();
        AHSTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTMinute, 6,17);

        Label AHSTHour = new Label();
        AHSTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTHour, 5,17);

        Label AHSTDayOfMonth = new Label();
        AHSTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTDayOfMonth, 4,17);

        Label AHSTMonth = new Label();
        AHSTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTMonth, 3,17);

        Label AHSTDayOfWeek = new Label();
        AHSTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTDayOfWeek, 2,17);

        Label AHSTYear = new Label();
        AHSTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(AHSTYear,1,17);


        Label BRT= new Label("Sao Paulo:");
        BRT.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRT, 0,18);

        Label BRTMeridiem = new Label();
        BRTMeridiem.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTMeridiem, 9,18);

        Label BRTMilli = new Label();
        BRTMilli.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTMilli, 8,18);

        Label BRTSecond = new Label();
        BRTSecond.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTSecond, 7,18);

        Label BRTMinute = new Label();
        BRTMinute.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTMinute, 6,18);

        Label BRTHour = new Label();
        BRTHour.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTHour, 5,18);

        Label BRTDayOfMonth = new Label();
        BRTDayOfMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTDayOfMonth, 4,18);

        Label BRTMonth = new Label();
        BRTMonth.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTMonth, 3,18);

        Label BRTDayOfWeek = new Label();
        BRTDayOfWeek.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTDayOfWeek, 2,18);

        Label BRTYear = new Label();
        BRTYear.setFont(new Font("Times", 32));
        GridPane.setConstraints(BRTYear,1,18);
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
                    daysOfWeek = determineDayOfWeek(now.get(Calendar.DAY_OF_WEEK));

                    months = determineMonthOfYear(now.get(Calendar.MONTH));
                    years = now.get(Calendar.YEAR);

                    meridiem.setText(now.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.ENGLISH.getDefault()));
                    milli.setText(String.valueOf(":" + millis));
                    second.setText(String.valueOf(":" + seconds));
                    minute.setText(String.valueOf(":" + minutes));
                    hour.setText(String.valueOf("-" + hours));
                    dayOfMonth.setText(String.valueOf("-" + daysOfMonth));
                    dayOfWeek.setText(String.valueOf("-" + daysOfWeek));
                    month.setText(String.valueOf("-" + months));
                    year.setText(String.valueOf(years));

                    TimeZone NYT = TimeZone.getTimeZone("EST");
                    Calendar NYTNow = Calendar.getInstance(NYT);


                    NYTMillis = NYTNow.get(Calendar.MILLISECOND);
                    NYTSeconds = NYTNow.get(Calendar.SECOND);
                    NYTMinutes = NYTNow.get(Calendar.MINUTE);
                    NYTHours = NYTNow.get(Calendar.HOUR);
                    NYTDaysOfWeek = determineDayOfWeek(NYTNow.get(Calendar.DAY_OF_WEEK));
                    NYTDaysOfMonth = NYTNow.get(Calendar.DAY_OF_MONTH);
                    NYTMonths = determineMonthOfYear(NYTNow.get(Calendar.MONTH));
                    NYTYears = NYTNow.get(Calendar.YEAR);

                    ESTMeridiem.setText(NYTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    NYTMilli.setText(":" + NYTMillis);
                    NYTSecond.setText(":" + NYTSeconds);
                    NYTMinute.setText(":" + NYTMinutes);
                    NYTHour.setText("-" + NYTHours);
                    NYTDayOfMonth.setText("-" + NYTDaysOfMonth);
                    NYTDayOfWeek.setText("-" + NYTDaysOfWeek);
                    NYTMonth.setText("-" + NYTMonths);
                    NYTYear.setText(String.valueOf(NYTYears));

                    TimeZone CST = TimeZone.getTimeZone("CST");
                    Calendar CSTNow = Calendar.getInstance(CST);

                    CSTMillis = CSTNow.get(Calendar.MILLISECOND);
                    CSTSeconds = CSTNow.get(Calendar.SECOND);
                    CSTMinutes = CSTNow.get(Calendar.MINUTE);
                    CSTHours = CSTNow.get(Calendar.HOUR);
                    CSTDaysOfWeek = determineDayOfWeek(CSTNow.get(Calendar.DAY_OF_WEEK));
                    CSTDaysOfMonth = CSTNow.get(Calendar.DAY_OF_MONTH);
                    CSTMonths = determineMonthOfYear(CSTNow.get(Calendar.MONTH));
                    CSTYears = CSTNow.get(Calendar.YEAR);

                    CSTChinaMeridiem.setText(CSTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    CSTMilli.setText(":" + CSTMillis);
                    CSTSecond.setText(":" + CSTSeconds);
                    CSTMinute.setText(":" + CSTMinutes);
                    CSTHour.setText("-" + CSTHours);
                    CSTDayOfMonth.setText("-" + CSTDaysOfMonth);
                    CSTDayOfWeek.setText("-" + CSTDaysOfWeek);
                    CSTMonth.setText("-" + CSTMonths);
                    CSTYear.setText(String.valueOf(CSTYears));

                    TimeZone MST = TimeZone.getTimeZone("MST");
                    Calendar MSTNow = Calendar.getInstance(MST);

                    MSTMillis = MSTNow.get(Calendar.MILLISECOND);
                    MSTSeconds = MSTNow.get(Calendar.SECOND);
                    MSTMinutes = MSTNow.get(Calendar.MINUTE);
                    MSTHours = MSTNow.get(Calendar.HOUR);
                    MSTDaysOfWeek = determineDayOfWeek(MSTNow.get(Calendar.DAY_OF_WEEK));
                    MSTDaysOfMonth = MSTNow.get(Calendar.DAY_OF_MONTH);
                    MSTMonths = determineMonthOfYear(MSTNow.get(Calendar.MONTH));
                    MSTYears = MSTNow.get(Calendar.YEAR);


                    MSTMeridiem.setText(MSTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    MSTMilli.setText(":" + MSTMillis);
                    MSTSecond.setText(":" + MSTSeconds);
                    MSTMinute.setText(":" + MSTMinutes);
                    MSTHour.setText("-" + MSTHours);
                    MSTDayOfMonth.setText("-" + MSTDaysOfMonth);
                    MSTDayOfWeek.setText("-" + MSTDaysOfWeek);
                    MSTMonth.setText("-" + MSTMonths);
                    MSTYear.setText(String.valueOf(MSTYears));

                    TimeZone PST = TimeZone.getTimeZone("PST");
                    Calendar PSTNow = Calendar.getInstance(PST);

                    PSTMillis = PSTNow.get(Calendar.MILLISECOND);
                    PSTSeconds = PSTNow.get(Calendar.SECOND);
                    PSTMinutes = PSTNow.get(Calendar.MINUTE);
                    PSTHours = PSTNow.get(Calendar.HOUR);
                    PSTDaysOfWeek = determineDayOfWeek(PSTNow.get(Calendar.DAY_OF_WEEK));
                    PSTDaysOfMonth = PSTNow.get(Calendar.DAY_OF_MONTH);
                    PSTMonths = determineMonthOfYear(PSTNow.get(Calendar.MONTH));
                    PSTYears = PSTNow.get(Calendar.YEAR);


                    PSTMeridiem.setText(PSTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    PSTMilli.setText(":" + PSTMillis);
                    PSTSecond.setText(":" + PSTSeconds);
                    PSTMinute.setText(":" + PSTMinutes);
                    PSTHour.setText("-" + PSTHours);
                    PSTDayOfMonth.setText("-" + PSTDaysOfMonth);
                    PSTDayOfWeek.setText("-" + PSTDaysOfWeek);
                    PSTMonth.setText("-" + PSTMonths);
                    PSTYear.setText(String.valueOf(PSTYears));

                    TimeZone GMT = TimeZone.getTimeZone("GMT");
                    Calendar GMTNow = Calendar.getInstance(GMT);

                    GMTMillis = GMTNow.get(Calendar.MILLISECOND);
                    GMTSeconds = GMTNow.get(Calendar.SECOND);
                    GMTMinutes = GMTNow.get(Calendar.MINUTE);
                    GMTHours = GMTNow.get(Calendar.HOUR);
                    GMTDaysOfWeek = determineDayOfWeek(GMTNow.get(Calendar.DAY_OF_WEEK));
                    GMTDaysOfMonth = GMTNow.get(Calendar.DAY_OF_MONTH);
                    GMTMonths = determineMonthOfYear(GMTNow.get(Calendar.MONTH));
                    GMTYears = GMTNow.get(Calendar.YEAR);


                    GMTMeridiem.setText(GMTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    GMTMilli.setText(":" + GMTMillis);
                    GMTSecond.setText(":" + GMTSeconds);
                    GMTMinute.setText(":" + GMTMinutes);
                    GMTHour.setText("-" + GMTHours);
                    GMTDayOfMonth.setText("-" + GMTDaysOfMonth);
                    GMTDayOfWeek.setText("-" + GMTDaysOfWeek);
                    GMTMonth.setText("-" + GMTMonths);
                    GMTYear.setText(String.valueOf(GMTYears));

                    TimeZone CET = TimeZone.getTimeZone("CET");
                    Calendar CETNow = Calendar.getInstance(CET);

                    CETMillis = CETNow.get(Calendar.MILLISECOND);
                    CETSeconds = CETNow.get(Calendar.SECOND);
                    CETMinutes = CETNow.get(Calendar.MINUTE);
                    CETHours = CETNow.get(Calendar.HOUR);
                    CETDaysOfWeek = determineDayOfWeek(CETNow.get(Calendar.DAY_OF_WEEK));
                    CETDaysOfMonth = CETNow.get(Calendar.DAY_OF_MONTH);
                    CETMonths = determineMonthOfYear( CETNow.get(Calendar.MONTH));
                    CETYears = CETNow.get(Calendar.YEAR);


                    CETmeridiem.setText(CETNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    CETMilli.setText(":" + CETMillis);
                    CETSecond.setText(":" + CETSeconds);
                    CETMinute.setText(":" + CETMinutes);
                    CETHour.setText("-" + CETHours);
                    CETDayOfMonth.setText("-" + CETDaysOfMonth);
                    CETDayOfWeek.setText("-" + CETDaysOfWeek);
                    CETMonth.setText("-" + CETMonths);
                    CETYear.setText(String.valueOf(CETYears));

                    TimeZone IST = TimeZone.getTimeZone("Israel");
                    Calendar ISTNow = Calendar.getInstance(IST);

                    ISTMillis = ISTNow.get(Calendar.MILLISECOND);
                    ISTSeconds = ISTNow.get(Calendar.SECOND);
                    ISTMinutes = ISTNow.get(Calendar.MINUTE);
                    ISTHours = ISTNow.get(Calendar.HOUR);
                    ISTDaysOfWeek = determineDayOfWeek(ISTNow.get(Calendar.DAY_OF_WEEK));
                    ISTDaysOfMonth = ISTNow.get(Calendar.DAY_OF_MONTH);
                    ISTMonths = determineMonthOfYear( ISTNow.get(Calendar.MONTH));
                    ISTYears = ISTNow.get(Calendar.YEAR);


                    ISTMeridiem.setText(ISTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    ISTMilli.setText(":" + ISTMillis);
                    ISTSecond.setText(":" + ISTSeconds);
                    ISTMinute.setText(":" + ISTMinutes);
                    ISTHour.setText("-" + ISTHours);
                    ISTDayOfMonth.setText("-" + ISTDaysOfMonth);
                    ISTDayOfWeek.setText("-" + ISTDaysOfWeek);
                    ISTMonth.setText("-" + ISTMonths);
                    ISTYear.setText(String.valueOf(ISTYears));

                    TimeZone MSK = TimeZone.getTimeZone("Europe/Moscow");
                    Calendar MSKNow = Calendar.getInstance(MSK);

                    MSKMillis = MSKNow.get(Calendar.MILLISECOND);
                    MSKSeconds = MSKNow.get(Calendar.SECOND);
                    MSKMinutes = MSKNow.get(Calendar.MINUTE);
                    MSKHours = MSKNow.get(Calendar.HOUR);
                    MSKDaysOfWeek = determineDayOfWeek(MSKNow.get(Calendar.DAY_OF_WEEK));
                    MSKDaysOfMonth = MSKNow.get(Calendar.DAY_OF_MONTH);
                    MSKMonths = determineMonthOfYear( MSKNow.get(Calendar.MONTH));
                    MSKYears = MSKNow.get(Calendar.YEAR);

                    MSKMeridiem.setText(MSKNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    MSKMilli.setText(":" + MSKMillis);
                    MSKSecond.setText(":" + MSKSeconds);
                    MSKMinute.setText(":" + MSKMinutes);
                    MSKHour.setText("-" + MSKHours);
                    MSKDayOfMonth.setText("-" + MSKDaysOfMonth);
                    MSKDayOfWeek.setText("-" + MSKDaysOfWeek);
                    MSKMonth.setText("-" + MSKMonths);
                    MSKYear.setText(String.valueOf(MSKYears));

                    TimeZone GET = TimeZone.getTimeZone("Asia/Tbilisi");
                    Calendar GETNow = Calendar.getInstance(GET);

                    GETMillis = GETNow.get(Calendar.MILLISECOND);
                    GETSeconds = GETNow.get(Calendar.SECOND);
                    GETMinutes = GETNow.get(Calendar.MINUTE);
                    GETHours = GETNow.get(Calendar.HOUR);
                    GETDaysOfWeek = determineDayOfWeek(GETNow.get(Calendar.DAY_OF_WEEK));
                    GETDaysOfMonth = GETNow.get(Calendar.DAY_OF_MONTH);
                    GETMonths = determineMonthOfYear( GETNow.get(Calendar.MONTH));
                    GETYears = GETNow.get(Calendar.YEAR);

                    GETMeridiem.setText(GETNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    GETMilli.setText(":" + GETMillis);
                    GETSecond.setText(":" + GETSeconds);
                    GETMinute.setText(":" + GETMinutes);
                    GETHour.setText("-" + GETHours);
                    GETDayOfMonth.setText("-" + GETDaysOfMonth);
                    GETDayOfWeek.setText("-" + GETDaysOfWeek);
                    GETMonth.setText("-" + GETMonths);
                    GETYear.setText(String.valueOf(GETYears));

                    TimeZone ORAT = TimeZone.getTimeZone("Asia/Oral");
                    Calendar ORATNow = Calendar.getInstance(ORAT);

                    ORATMillis = ORATNow.get(Calendar.MILLISECOND);
                    ORATSeconds = ORATNow.get(Calendar.SECOND);
                    ORATMinutes = ORATNow.get(Calendar.MINUTE);
                    ORATHours = ORATNow.get(Calendar.HOUR);
                    ORATDaysOfWeek = determineDayOfWeek(ORATNow.get(Calendar.DAY_OF_WEEK));
                    ORATDaysOfMonth = ORATNow.get(Calendar.DAY_OF_MONTH);
                    ORATMonths = determineMonthOfYear( ORATNow.get(Calendar.MONTH));
                    ORATYears = ORATNow.get(Calendar.YEAR);

                    ORATMeridiem.setText(ORATNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    ORATMilli.setText(":" + ORATMillis);
                    ORATSecond.setText(":" + ORATSeconds);
                    ORATMinute.setText(":" + ORATMinutes);
                    ORATHour.setText("-" + ORATHours);
                    ORATDayOfMonth.setText("-" + ORATDaysOfMonth);
                    ORATDayOfWeek.setText("-" + ORATDaysOfWeek);
                    ORATMonth.setText("-" + ORATMonths);
                    ORATYear.setText(String.valueOf(ORATYears));

                    TimeZone ALMT = TimeZone.getTimeZone("Asia/Almaty");
                    Calendar ALMTNow = Calendar.getInstance(ALMT);

                    ALMTMillis = ALMTNow.get(Calendar.MILLISECOND);
                    ALMTSeconds = ALMTNow.get(Calendar.SECOND);
                    ALMTMinutes = ALMTNow.get(Calendar.MINUTE);
                    ALMTHours = ALMTNow.get(Calendar.HOUR);
                    ALMTDaysOfWeek = determineDayOfWeek(ALMTNow.get(Calendar.DAY_OF_WEEK));
                    ALMTDaysOfMonth = ALMTNow.get(Calendar.DAY_OF_MONTH);
                    ALMTMonths = determineMonthOfYear( ALMTNow.get(Calendar.MONTH));
                    ALMTYears = ALMTNow.get(Calendar.YEAR);


                    ALMTMeridiem.setText(ALMTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    ALMTMilli.setText(":" + ALMTMillis);
                    ALMTSecond.setText(":" + ALMTSeconds);
                    ALMTMinute.setText(":" + ALMTMinutes);
                    ALMTHour.setText("-" + ALMTHours);
                    ALMTDayOfMonth.setText("-" + ALMTDaysOfMonth);
                    ALMTDayOfWeek.setText("-" + ALMTDaysOfWeek);
                    ALMTMonth.setText("-" + ALMTMonths);
                    ALMTYear.setText(String.valueOf(ALMTYears));

                    TimeZone CSTChina = TimeZone.getTimeZone("Asia/Shanghai");
                    Calendar CSTChinaNow = Calendar.getInstance(CSTChina);

                    CSTChinaMillis = CSTChinaNow.get(Calendar.MILLISECOND);
                    CSTChinaSeconds = CSTChinaNow.get(Calendar.SECOND);
                    CSTChinaMinutes = CSTChinaNow.get(Calendar.MINUTE);
                    CSTChinaHours = CSTChinaNow.get(Calendar.HOUR);
                    CSTChinaDaysOfWeek = determineDayOfWeek(CSTChinaNow.get(Calendar.DAY_OF_WEEK));
                    CSTChinaDaysOfMonth = CSTChinaNow.get(Calendar.DAY_OF_MONTH);
                    CSTChinaMonths = determineMonthOfYear( CSTChinaNow.get(Calendar.MONTH));
                    CSTChinaYears = CSTChinaNow.get(Calendar.YEAR);


                    CSTMeridiem.setText(CSTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    CSTChinaMilli.setText(":" + CSTChinaMillis);
                    CSTChinaSecond.setText(":" + CSTChinaSeconds);
                    CSTChinaMinute.setText(":" + CSTChinaMinutes);
                    CSTChinaHour.setText("-" + CSTChinaHours);
                    CSTChinaDayOfMonth.setText("-" + CSTChinaDaysOfMonth);
                    CSTChinaDayOfWeek.setText("-" + CSTChinaDaysOfWeek);
                    CSTChinaMonth.setText("-" + CSTChinaMonths);
                    CSTChinaYear.setText(String.valueOf(CSTChinaYears));

                    TimeZone WIT = TimeZone.getTimeZone("Asia/Tokyo");
                    Calendar WITNow = Calendar.getInstance(WIT);

                    WITMillis = WITNow.get(Calendar.MILLISECOND);
                    WITSeconds = WITNow.get(Calendar.SECOND);
                    WITMinutes = WITNow.get(Calendar.MINUTE);
                    WITHours = WITNow.get(Calendar.HOUR);
                    WITDaysOfWeek = determineDayOfWeek(WITNow.get(Calendar.DAY_OF_WEEK));
                    WITDaysOfMonth = WITNow.get(Calendar.DAY_OF_MONTH);
                    WITMonths = determineMonthOfYear( WITNow.get(Calendar.MONTH));
                    WITYears = WITNow.get(Calendar.YEAR);


                    WITMeridiem.setText(WITNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    WITMilli.setText(":" + WITMillis);
                    WITSecond.setText(":" + WITSeconds);
                    WITMinute.setText(":" + WITMinutes);
                    WITHour.setText("-" + WITHours);
                    WITDayOfMonth.setText("-" + WITDaysOfMonth);
                    WITDayOfWeek.setText("-" + WITDaysOfWeek);
                    WITMonth.setText("-" + WITMonths);
                    WITYear.setText(String.valueOf(WITYears));

                    TimeZone AEDI= TimeZone.getTimeZone("Australia/Sydney");
                    Calendar AEDINow = Calendar.getInstance(AEDI);

                    AEDIMillis = AEDINow.get(Calendar.MILLISECOND);
                    AEDISeconds = AEDINow.get(Calendar.SECOND);
                    AEDIMinutes = AEDINow.get(Calendar.MINUTE);
                    AEDIHours = AEDINow.get(Calendar.HOUR);
                    AEDIDaysOfWeek = determineDayOfWeek(AEDINow.get(Calendar.DAY_OF_WEEK));
                    AEDIDaysOfMonth = AEDINow.get(Calendar.DAY_OF_MONTH);
                    AEDIMonths = determineMonthOfYear( AEDINow.get(Calendar.MONTH));
                    AEDIYears = AEDINow.get(Calendar.YEAR);

                    AEDIMeridiem.setText(AEDINow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    AEDIMilli.setText(":" + AEDIMillis);
                    AEDISecond.setText(":" + AEDISeconds);
                    AEDIMinute.setText(":" + AEDIMinutes);
                    AEDIHour.setText("-" + AEDIHours);
                    AEDIDayOfMonth.setText("-" + AEDIDaysOfMonth);
                    AEDIDayOfWeek.setText("-" + AEDIDaysOfWeek);
                    AEDIMonth.setText("-" + AEDIMonths);
                    AEDIYear.setText(String.valueOf(AEDIYears));

                    TimeZone ANAT= TimeZone.getTimeZone("Asia/Anadyr");
                    Calendar ANATNow = Calendar.getInstance(ANAT);

                    ANATMillis = ANATNow.get(Calendar.MILLISECOND);
                    ANATSeconds = ANATNow.get(Calendar.SECOND);
                    ANATMinutes = ANATNow.get(Calendar.MINUTE);
                    ANATHours = ANATNow.get(Calendar.HOUR);
                    ANATDaysOfWeek = determineDayOfWeek(ANATNow.get(Calendar.DAY_OF_WEEK));
                    ANATDaysOfMonth = ANATNow.get(Calendar.DAY_OF_MONTH);
                    ANATMonths = determineMonthOfYear( ANATNow.get(Calendar.MONTH));
                    ANATYears = ANATNow.get(Calendar.YEAR);


                    ANATMeridiem.setText(ANATNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    ANATMilli.setText(":" + ANATMillis);
                    ANATSecond.setText(":" + ANATSeconds);
                    ANATMinute.setText(":" + ANATMinutes);
                    ANATHour.setText("-" + ANATHours);
                    ANATDayOfMonth.setText("-" + ANATDaysOfMonth);
                    ANATDayOfWeek.setText("-" + ANATDaysOfWeek);
                    ANATMonth.setText("-" + ANATMonths);
                    ANATYear.setText(String.valueOf(ANATYears));


                    TimeZone NZDT= TimeZone.getTimeZone("NZ");
                    Calendar NZDTNow = Calendar.getInstance(NZDT);

                    NZDTMillis = NZDTNow.get(Calendar.MILLISECOND);
                    NZDTSeconds = NZDTNow.get(Calendar.SECOND);
                    NZDTMinutes = NZDTNow.get(Calendar.MINUTE);
                    NZDTHours = NZDTNow.get(Calendar.HOUR);
                    NZDTDaysOfWeek = determineDayOfWeek(NZDTNow.get(Calendar.DAY_OF_WEEK));
                    NZDTDaysOfMonth = NZDTNow.get(Calendar.DAY_OF_MONTH);
                    NZDTMonths = determineMonthOfYear( NZDTNow.get(Calendar.MONTH));
                    NZDTYears = NZDTNow.get(Calendar.YEAR);

                    NZDTMeridiem.setText(NZDTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    NZDTMilli.setText(":" + NZDTMillis);
                    NZDTSecond.setText(":" + NZDTSeconds);
                    NZDTMinute.setText(":" + NZDTMinutes);
                    NZDTHour.setText("-" + NZDTHours);
                    NZDTDayOfMonth.setText("-" + NZDTDaysOfMonth);
                    NZDTDayOfWeek.setText("-" + NZDTDaysOfWeek);
                    NZDTMonth.setText("-" + NZDTMonths);
                    NZDTYear.setText(String.valueOf(NZDTYears));

                    TimeZone AHST= TimeZone.getTimeZone("America/Adak");
                    Calendar AHSTNow = Calendar.getInstance(AHST);

                    AHSTMillis = AHSTNow.get(Calendar.MILLISECOND);
                    AHSTSeconds = AHSTNow.get(Calendar.SECOND);
                    AHSTMinutes = AHSTNow.get(Calendar.MINUTE);
                    AHSTHours = AHSTNow.get(Calendar.HOUR);
                    AHSTDaysOfWeek = determineDayOfWeek(AHSTNow.get(Calendar.DAY_OF_WEEK));
                    AHSTDaysOfMonth = AHSTNow.get(Calendar.DAY_OF_MONTH);
                    AHSTMonths = determineMonthOfYear( AHSTNow.get(Calendar.MONTH));
                    AHSTYears = AHSTNow.get(Calendar.YEAR);

                    AHSTMeridiem.setText(AHSTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    AHSTMilli.setText(":" + AHSTMillis);
                    AHSTSecond.setText(":" + AHSTSeconds);
                    AHSTMinute.setText(":" + AHSTMinutes);
                    AHSTHour.setText("-" + AHSTHours);
                    AHSTDayOfMonth.setText("-" + AHSTDaysOfMonth);
                    AHSTDayOfWeek.setText("-" + AHSTDaysOfWeek);
                    AHSTMonth.setText("-" + AHSTMonths);
                    AHSTYear.setText(String.valueOf(AHSTYears));


                    TimeZone BRT= TimeZone.getTimeZone("America/Sao_Paulo");
                    Calendar BRTNow = Calendar.getInstance(BRT);

                    BRTMillis = BRTNow.get(Calendar.MILLISECOND);
                    BRTSeconds = BRTNow.get(Calendar.SECOND);
                    BRTMinutes = BRTNow.get(Calendar.MINUTE);
                    BRTHours = BRTNow.get(Calendar.HOUR);
                    BRTDaysOfWeek = determineDayOfWeek(BRTNow.get(Calendar.DAY_OF_WEEK));
                    BRTDaysOfMonth = BRTNow.get(Calendar.DAY_OF_MONTH);
                    BRTMonths = determineMonthOfYear( BRTNow.get(Calendar.MONTH));
                    BRTYears = BRTNow.get(Calendar.YEAR);


                    BRTMeridiem.setText( BRTNow.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()));
                    BRTMilli.setText(":" + BRTMillis);
                    BRTSecond.setText(":" + BRTSeconds);
                    BRTMinute.setText(":" + BRTMinutes);
                    BRTHour.setText("-" + BRTHours);
                    BRTDayOfMonth.setText("-" + BRTDaysOfMonth);
                    BRTDayOfWeek.setText("-" + BRTDaysOfWeek);
                    BRTMonth.setText("-" + AHSTMonths);
                    BRTYear.setText(String.valueOf(BRTYears));
                });
            }

        };
        tm.scheduleAtFixedRate(tt,1,1);
        gp.getChildren().addAll(local, meridiem, milli, second, minute, hour, dayOfMonth, dayOfWeek, month, year, EST, ESTMeridiem, NYTMilli, NYTSecond, NYTMinute, NYTHour, NYTDayOfMonth, NYTDayOfWeek, NYTMonth, NYTYear, CST, CSTMeridiem, CSTMilli, CSTSecond, CSTMinute, CSTHour, CSTDayOfMonth, CSTDayOfWeek, CSTMonth, CSTYear, MST, MSTMeridiem, MSTMilli, MSTSecond, MSTMinute,MSTHour,MSTDayOfMonth, MSTDayOfWeek, MSTMonth, MSTYear, PST, PSTMeridiem, PSTMilli, PSTSecond, PSTMinute, PSTHour, PSTDayOfMonth, PSTDayOfWeek, PSTMonth, PSTYear,GMT, GMTMeridiem, GMTMilli, GMTSecond,GMTMinute, GMTHour, GMTDayOfWeek, GMTDayOfMonth, GMTMonth, GMTYear, CET, CETmeridiem, CETMilli, CETSecond, CETMinute, CETHour, CETDayOfMonth, CETDayOfWeek, CETMonth, CETYear, IST, ISTMeridiem, ISTMilli, ISTSecond, ISTMinute, ISTHour, ISTDayOfMonth, ISTDayOfWeek, ISTMonth, ISTYear, MSK, MSKMeridiem, MSKMilli, MSKSecond, MSKMinute, MSKHour, MSKDayOfWeek, MSKDayOfMonth, MSKMonth, MSKYear, GET, GETMeridiem, GETMilli, GETSecond, GETMinute, GETHour, GETDayOfWeek, GETDayOfMonth, GETMonth, GETYear, ORAT, ORATMeridiem, ORATMilli, ORATSecond, ORATMinute, ORATHour, ORATDayOfWeek, ORATDayOfMonth, ORATMonth, ORATYear, ALMT, ALMTMeridiem, ALMTMilli, ALMTSecond, ALMTMinute, ALMTHour, ALMTDayOfMonth, ALMTDayOfWeek, ALMTMonth, ALMTYear, CSTChina, CSTChinaMeridiem, CSTChinaMilli, CSTChinaSecond, CSTChinaMinute, CSTChinaHour, CSTChinaDayOfMonth, CSTChinaDayOfWeek, CSTChinaMonth, CSTChinaYear, WIT, WITMeridiem, WITMilli, WITSecond, WITMinute, WITHour, WITDayOfWeek, WITDayOfMonth, WITMonth, WITYear, AEDI, AEDIMeridiem, AEDIMilli, AEDISecond, AEDIMinute, AEDIHour, AEDIDayOfWeek, AEDIDayOfMonth, AEDIMonth, AEDIYear, ANAT, ANATMeridiem, ANATMilli, ANATSecond, ANATMinute, ANATHour, ANATDayOfWeek, ANATDayOfMonth, ANATMonth, ANATYear, NZDT, NZDTMeridiem, NZDTMilli, NZDTSecond, NZDTMinute, NZDTHour, NZDTDayOfWeek, NZDTDayOfMonth, NZDTMonth, NZDTYear, AHST, AHSTMeridiem, AHSTMilli, AHSTSecond, AHSTMinute, AHSTHour, AHSTDayOfWeek, AHSTDayOfMonth, AHSTMonth, AHSTYear, BRT, BRTMeridiem, BRTMilli, BRTSecond, BRTMinute, BRTHour, BRTDayOfWeek, BRTDayOfMonth, BRTMonth, BRTYear);
        Scene scene = new Scene(gp);
        window.setScene(scene);
        window.showAndWait();
    }
    public static String determineDayOfWeek(int dayOfWeek){

        String day = "";
         switch (dayOfWeek){
            case 1:
                day ="Sunday";
                break;
            case 2:
               day = "Monday";
               break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day= "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
         };
        return day;
    }
    public static String determineMonthOfYear(int monthCode){
        String month = "";
        switch (monthCode){
            case 0:
                month = "January";
                break;
            case 1:
                month = "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;
        }
        return month;
    }
    //figure out why this is going to December when it is May #done

}
