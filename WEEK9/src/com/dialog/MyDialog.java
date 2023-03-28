package com.dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog extends JFrame {
    JTextArea area;
    public void setJTextArea(JTextArea area){this.area = area;}
    public MyDialog(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600,400);
    }
    void init(){
        setLayout(new FlowLayout());
        add(new JLabel("输入相关信息至主窗口"));

        JTextField text = new JTextField(20);
        add(text);
        text.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append(e.getActionCommand()+"\n");
            }
        });
    }
}
