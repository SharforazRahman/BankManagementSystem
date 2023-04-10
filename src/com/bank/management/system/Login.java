package com.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton login, signUp, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");//Setting Title\

        //setting the default layout to null so that we can work perfectly on our custom layout;
        setLayout(null);
        /*
        setting Image Icon
         */
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/icons/logo.jpg"));
        //correcting the image scale
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        //Image can't directly put into JLABEl that's why we are changing it to imageIcon again;
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        //we make custom layout by using setBound;
        label1.setBounds(70,10,100,100);
        add(label1);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);


        JLabel cardNo = new JLabel("Card No");
        cardNo.setFont(new Font("Raleway",Font.BOLD,28));
        cardNo.setBounds(120,150,150,30);
        add(cardNo);
        /*
        JTextField helps to create text field, where we can put values;
         */
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));// making the text Input larger
        add(cardTextField);


        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14)); // making the pin Input larger
        add(pinTextField);

         /*
        Making the Sign-in Button;
         */
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);// it will add the functionality of working the dummy login button
        add(login);

        /*
        Making Clear Button, It will erase the information;
         */
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);// it will add the functionality of working the dummy clear button
        add(clear);

         /*
        Making signUp Button;
         */
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300, 350, 230, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);// it will add the functionality of working the dummy signUp button
        add(signUp);

        /*
        Setting the background to white
         */
        getContentPane().setBackground(Color.WHITE);
        /*
        define the length of the Frame
         */
        setSize(800,480);

        /*
        By default, the visibility of the frame is not visible to user, that's why we use setvisible
         */
        setVisible(true);

        /*
        we are determining the location of this frame
         */
        setLocation(1150,200);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            /*
            since we don't give any input in text field, so it will be empty;
             */
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (e.getSource() == login) {

        } else if (e.getSource() == signUp) {

        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
