package dxz.gui;
//JPanel使用
import javax.swing.*;
import java.awt.*;

public class Ex5_4 {
    public static void main(String[] args) {
        MW mw = new MW();
        mw.setVisible(true);
    }
}
class MW extends JFrame{
    MW(){
        super();
        setTitle("面板使用");
        setSize(300,200);
        setLayout(new FlowLayout());
        MyPanel panel1, panel2;
        JButton button;
        panel1 = new MyPanel("确定", "取消", "标签，我们在面板1中", Color.red);
        panel2 = new MyPanel("确定", "取消", "标签，我们在面板2中", Color.blue);
        button = new JButton("我不是面板中的按钮");
        add(panel1);
        add(panel2);
        add(button);
    }

}
class MyPanel extends JPanel {
    JButton button1, button2;
    JLabel label;

    MyPanel(String s1,String s2, String s3,Color c) {
        button1 = new JButton(s1);
        button2 = new JButton(s2);
        label = new JLabel(s3);
        add(button1);
        add(button2);
        add(label);
        setBackground(c);
    }
}
