package com.bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class signUpOne extends JFrame {
    signUpOne() {
        setLayout(null);
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO." + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38 ));
        formno.setBounds(140,20,600,40);
        add(formno);

        /*
        Personal Details
         */
        JLabel personalDetails = new JLabel("page 1: personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22 ));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        /*
        Name fillUp Option
         */
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20 ));
        name.setBounds(100,140,100,30);
        add(name);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20 ));
        fname.setBounds(100,190,200,30);
        add(fname);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new signUpOne();
    }
}
