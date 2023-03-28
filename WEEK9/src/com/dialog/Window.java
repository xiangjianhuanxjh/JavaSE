package com.dialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
    }
    void init(){
        JButton button = new JButton("打开对话框");
        add(button,"North");
        JTextArea area = new JTextArea(20,40);
        add(area,"South");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyDialog md = new MyDialog();
                md.setTitle("处理对话框事件");
                md.setLocationRelativeTo(null);
                md.setJTextArea(area);
            }
        });

    }
}
