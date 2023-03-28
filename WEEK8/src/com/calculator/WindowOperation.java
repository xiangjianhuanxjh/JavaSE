package com.calculator;


import java.awt.GridLayout;
import java.awt.*;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
public class WindowOperation extends JFrame {
    double inputNumberOne;
    double inputNumberTwo;
    double result;
    int Fuhao=-1;
    StringBuilder sBuilder = new StringBuilder();

    public WindowOperation() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        JPanel panel = new JPanel();
        setBounds(100,100,300,200);
        JButton btn[];

        String str[]= {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","C","="};
        panel.setLayout(new GridLayout(4,4));
        btn=new JButton[str.length];
        for(int i=0;i<str.length;i++) {
            btn[i]=new JButton(str[i]);
            panel.add(btn[i]);
        }

        JTextField txt=new JTextField("0");//文本框
        txt.setHorizontalAlignment(JTextField.LEFT);
        add(txt,"North");
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //给各个按钮设置动作监听器
        btn[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("0");
                txt.setText(sBuilder.toString());
            }
        });
        btn[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("1");
                txt.setText(sBuilder.toString());
            }
        });
        btn[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("2");
                txt.setText(sBuilder.toString());
            }
        });
        btn[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("3");
                txt.setText(sBuilder.toString());
            }
        });
        btn[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("4");
                txt.setText(sBuilder.toString());
            }
        });
        btn[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("5");
                txt.setText(sBuilder.toString());
            }
        });
        btn[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("6");
                txt.setText(sBuilder.toString());
            }
        });
        btn[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("7");
                txt.setText(sBuilder.toString());
            }
        });
        btn[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("8");
                txt.setText(sBuilder.toString());
            }
        });
        btn[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder.append("9");
                txt.setText(sBuilder.toString());
            }
        });
        //"+","-","*","/","C","="
        btn[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputNumberOne=Double.parseDouble(sBuilder.toString());
                sBuilder = new StringBuilder();
                if(Fuhao!=-1) {
                    txt.setText("输入符号不符合要求");
                }
                else {
                    txt.setText("+");
                    Fuhao=0;
                }
            }
        });
        btn[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputNumberOne=Double.parseDouble(sBuilder.toString());
                sBuilder = new StringBuilder();
                if(Fuhao!=-1) {
                    txt.setText("输入符号不符合要求");
                }
                else {
                    txt.setText("-");
                    Fuhao=1;
                }
            }
        });
        btn[12].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputNumberOne=Double.parseDouble(sBuilder.toString());
                sBuilder = new StringBuilder();
                if(Fuhao!=-1) {
                    txt.setText("输入符号不符合要求");
                }
                else {
                    txt.setText("*");
                    Fuhao=2;
                }
            }
        });
        btn[13].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputNumberOne=Double.parseDouble(sBuilder.toString());
                sBuilder = new StringBuilder();
                if(Fuhao!=-1) {
                    txt.setText("输入符号不符合要求");
                }
                else {
                    txt.setText("/");
                    Fuhao=3;
                }
            }
        });
        btn[14].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sBuilder = new StringBuilder();
                txt.setText("0");
            }
        });
        btn[15].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 该判断中间变量是否为空
                if (!"".equals(sBuilder.toString())) {
                    inputNumberTwo=Double.parseDouble(sBuilder.toString());
                    sBuilder.append("=");
                    txt.setText(sBuilder.toString());
                    if(Fuhao==0) {
                        result=inputNumberOne+inputNumberTwo;
                        txt.setText(String.valueOf(result));
                        sBuilder = new StringBuilder();
                        sBuilder.append(result);
                    }
                    else if(Fuhao==1) {
                        result=inputNumberOne-inputNumberTwo;
                        txt.setText(String.valueOf(result));
                        sBuilder = new StringBuilder();
                        sBuilder.append(result);
                    }
                    else if(Fuhao==2) {
                        result=inputNumberOne*inputNumberTwo;
                        txt.setText(String.valueOf(result));
                        sBuilder = new StringBuilder();
                        sBuilder.append(result);
                    }
                    else if(Fuhao==3) {
                        if(inputNumberTwo==0) {
                            sBuilder = new StringBuilder();
                            txt.setText("被除数不可为0");
                        }
                        else {
                            result=inputNumberOne/inputNumberTwo;
                            txt.setText(String.valueOf(result));
                            sBuilder = new StringBuilder();
                            sBuilder.append(result);
                        }
                    }
                    else {
                        sBuilder = new StringBuilder();
                        txt.setText("输入符号不符合要求");
                    }
                    Fuhao=-1;
                }
            }
        });
    }
}

