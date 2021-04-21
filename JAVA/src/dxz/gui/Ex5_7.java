package dxz.gui;
//CardLayout布局

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyPanel1 extends JPanel {
    int x;
    JLabel label;

    MyPanel1(int a) {
        x = a;
        setLayout( new BorderLayout());
//        getSize();
        label = new JLabel("我是第" + x + "个标签",JLabel.CENTER);
        add(label);
    }

/*
    public Dimension getPreferredSize() {
        return new Dimension(200, 50);
    }
*/
}

class MW2 extends JFrame implements ActionListener {
    CardLayout myCard;
    MyPanel1 myPanel[];
    JPanel p;
    MW2(int num) {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        myCard = new CardLayout();
        this.setSize(400,150);
        p = new JPanel();
        p.setLayout(myCard);
        myPanel = new MyPanel1[num];
        for (int i = 0; i < num; i++) {
            myPanel[i] = new MyPanel1(i + 1);
            p.add("A"+i,myPanel[i]);
        }
        JPanel p2 = new JPanel();
        addButton(p2,"第一个",this);
        addButton(p2,"前一个",this);
        addButton(p2,"后一个",this);
        addButton(p2,"最后一个",this);
        con.add(p, "Center");
        con.add(p2,"South");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("第一个")) {myCard.first(p);}
        else if (e.getActionCommand().equals("前一个")) {myCard.previous(p);}
        else if (e.getActionCommand().equals("后一个")) {myCard.next(p);}
        else if (e.getActionCommand().equals("最后一个")) {myCard.last(p);}
    }

    private void addButton(JPanel pan, String butName, ActionListener listener) {
        JButton button = new JButton(butName);
        button.setActionCommand(butName);
        button.addActionListener(listener);
        pan.add(button);
    }
}
public class Ex5_7 {
    public static void main(String[] args) {
        MW2 myWindow = new MW2(10);
        myWindow.setVisible(true);
    }
}
