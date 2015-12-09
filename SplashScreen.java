import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout; 
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

public class SplashScreen extends JWindow {

    //static boolean isRegistered; //??? not nessisary 
    private static JProgressBar progressBar = new JProgressBar();
    private static SplashScreen execute; // the name of our splashscreen is "excecute"
    private static int count; //for progress bar
    private static Timer timer1; //for progress bar

    public SplashScreen() {

        Container container = getContentPane(); //creates a container for panel, label, and bar
        container.setBackground(new Color(220, 229, 232));
        container.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new javax.swing.border.EtchedBorder()); //type of border in swing class
        panel.setBackground(new Color(255, 255, 255)); //color in RGB
        panel.setBounds(10, 10, 348, 150); //bounds of panel within container 
        panel.setLayout(null);
        container.add(panel); //adds panel to container

        JLabel label = new JLabel("Loading..."); 
        label.setFont(new Font("Verdana", Font.BOLD, 14)); //font, type, size
        label.setBounds(25, 15, 280, 30); // label will show up inside the panel. 
        panel.add(label); //adds label to panel 
        
        JLabel label2 = new JLabel("Abby's Project"); 
        label2.setFont(new Font("Verdana", Font.BOLD, 14)); //font, type, size
        label2.setBounds(25, 35, 280, 30); // label will show up inside the panel. 
        panel.add(label2); //adds label to panel 

        progressBar.setMaximum(50);
        progressBar.setBounds(55, 180, 250, 15); //bounds of bar within container
        container.add(progressBar); //adds progressbar to container
        loadProgressBar(); //calls method below 
        setSize(370, 215); 
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadProgressBar() {
        ActionListener al = new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count++;

                progressBar.setValue(count);

                //System.out.println(count); //this is just to see what my counter is at. 

                if (count == 55) {

                    createFrame(); //creates the new frame for application or whatever

                    execute.setVisible(false);// closes splash screen part of performance

                    timer1.stop();
                }

            }

            //creates a frame to pop up after splash screen. if you are making an application this is where it will show up... 
            private void createFrame() throws HeadlessException {
                JFrame frame = new JFrame();
                
                JPanel panel2 = new JPanel();
                panel2.setLayout(new FlowLayout());
                
                JLabel label = new JLabel("Splash Screen Complete!");
                JLabel label2 = new JLabel("This took way too much code!");
                JLabel label3 = new JLabel("Here is a button... it doesn't do anything!");
                JButton button = new JButton();
                button.setText("Press Me!");
                
                /*
                button.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                    BufferedImage bi = null;
                        try{
                            bi = ImageIO.read(new File("C:/Users/Abby/Desktop/dog.png"));
                        }catch(IOException e){
                            e.printStackTrace();
                        }
                        label.setIcon(new ImageIcon(bi));
                }
                });
                */
                
                panel2.add(label);
                panel2.add(label2);
                panel2.add(label3);
                panel2.add(button);
                frame.add(panel2);

                frame.setSize(300, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                
                
                
            }
        };
        timer1 = new Timer(50, al); //timer that counts to 50 (loads bar to 100%) 
        timer1.start();
    }

    public static void main(String[] args) {
        execute = new SplashScreen();
    }
};