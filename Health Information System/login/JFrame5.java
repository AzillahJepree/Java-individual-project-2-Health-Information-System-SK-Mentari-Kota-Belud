//QUESTION and SUBMISSION


package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Asus
 */

public class JFrame5 extends JFrame implements ActionListener {
        
    
      JFrame myFrame5 = new JFrame (" SELF-RISK ASSESSMENT SK MENTARI KOTA BELUD ");
      JLabel quest3 = new JLabel ();
      JLabel quest4 = new JLabel ();
      JComboBox comboBox = new JComboBox ();
      JComboBox comboBox1 = new JComboBox();
      JButton sub = new JButton (" SUBMIT ");
      JTextArea message = new JTextArea ();
      JTextArea tout = new JTextArea();
      JLabel res = new JLabel();

      //Array implementation
      public String comboBoxs[]= {"Yes","No" };
      
    JFrame5 ()
    {
       myFrame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myFrame5.setSize(900,600);
       myFrame5.setVisible(true);
       myFrame5.getContentPane().setLayout(null);

      //Question 3 
      quest3 = new JLabel (" 3. Have you visited the countries affected with COVID-19 within the past 14 days before the onset of illness? ");
      quest3.setBounds(10,50,800,50);
      myFrame5.getContentPane().add(quest3);
      
      //Question 4
      quest4 = new JLabel (" 4. Have you participated in any gathering within the past 14 days like Religious gathering or Wedding ceremony ?");
      quest4.setBounds(10,150,800,50);
      myFrame5.getContentPane().add(quest4);
      
      //combobox for yes/no
      comboBox = new JComboBox(comboBoxs);
      comboBox.setFont(new Font("Arial",Font.PLAIN,15));
      comboBox.setBounds(20,90,100,30);
      myFrame5.getContentPane().add(comboBox);
      
      //combobox for yes/no
      comboBox1 = new JComboBox (comboBoxs);
      comboBox1.setFont(new Font("Arial",Font.PLAIN,15));
      comboBox1.setBounds(20,200,100,30);
      myFrame5.getContentPane().add(comboBox1);
      
      //button next question 
      sub.addActionListener(this);
      sub.setBounds(50,500,100,25);
      myFrame5.getContentPane().add(sub);

    }
      @Override
      
           public void actionPerformed(ActionEvent ae )
           {
                   JOptionPane.showMessageDialog(this,"Successfully Submit ");
               myFrame5.dispose();
               new JFrame ();          
               }
                 
        public static void main(String args [])
        {
             new JFrame5 ();
        }
    
}
       
   
        
    

    

