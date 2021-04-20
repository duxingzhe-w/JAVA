package dxz.gui;
//JFrame子类创建窗口
import javax.swing.*;
import java.awt.*;

public class Ex5_2 {
    public static MyWindow mw1;
    public static MyWindow mw2;
    public static void main(String[] args) {
        JButton button1 = new JButton("我是一个按钮");
        String name1 = "窗口1";
        String name2 = "窗口2";
        mw1 = new MyWindow(name1, button1, Color.blue, 350, 450);
        mw1.setVisible(true);
        JButton button2 = new JButton("我是另一个按钮");
        mw2 = new MyWindow(name2, button2, Color.magenta, 300, 400);
        mw2.setVisible(true);
    }
}
class MyWindow extends JFrame{
    public MyWindow(String name, JButton button, Color c, int w, int h) {
        super();
        setTitle(name);
        setSize(w, h);
        Container contentPane = getContentPane();
        contentPane.add(button);
        contentPane.setBackground(c);
    }
}
