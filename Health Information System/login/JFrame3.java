//SCREENING QUESTION 

package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class JFrame3 extends JFrame implements ActionListener{
    
    private JFrame myFrame3 = new JFrame (" SELF-RISK ASSESSMENT SK MENTARI KOTA BELUD ");
    private JLabel label1 = new JLabel ();
    private JLabel quest1 = new JLabel ();
    private Checkbox checkbox1 = new Checkbox();
    private Checkbox checkbox2 = new Checkbox();
    private Checkbox checkbox3 = new Checkbox();
    private Checkbox checkbox4 = new Checkbox();
    private Checkbox checkbox5 = new Checkbox();
    private Checkbox checkbox6 = new Checkbox();
    private Checkbox checkbox7 = new Checkbox();
    private JButton button = new JButton (" NEXT");
    

        JFrame3() {
            myFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame3.setSize(600,600);
            myFrame3.setVisible(true);
            myFrame3.getContentPane().setLayout(null);
            
            label1 = new JLabel (" SCREENING QUESTION ");
            label1.setBounds(10,20,200,50);
            label1.setForeground(Color.DARK_GRAY);
            label1.setFont(label1.getFont ().deriveFont (15.0f));
            myFrame3.getContentPane().add(label1);
            
            //question 1
            quest1 = new JLabel ("1. Have you experienced the following symptoms within the past 14 days? ");
            quest1.setBounds(10,50,450,50);
            myFrame3.getContentPane().add(quest1);
            checkbox1 = new Checkbox (" Fever ");
            checkbox1.setBounds(50,100,500,50);
            myFrame3.getContentPane().add(checkbox1);
            checkbox2 = new Checkbox (" Cough ");
            checkbox2.setBounds(50,150,500,50);
            myFrame3.getContentPane().add(checkbox2);
            checkbox3 = new Checkbox (" Runny nose ");
            checkbox3.setBounds(50,200,500,50);
            myFrame3.getContentPane().add(checkbox3);
            checkbox4 = new Checkbox (" Short of breath ");
            checkbox4.setBounds(50,250,500,50);
            myFrame3.getContentPane().add(checkbox4);
            checkbox5 = new Checkbox (" Sore throat ");
            checkbox5.setBounds(50,300,500,50);
            checkbox6 = new Checkbox (" Headache ");
            myFrame3.getContentPane().add(checkbox5);
            checkbox6.setBounds(50,350,500,50);
            myFrame3.getContentPane().add(checkbox6);
            checkbox7 = new Checkbox (" No all above ");
            checkbox7.setBounds(50,400,500,50);
            myFrame3.getContentPane().add(checkbox7);
            
            
            //button next question 
            button.addActionListener(this);
            button.setBounds(50,500,100,25);
            myFrame3.getContentPane().add(button);
        }
      @Override 
            //handle the performed 
           public void actionPerformed(ActionEvent ae ){
               
               
               
               myFrame3.dispose();
               new JFrame4();
                        
       }
           
        public static void main(String args [])
        {
            new JFrame3();
        }
    
}
