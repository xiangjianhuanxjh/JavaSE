package com.mouse;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    JTextArea area;
    public void setJTextArea(JTextArea area){this.area = area;}

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount() >= 2) {
            area.setText("");
            area.append("点击次数为：" + e.getClickCount()+",位置: " + e.getX() + " ," + e.getY()+"\n");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        area.append("鼠标按下，位置: " + e.getX() + " ," + e.getY()+"\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        area.append("鼠标释放，位置: " + e.getX() + " ," + e.getY()+"\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() instanceof JButton)
            area.append("鼠标进入按钮"+"\n");
        if(e.getSource() instanceof JTextField)
            area.append("鼠标进入文本框"+"\n");
        if(e.getSource() instanceof JFrame)
            area.append("鼠标进入窗口"+"\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        area.append("鼠标退出，位置: " + e.getX() + "," + e.getY()+"\n");
    }
}
