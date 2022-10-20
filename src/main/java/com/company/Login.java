package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame  implements ActionListener{

    JTextField tf_User ;
    JTextField tf_Password;
    JButton btn_OK ;
    JButton btn_Delete;


    public Login() {
        super("Login");
        tf_User = new JTextField("") ;
        tf_Password = new JPasswordField("") ;
        btn_OK = new JButton("OK") ;
        btn_Delete = new JButton("Delete") ;
        btn_OK.addActionListener(this) ;
        btn_Delete.addActionListener(this) ;

        JPanel p1 = new JPanel(new GridLayout(3, 2));
        p1.add(new JLabel("User:"));
        p1.add(tf_User);
        p1.add(new JLabel("Password:"));
        p1.add(tf_Password);
        p1.add(btn_Delete);
        p1.add(btn_OK);


        setContentPane(p1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250, 150);
        setResizable(false);
        setVisible(true);



    }

    SetPass ext = new SetPass() ;


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(ext.password + " " + ext.user);
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Delete")) {
            dispose();
        }

            else if (e.getActionCommand().equals("OK")) {
                if (tf_User.getText().contentEquals(ext.user) && (tf_Password.getText().contentEquals(ext.password))){
                    JOptionPane.showMessageDialog(this, "Login succesful", "Login",
                            JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Login failed", "Login",
                            JOptionPane.WARNING_MESSAGE);
                }
        }
    }}



