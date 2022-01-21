package view.screens.coresubjects;

import java.awt.*;
import javax.swing.*;

import view.components.*;

public class AppBarCore extends AppBar {
    public AppBarCore(String majorName) {
        super();
        // The text (title) itself using JLabel
        JLabel title = new JLabel(majorName, SwingConstants.LEADING);
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Segoe UI", Font.PLAIN, 50));

        // Using the same method for subtitle
        JLabel subtitle = new JLabel("<html>Các môn bắt buộc</html>", SwingConstants.LEADING);
        subtitle.setForeground(new Color(255, 255, 255));
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 30));

        // Postitioning texts
        setLayout(null);
        title.setBounds(10, 0, 400, 105);
        subtitle.setBounds(10, 105, 310, 45);

        add(title);
        add(subtitle);
    }
}
