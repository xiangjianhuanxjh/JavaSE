package com.menu;
import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("文件");
        JMenu edit = new JMenu("编辑");
        JMenu view = new JMenu("视图");
        JMenu help = new JMenu("帮助");

        file.add("新建文件");
        file.add("打开文件");
        file.add("关闭文件");
        file.addSeparator();

        JMenu filegeshi = new JMenu("文件格式");
        JMenuItem jmi1 = new JMenuItem("Java 文件");
        JMenuItem jmi2 = new JMenuItem("Txt 文件");
        JMenuItem jmi3 = new JMenuItem("只读");
        JMenuItem jmi4 = new JMenuItem("可写");

        file.add(filegeshi);
        filegeshi.add(jmi1);
        filegeshi.add(jmi2);
        filegeshi.addSeparator();
        filegeshi.add(jmi3);
        filegeshi.add(jmi4);

        file.add("保存文件");
        file.addSeparator();
        file.add("退出");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        menuBar.add(help);
        JFrame frame = new JFrame("典型的菜单界面");
        frame.setSize(600, 400);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
