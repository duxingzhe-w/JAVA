package dxz.gui;
//GridLayout布局 滚动面板实例

import javax.swing.*;
import java.awt.*;

class MW1 extends JFrame {
    public MW1(int w, int h) {
        setTitle("滚动面板实例");
        Container con = getContentPane();
        con.setPreferredSize(new Dimension(w, h));
        con.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(6,6));
        for (int i = 0; i < 6; i++) {
            p.add(new JLabel());
            for (int j = 1; j <= 2; j++) {
                p.add(new JButton("按钮" + (2 * i + j)));
                p.add(new JLabel("标签" + (2 * i + j)));
            }
            p.add(new JLabel());
        }
        p.setBackground(Color.blue);
        p.setPreferredSize(new Dimension(w+60,h+60));
        ScrollPane sp = new ScrollPane(p);
        sp.setPreferredSize(new Dimension(w-60,h-60));
        con.add(sp, BorderLayout.CENTER);
        pack();
    }
}

class ScrollPane extends JScrollPane {
    public ScrollPane(Container p) {
        super(p);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
public class Ex5_6 {
    public static void main(String[] args) {
        MW1 mw = new MW1(400, 350);
        mw.setVisible(true);
    }
}
