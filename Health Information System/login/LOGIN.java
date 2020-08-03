//LOGIN USER 

package login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LOGIN implements ActionListener {
     
     JPanel panel = new JPanel();
     JFrame myFrame = new JFrame (" LOGIN HEALTH INFORMATION SYSTEM FOR SK MENTARI KOTA BELUD");
     JLabel username = new JLabel ();
     JTextField textusername = new JTextField();
     JLabel password = new JLabel();
     JPasswordField textPassword = new JPasswordField();
     JButton buttonLogin = new JButton (" LOGIN ");
     JButton buttonCancel = new JButton (" CANCEL ");
     JLabel message = new JLabel ();
    
    {
        //create a new JFrame container
        myFrame.add(panel);
        myFrame.setSize(500, 300);
        panel.setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create login label
        username = new JLabel ( " USERNAME ID : ");
        username .setBounds(10,20,200,25);
        username.setForeground(Color.BLUE);
        panel.add(username);
         
        //create username textfield
        textusername = new JTextField();
        textusername.setBounds(100,20,165,25);  
        textusername.addActionListener(this);
        panel.add(textusername);
        
        //create password label
        password = new JLabel(" PASSWORD    :");
        password.setBounds(10,50,100,25);
        password.setForeground(Color.BLUE);
        panel.add(password);
        
        //create password textField
        textPassword = new JPasswordField();
        textPassword.setBounds(100,50,165,25);  
        textPassword.addActionListener(this);
        panel.add(textPassword);
        
        //make button login
        buttonLogin.addActionListener(this);
        buttonLogin.setBounds(100, 80, 80, 25);
        panel.add(buttonLogin);
        
        
        //make button cancel
        buttonCancel.addActionListener(this);
        buttonCancel.setBounds(200,80,90,25);
        panel.add(buttonCancel);
        
        //create message label 
        message = new JLabel();
        message.setBounds(100,120,200,25);
        panel.add(message);

        // Display the frame
        myFrame.setVisible(true);
       }
       
       //Handle the performed
          @Override
          public void actionPerformed(ActionEvent ae)
              {
                  String username = textusername.getText();
                  String password = textPassword.getText();
                  
                  if(username.equals("981234567891")&& password.equals("ABC123")){
                     myFrame.dispose();
                     new JFrame2();  
                  }
                  else {
                      message.setText(" Invalid Username or Password ");   
                      message.setBounds(100,100,200,50);
                  }
              //Cancel Button 
              textusername.setText("");
              textPassword.setText("");
              
            }
      
       public static void main(String[] args) {  
       //create the frame on the event dispatching thread
       SwingUtilities.invokeLater(new Runnable (){
           public void run(){
               new LOGIN ();
     }
       } );
   }
   }
   
 
