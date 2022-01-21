package view.screens.electives;

import javax.swing.*;

import view.components.*;

import java.awt.*;

public class AppBarElectives extends AppBar {
    public AppBarElectives(String titleText, String subTitleText) {
        super();
        // Adding static text first, might change to non-static later
        // The text (title) itself using JLabel
        JLabel title = new JLabel(titleText);
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Segoe UI", Font.PLAIN, 70));

        // Using the same method for subtitle
        JLabel subtitle = new JLabel(subTitleText);
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
