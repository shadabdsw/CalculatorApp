package com.falcon;

import javax.swing.*;

import java.awt.Cursor;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.falcon.Evaluate;

public class App {
    public static void main(String[] args) {

        JLabel title = new JLabel("<HTML><CENTER><U>FALCON <BR> CALCULATOR</U></CENTER></HTML>");
        JFrame frame = new JFrame("Falcon Calculator");
        JTextField textField = new JTextField();
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnDot = new JButton(".");
        JButton btn0 = new JButton("0");
        JButton btnClr = new JButton("C");
        JButton btnEq = new JButton("=");
        JButton btnX = new JButton("X");
        JButton btnAdd = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnMul = new JButton("*");
        JButton btnDiv = new JButton("/");
        JLabel result = new JLabel();

        String s = "";

        title.setBounds(80, 20, 300, 80);
        title.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.black);
        title.setLayout(null);

        frame.add(title);
        frame.add(textField);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn0);
        frame.add(btnAdd);
        frame.add(btnSub);
        frame.add(btnMul);
        frame.add(btnDiv);
        frame.add(btnClr);
        frame.add(btnX);
        frame.add(btnDot);
        frame.add(btnEq);
        frame.add(result);
        frame.setSize(398, 700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField.setBounds(40, 160, 300, 60);
        textField.setFont(new Font("Arial", Font.BOLD, 28));
        textField.setForeground(Color.black);

        btnAdd.setBounds(40, 240, 60, 60);
        btnAdd.setFont(new Font("Arial", Font.BOLD, 32));
        btnAdd.setBackground(new Color(23, 23, 23));
        btnAdd.setForeground(Color.white);
        btnAdd.setFocusable(false);
        btnAdd.addActionListener(e -> {
            textField.setText(textField.getText().concat("+"));
        });

        btnSub.setBounds(120, 240, 60, 60);
        btnSub.setFont(new Font("Arial", Font.BOLD, 38));
        btnSub.setBackground(new Color(23, 23, 23));
        btnSub.setForeground(Color.white);
        btnSub.setFocusable(false);
        btnSub.addActionListener(e -> {
            textField.setText(textField.getText().concat("-"));

        });

        btnMul.setBounds(200, 240, 60, 60);
        btnMul.setFont(new Font("Arial", Font.BOLD, 38));
        btnMul.setBackground(new Color(23, 23, 23));
        btnMul.setForeground(Color.white);
        btnMul.setFocusable(false);
        btnMul.addActionListener(e -> {
            textField.setText(textField.getText().concat("*"));

        });

        btnDiv.setBounds(280, 240, 60, 60);
        btnDiv.setFont(new Font("Arial", Font.BOLD, 32));
        btnDiv.setBackground(new Color(23, 23, 23));
        btnDiv.setForeground(Color.white);
        btnDiv.setFocusable(false);
        btnDiv.addActionListener(e -> {
            textField.setText(textField.getText().concat("/"));
        });

        btn7.setBounds(40, 320, 60, 60);
        btn7.setFont(new Font("Arial", Font.BOLD, 32));
        btn7.setBackground(new Color(23, 23, 23));
        btn7.setForeground(Color.white);
        btn7.setFocusable(false);
        btn7.addActionListener(e -> {
            textField.setText(textField.getText().concat("7"));
        });

        btn8.setBounds(120, 320, 60, 60);
        btn8.setFont(new Font("Arial", Font.BOLD, 32));
        btn8.setBackground(new Color(23, 23, 23));
        btn8.setForeground(Color.white);
        btn8.setFocusable(false);
        btn8.addActionListener(e -> {
            textField.setText(textField.getText().concat("8"));

        });

        btn9.setBounds(200, 320, 60, 60);
        btn9.setFont(new Font("Arial", Font.BOLD, 32));
        btn9.setBackground(new Color(23, 23, 23));
        btn9.setForeground(Color.white);
        btn9.setFocusable(false);
        btn9.addActionListener(e -> {
            textField.setText(textField.getText().concat("9"));
        });

        btnClr.setBounds(280, 400, 60, 60);
        btnClr.setFont(new Font("Arial", Font.BOLD, 32));
        btnClr.setBackground(new Color(23, 23, 23));
        btnClr.setForeground(Color.white);
        btnClr.setFocusable(false);
        btnClr.addActionListener(e -> {
            textField.setText("");
        });

        btn4.setBounds(40, 400, 60, 60);
        btn4.setFont(new Font("Arial", Font.BOLD, 32));
        btn4.setBackground(new Color(23, 23, 23));
        btn4.setForeground(Color.white);
        btn4.setFocusable(false);
        btn4.addActionListener(e -> {
            textField.setText(textField.getText().concat("4"));
        });

        btn5.setBounds(120, 400, 60, 60);
        btn5.setFont(new Font("Arial", Font.BOLD, 32));
        btn5.setBackground(new Color(23, 23, 23));
        btn5.setForeground(Color.white);
        btn5.setFocusable(false);
        btn5.addActionListener(e -> {
            textField.setText(textField.getText().concat("5"));
        });

        btn6.setBounds(200, 400, 60, 60);
        btn6.setFont(new Font("Arial", Font.BOLD, 32));
        btn6.setBackground(new Color(23, 23, 23));
        btn6.setForeground(Color.white);
        btn6.setFocusable(false);
        btn6.addActionListener(e -> {
            textField.setText(textField.getText().concat("6"));
        });

        btnX.setBounds(280, 320, 60, 60);
        btnX.setFont(new Font("Arial", Font.BOLD, 32));
        btnX.setBackground(new Color(23, 23, 23));
        btnX.setForeground(Color.white);
        btnX.setFocusable(false);
        btnX.addActionListener(e -> {
            String string = textField.getText();
            textField.setText("");
            for(int i=0; i<string.length()-1;i++){
                textField.setText(textField.getText()+string.charAt(i));
            }
        });

        btn1.setBounds(40, 480, 60, 60);
        btn1.setFont(new Font("Arial", Font.BOLD, 32));
        btn1.setBackground(new Color(23, 23, 23));
        btn1.setForeground(Color.white);
        btn1.setFocusable(false);
        btn1.addActionListener(e -> {
            textField.setText(textField.getText().concat("1"));
        });

        btn2.setBounds(120, 480, 60, 60);
        btn2.setFont(new Font("Arial", Font.BOLD, 32));
        btn2.setBackground(new Color(23, 23, 23));
        btn2.setForeground(Color.white);
        btn2.setFocusable(false);
        btn2.addActionListener(e -> {
            textField.setText(textField.getText().concat("2"));
        });

        btn3.setBounds(200, 480, 60, 60);
        btn3.setFont(new Font("Arial", Font.BOLD, 32));
        btn3.setBackground(new Color(23, 23, 23));
        btn3.setForeground(Color.white);
        btn3.setFocusable(false);
        btn3.addActionListener(e -> {
            textField.setText(textField.getText().concat("3"));
        });

        btnEq.setBounds(280, 480, 60, 140);
        btnEq.setFont(new Font("Arial", Font.BOLD, 32));
        btnEq.setBackground(new Color(23, 23, 23));
        btnEq.setForeground(Color.white);
        btnEq.setFocusable(false);
        btnEq.addActionListener(e -> {
            // textField.setText("");
        });

        btn0.setBounds(40, 560, 140, 60);
        btn0.setFont(new Font("Arial", Font.BOLD, 32));
        btn0.setBackground(new Color(23, 23, 23));
        btn0.setForeground(Color.white);
        btn0.setFocusable(false);
        btn0.addActionListener(e -> {
            textField.setText(textField.getText().concat("0"));
        });

        btnDot.setBounds(200, 560, 60, 60);
        btnDot.setFont(new Font("Arial", Font.BOLD, 32));
        btnDot.setBackground(new Color(23, 23, 23));
        btnDot.setForeground(Color.white);
        btnDot.setFocusable(false);
        btnDot.addActionListener(e -> {
            textField.setText(textField.getText().concat("."));
        });

        // result.setBounds(180, 320, 300, 80);
        // result.setText("Result");
        // result.setFont(new Font("Arial", Font.BOLD, 28));
        // result.setForeground(Color.black);
        // result.setLayout(null);

        // String text1, text2;
        // text1 = textField1.getText();
        // text2 = textField2.getText();
        // int num1 = Integer.parseInt(text1);
        // int num2 = Integer.parseInt(text2);

    }

}
