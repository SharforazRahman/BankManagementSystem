package com.bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
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
        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);


        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);

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
    public static void main(String[] args) {
        new Login();
    }
}
