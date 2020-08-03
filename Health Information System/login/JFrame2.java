//SELF-RISK ASSESSMENT 

package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class JFrame2 implements ActionListener {

    JPanel panel = new JPanel();
    JFrame myFrame = new JFrame ("  SELF-RISK ASSESSMENT SK MENTARI KOTA BELUD ");
    JLabel Hai = new JLabel ();
    JLabel welcome = new JLabel();
    JLabel staysafe = new JLabel();
    JLabel click = new JLabel ();
    JButton buttonself = new JButton (" Please Take Self-risk Asssessment Tool ");
    
    JFrame2() 
    {
        myFrame.add(panel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400,300);
        myFrame.setVisible(true);
        
        //create label
        Hai = new JLabel (" HAI THERE, WELCOME TO SK MENTARI KOTA BELUD SHIELDS");
        welcome = new JLabel (" PLEASE STAY SAFE AND #KITAJAGAKITA");
        Hai.setBounds(10,20,150,25);
        welcome.setBounds(10,20,150,25);
        Hai.setForeground(Color.BLUE);
        welcome.setForeground(Color.BLUE);
        panel.add(Hai);
        panel.add(welcome);
        
        //button self
        buttonself.addActionListener(this);
        buttonself.setBounds(150,80,80,100);
        panel.add(buttonself);
       } 
        //handle the performed
        public void actionPerformed(ActionEvent ae){
            
            myFrame.dispose();
            new JFrame3();
        }    
         public static void main(String[] args) { 
            
            //create the frame on the event dispatching thread
            
            new JFrame2();
            
        }
        }
        

