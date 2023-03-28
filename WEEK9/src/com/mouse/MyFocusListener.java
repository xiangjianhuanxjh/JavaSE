package com.mouse;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyFocusListener implements FocusListener {
    JTextArea area;
    public void setJTextArea(JTextArea area){this.area = area;}
    @Override
    public void focusGained(FocusEvent e) {
        area.append("文本框获得焦点\n");
    }

    @Override
    public void focusLost(FocusEvent e) {
        area.append("文本框失去焦点\n");
    }
}
