package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.EventQueue.invokeLater;

public class SetPass extends JFrame implements Runnable,  ActionListener {

    @Override
    public void run() {
    }

        private JTextField new_User;
        private JTextField new_Password;
        private JButton btn_Register;



    public SetPass() {
            super("Registration");
            new_User = new JTextField("");
            new_Password = new JPasswordField("");
            btn_Register = new JButton("Register");
            btn_Register.addActionListener(this);





            JPanel p1 = new JPanel(new GridLayout(5, 2));
            p1.add(new JLabel("User:"));
            p1.add(new_User);
            p1.add(new JLabel("Password:"));
            p1.add(new_Password);
            p1.add(btn_Register);




            setContentPane(p1);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(250, 150);
            setResizable(true);
            setVisible(true);
        }

        protected String password;
        protected String user;


        @Override
        public void actionPerformed (ActionEvent e){
            System.out.println(e.getActionCommand());


            if (e.getActionCommand().equals("Register")) {


                this.password = new_Password.getText();
                this.user = new_User.getText();
                dispose();


            }


        }
    }






