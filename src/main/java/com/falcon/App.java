package com.falcon;

import javax.swing.*;

import java.awt.Cursor;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) {

        JLabel title = new JLabel("<HTML><U>FALCON CALCULATOR</U></HTML>");
        JFrame frame = new JFrame();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton clr = new JButton("C");
        JLabel result = new JLabel();

        title.setBounds(48, 0, 500, 80);
        title.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(Color.black);
        title.setLayout(null);

        frame.add(title);
        frame.add(label1);
        frame.add(label2);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(clr);
        frame.add(result);
        frame.setSize(480, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1.setBounds(40, 100, 150, 80);
        label1.setText("Number 1: ");
        label1.setFont(new Font("Arial", Font.BOLD, 18));
        label1.setForeground(Color.black);
        label1.setLayout(null);

        label2.setBounds(40, 140, 150, 80);
        label2.setText("Number 2: ");
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        label2.setForeground(Color.black);
        label2.setLayout(null);

        textField1.setBounds(200, 125, 220, 30);
        textField1.setFont(new Font("Arial", Font.BOLD, 18));
        textField1.setForeground(Color.black);

        textField2.setBounds(200, 165, 220, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 18));
        textField2.setForeground(Color.black);

        add.setBounds(40, 240, 60, 60);
        add.setFont(new Font("Arial", Font.BOLD, 32));

        sub.setBounds(120, 240, 60, 60);
        sub.setFont(new Font("Arial", Font.BOLD, 38));

        mul.setBounds(200, 240, 60, 60);
        mul.setFont(new Font("Arial", Font.BOLD, 32));

        div.setBounds(280, 240, 60, 60);
        div.setFont(new Font("Arial", Font.BOLD, 32));

        clr.setBounds(360, 240, 60, 60);
        clr.setFont(new Font("Arial", Font.BOLD, 32));

        result.setBounds(150, 320, 300, 80);
        result.setText("Result");
        result.setFont(new Font("Arial", Font.BOLD, 28));
        result.setForeground(Color.black);
        result.setLayout(null);

    }
}
