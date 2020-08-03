//QUESTION 

package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class JFrame4 extends JFrame implements ActionListener {
    
    private JFrame myFrame4 = new JFrame (" SELF-RISK ASSESSMENT SK MENTARI KOTA BELUD ");
    private JLabel label1 = new JLabel ();
    private JLabel quest2 = new JLabel ();
    private Checkbox checkbox1 = new Checkbox();
    private Checkbox checkbox2 = new Checkbox();
    private Checkbox checkbox3 = new Checkbox();
    private Checkbox checkbox4 = new Checkbox();
    private Checkbox checkbox5 = new Checkbox();
    private JButton button = new JButton (" NEXT");
    
    JFrame4 (){
         myFrame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         myFrame4.setSize(600,600);
         myFrame4.setVisible(true);
         myFrame4.getContentPane().setLayout(null);
         
        //Question 2
        quest2 = new JLabel ("2. Have you come into contact with a confirmed case of COVID-19 before the onset of illness? ");
        quest2.setBounds(10,50,550,50);
        myFrame4.getContentPane().add(quest2);
        checkbox1 = new Checkbox (" Staying/living in the same place ");
        checkbox1.setBounds(50,100,500,50);
        myFrame4.getContentPane().add(checkbox1);
        checkbox2 = new Checkbox (" Being in a small group of Tabligh with confirmed case of COVID-19 ");
        checkbox2.setBounds(50,150,500,50);
        myFrame4.getContentPane().add(checkbox2);
        checkbox3 = new Checkbox (" Being in close contact at as distance less than 1 meter for more than 15 minutes ");
        checkbox3.setBounds(50,200,500,50);
        myFrame4.getContentPane().add(checkbox3);
        checkbox4 = new Checkbox (" Staying in the same air-conditioned closed space for more than 2 hours");
        checkbox4.setBounds(50,250,500,50);
        myFrame4.getContentPane().add(checkbox4);
        checkbox5 = new Checkbox (" Sitting at a distance less than 2 meter in the same vechicle for more than 2 hours ");
        checkbox5.setBounds(50,300,500,50);
        myFrame4.getContentPane().add(checkbox5);
            
        //Button Next Question 
        button.addActionListener(this);
        button.setBounds(50,500,100,25);
        myFrame4.getContentPane().add(button);
            
    }
      @Override 
            //handle the performed 
           public void actionPerformed(ActionEvent ae ){
                     
               myFrame4.dispose();
               new JFrame5 ();
                        
       }
           
        public static void main(String args [])
        {
            new JFrame4();
        }
    
}
      
   
        
    



