package view.screens.screen2;

import java.awt.*;
import javax.swing.*;

import view.components.*;

public class AppBarScreen2 extends AppBar {
    public AppBarScreen2() {
        super();
        // Adding static text first, might change to non-static later
        // The text (title) itself using JLabel
        JLabel title = new JLabel("Quản lý học tập");
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Segoe UI", Font.PLAIN, 70));

        // Using the same method for subtitle
        JLabel subtitle = new JLabel("Hãy chọn một chuyên ngành bạn muốn học");
        subtitle.setForeground(new Color(255, 255, 255));
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 30));

        // Positioning widgets
        setLayout(null);
        title.setBounds(25, 6, 904, 105);
        subtitle.setBounds(25, 107, 904, 52);

        // Adding components
        add(title);
        add(subtitle);
    }
}
