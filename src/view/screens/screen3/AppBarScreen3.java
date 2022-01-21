package view.screens.screen3;

import java.awt.*;
import javax.swing.*;

import view.components.*;

public class AppBarScreen3 extends AppBar {
    public AppBarScreen3() {
        super();
        // Adding static text first, might change to non-static later
        // The text (title) itself using JLabel
        JLabel title = new JLabel("Thông tin công nợ học phí");
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Segoe UI", Font.PLAIN, 70));

        // Positioning widgets
        setLayout(null);
        title.setBounds(25, 6, 904, 105);

        // Adding components
        add(title);
    }
}
