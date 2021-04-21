package dxz.gui;
//null布局和文本框

import javax.swing.*;
import java.awt.event.*;

public class Ex5_8 {
    static JTextField text1, text2,text3;
    static JPasswordField passwordField;
    public static void main(String[] args) {
        Sqr s = new Sqr();
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        text3 = new JTextField(10);
        JFrame frame = new JFrame("文本框");
        frame.setSize(300,300);
        frame.setLayout(null);
        JLabel l1 = new JLabel("x:",JLabel.RIGHT);
        JLabel l2 = new JLabel("x^2:",JLabel.RIGHT);
        JLabel l3 = new JLabel("密码:",JLabel.RIGHT);
        JLabel l4 = new JLabel("明码:",JLabel.RIGHT);
        frame.add(l1);
        l1.setBounds(20,20,30,20);
        frame.add(l2);
        l2.setBounds(20,60,30,20);
        frame.add(text1);
        text1.setBounds(60,20,200,20);
        frame.add(text2);
        text2.setBounds(60,60,200,20);
        text1.addActionListener(s);
        frame.add(l3);
        l3.setBounds(20,100,30,20);
        passwordField = new JPasswordField();
        passwordField.setEchoChar('X');
        frame.add(passwordField);
        passwordField.setBounds(60,100,200,20);
        passwordField.addActionListener(s);
        frame.add(l4);
        l4.setBounds(20,140,30,20);
        frame.add(text3);
        text3.setBounds(60,140,200,20);

        frame.setVisible(true);
    }
}

class Sqr implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Ex5_8.text1) {
            long n = Long.parseLong(Ex5_8.text1.getText());
            Ex5_8.text2.setText(String.valueOf(n * n));
        } else if (e.getSource()==Ex5_8.passwordField) {
            String s = String.valueOf(Ex5_8.passwordField.getPassword());
            Ex5_8.text3.setText(s);
        }
    }
}
