import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SimpleGUI extends JFrame{
    JTextField txtName;
    JTextField txtGreeting;

    SimpleGUI(){
        setSize(400,300);
        setTitle("GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel lblName= new JLabel("Enter your name");
        txtName= new JTextField("Name", 30);
        JButton btnHello= new JButton("Click");
        btnHello.addActionListener(new HelloBtnListener());
        txtGreeting= new JTextField(30);
        txtGreeting.setEditable(false);
        txtGreeting.setHorizontalAlignment(JTextField.CENTER);
        //setResizable(false);
        add(lblName);
        add(txtName);
        add(btnHello);
        add(txtGreeting);
        setVisible(true);
       
    }

    private class HelloBtnListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String name= txtName.getText();
            txtGreeting.setText("Hello " + name);
            System.out.println("The button was clicked at " + new Date(e.getWhen()));
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        
        SimpleGUI sample = new SimpleGUI();
        System.out.println("Hello " + sample.txtName.getText());
    }
}