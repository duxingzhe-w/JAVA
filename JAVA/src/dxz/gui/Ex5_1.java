package dxz.gui;
//JFrame创建基本窗口
import javax.swing.*;

public class Ex5_1 {
    public static void main(String[] args) {
        JFrame mw = new JFrame("这是一个窗口");
        mw.setSize(250, 200);
        JButton button = new JButton("我是一个按钮");
        mw.getContentPane().add(button);
        mw.setVisible(true);
    }
}
