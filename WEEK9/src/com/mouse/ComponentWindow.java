package com.mouse;

import javax.swing.*;
import java.awt.*;


public class ComponentWindow extends JFrame {
    public ComponentWindow(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);

    }
    void init(){
        setLayout(new FlowLayout());
        MyMouseListener mymouse = new MyMouseListener();
        MyMouseMotionListener myMouseMotionListener = new MyMouseMotionListener();
        MyFocusListener myFocusListener = new MyFocusListener();
        addMouseListener(mymouse);
        addMouseMotionListener(myMouseMotionListener);

        JButton button = new JButton("按钮");
        button.addMouseListener(mymouse);
        button.addMouseMotionListener(myMouseMotionListener);
        add(button);

        JTextField text = new JTextField(20);
        text.addMouseListener(mymouse);
        text.addMouseMotionListener(myMouseMotionListener);
        text.addFocusListener(myFocusListener);
        add(text);

        JTextArea area = new JTextArea(20,40);
        add(area);

        mymouse.setJTextArea(area);
        myMouseMotionListener.setJTextArea(area);
        myFocusListener.setJTextArea(area);
    }
}
