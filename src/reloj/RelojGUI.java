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
                      sleep(1000);

                  }
              }catch (Exception ex){
                  ex.printStackTrace();
              }
          }
        };
        th.start();
    }
}

