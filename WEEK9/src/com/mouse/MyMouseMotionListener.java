package com.mouse;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyMouseMotionListener implements MouseMotionListener {
    JTextArea area;
    public void setJTextArea(JTextArea area){this.area = area;}
    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() instanceof JButton)
            area.setText("鼠标在按钮处拖动，位置: " + e.getX() + " ," + e.getY() + "\n");
        if (e.getSource() instanceof JTextField)
            area.setText("鼠标在文本框拖动，位置: " + e.getX() + " ," + e.getY() + "\n");
        if (e.getSource() instanceof JFrame)
            area.setText("鼠标在窗口拖动，位置: " + e.getX() + " ," + e.getY() + "\n");
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        /*
        鼠标移动事件过于频繁会吞掉其他事件，注释掉方便显示其他文件功能
        if(e.getSource() instanceof JButton)
            area.append("鼠标在按钮"+"\n");
        if(e.getSource() instanceof JTextField)
            area.append("鼠标在文本框"+"\n");
        if(e.getSource() instanceof JFrame)
            area.append("鼠标在窗口"+"\n");
        area.setText("鼠标移动，位置: " + e.getX() + " ," + e.getY()+"\n");
         */
    }
}
