package view.screens.heal;

import java.awt.*;
import javax.swing.*;

import view.components.*;

public class AppBarHeal extends AppBar {
    public AppBarHeal() {
        super();
        // Adding static text first, might change to non-static later
        // The text (title) itself using JLabel
        JLabel title = new JLabel("Khoa học sức khỏe");
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Segoe UI", Font.PLAIN, 70));

        // Using the same method for subtitle
        JLabel subtitle = new JLabel("Chọn một module chuyên sâu hoặc 05 môn tự chọn");
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