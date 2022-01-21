package view.screens.screen1;

import java.awt.*;
import javax.swing.*;

import view.components.AppBar;

public class AppBarScreen1 extends AppBar {
    public AppBarScreen1() {
        super();
        // Adding static text first, might change to non-static later
        // The text (title) itself using JLabel
        JLabel title = new JLabel("Thông tin sinh viên");
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Segoe UI", Font.PLAIN, 70));

        // Using the same method for subtitle
        JLabel studentName = new JLabel("Họ và tên: Nguyễn Bách Khoa");
        studentName.setForeground(new Color(255, 255, 255));
        studentName.setFont(new Font("Segoe UI", Font.PLAIN, 30));

        // Using the same method for subtitle 2
        JLabel studentCode = new JLabel("MSSV: 220212345");
        studentCode.setForeground(new Color(255, 255, 255));
        studentCode.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        // CONSIDER CREATING CUSTOM CLASS FOR TEXT

        // Positioning widgets
        setLayout(null);
        title.setBounds(25, 6, 904, 105);
        studentName.setBounds(25, 107, 904, 52);
        studentCode.setBounds(25, 162, 904, 52);

        // Adding components
        add(title);
        add(studentName);
        add(studentCode);
    }
}
