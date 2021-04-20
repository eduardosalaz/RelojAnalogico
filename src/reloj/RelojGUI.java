package reloj;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;

//https://fazecast.github.io/jSerialComm/

public class RelojGUI {

    private JFrame frame;
    JLabel lblReloj = new JLabel();


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RelojGUI window = new RelojGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public RelojGUI() {
        initialize();
        reloj();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 669, 471);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        lblReloj.setHorizontalAlignment(SwingConstants.CENTER);
        lblReloj.setFont(new Font("Consolas", Font.BOLD, 28));
        lblReloj.setBounds(185, 180, 282, 71);
        frame.getContentPane().add(lblReloj);
    }

    public void reloj(){
        Thread th = new Thread(){
          public void run(){
              try{
                  for(;;){
                      Calendar cal = new GregorianCalendar();
                      int min = cal.get(Calendar.MINUTE);
                      int hour = cal.get(Calendar.HOUR);
                      int am_pm = cal.get(Calendar.AM_PM);

                      String AMoPM = "";

                      if(am_pm == 1){
                          AMoPM = "PM";
                      }else{
                          AMoPM = "AM";
                      }

                      lblReloj.setText(""+hour + ":" + min + " " + AMoPM);
                      gradosHora(hour, am_pm);
                      gradosMinutos(min);
                      sleep(1000);
                  }
              }catch (Exception ex){
                  ex.printStackTrace();
              }
          }
        };
        th.start();
    }

    private void gradosMinutos(int min) {
        switch (min){
            case 0:
                //serial send(xxgrados);
                break;
            case 1:
                //serial send(xxgrados);
                break;
            case 2:
                //serial send(xxgrados);
                break;
            case 3:
                //serial send(xxgrados);
                break;
            case 4:
                //serial send(xxgrados);
                break;
            case 5:
                //serial send(xxgrados);
                break;
            case 6:
                //serial send(xxgrados);
                break;
            case 7:
                //serial send(xxgrados);
                break;
            case 8:
                //serial send(xxgrados);
                break;
            case 9:
                //serial send(xxgrados);
                break;
            case 10:
                //serial send(xxgrados);
                break;
            case 11:
                //serial send(xxgrados);
                break;
            case 12:
                //serial send(xxgrados);
                break;
            case 13:
                //serial send(xxgrados);
                break;
            case 14:
                //serial send(xxgrados);
                break;
            case 15:
                //serial send(xxgrados);
                break;
            case 16:
                //serial send(xxgrados);
                break;
            case 17:
                //serial send(xxgrados);
                break;
            case 18:
                //serial send(xxgrados);
                break;
            case 19:
                //serial send(xxgrados);
                break;
            case 20:
                //serial send(xxgrados);
                break;
            case 21:
                //serial send(xxgrados);
                break;
            case 22:
                //serial send(xxgrados);
                break;
            case 23:
                //serial send(xxgrados);
                break;
            case 24:
                //serial send(xxgrados);
                break;
            case 25:
                //serial send(xxgrados);
                break;
            case 26:
                //serial send(xxgrados);
                break;
            case 27:
                //serial send(xxgrados);
                break;
            case 28:
                //serial send(xxgrados);
                break;
            case 29:
                //serial send(xxgrados);
                break;
            case 30:
                //serial send(xxgrados);
                break;
            case 31:
                //serial send(xxgrados);
                break;
            case 32:
                //serial send(xxgrados);
                break;
            case 33:
                //serial send(xxgrados);
                break;
            case 34:
                //serial send(xxgrados);
                break;
            case 35:
                //serial send(xxgrados);
                break;
            case 36:
                //serial send(xxgrados);
                break;
            case 37:
                //serial send(xxgrados);
                break;
            case 38:
                //serial send(xxgrados);
                break;
            case 39:
                //serial send(xxgrados);
                break;
            case 40:
                //serial send(xxgrados);
                break;
            case 41:
                //serial send(xxgrados);
                break;
            case 42:
                //serial send(xxgrados);
                break;
            case 43:
                //serial send(xxgrados);
                break;
            case 44:
                //serial send(xxgrados);
                break;
            case 45:
                //serial send(xxgrados);
                break;
            case 46:
                //serial send(xxgrados);
                break;
            case 47:
                //serial send(xxgrados);
                break;
            case 48:
                //serial send(xxgrados);
                break;
            case 49:
                //serial send(xxgrados);
                break;
            case 50:
                //serial send(xxgrados);
                break;
            case 51:
                //serial send(xxgrados);
                break;
            case 52:
                //serial send(xxgrados);
                break;
            case 53:
                //serial send(xxgrados);
                break;
            case 54:
                //serial send(xxgrados);
                break;
            case 55:
                //serial send(xxgrados);
                break;
            case 56:
                //serial send(xxgrados);
                break;
            case 57:
                //serial send(xxgrados);
                break;
            case 58:
                //serial send(xxgrados);
                break;
            case 59:
                //serial send(xxgrados);
                break;
        }
    }

    private void gradosHora(int hour, int am_pm){
        switch(hour){
            case 1:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 2:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 3:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 4:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 5:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 6:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 7:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 8:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 9:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 10:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 11:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
            case 12:
                if(am_pm == 1){
                    //serial send(xx grados);
                }else {
                    //serial send(xx + yy grados);
                }
                break;
        }
    }





}

