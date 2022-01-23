package view.components;

import java.awt.*;
import javax.swing.*;

public class AppBar extends JPanel {
    // Create title and subtitle for the app bar
    JLabel title = new JLabel();
    JLabel subTitle = new JLabel();

    public AppBar(String titleText, String subTitleText) {
        setLayout(new GridLayout(2, 1));
        // Make this a horizontal appbar with red color
        setBackground(Palette.mainRed());

        // Setup title and subtitle
        title.setText(titleText);
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Segoe UI", Font.PLAIN, 70));

        subTitle.setText(subTitleText);
        subTitle.setForeground(new Color(255, 255, 255));
        subTitle.setFont(new Font("Segoe UI", Font.PLAIN, 30));

        // Positioning
        add(title);
        add(subTitle);
    }
}
