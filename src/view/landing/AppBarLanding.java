package view.landing;

import java.awt.*;
import javax.swing.*;

import view.components.*;

public class AppBarLanding extends AppBar {
    public AppBarLanding() {
        super();
        // Adding static text first, might change to non-static later
        // The text (title) itself using JLabel
        JLabel title = new JLabel("Trang chủ");
        title.setForeground(new Color(255, 255, 255));
        title.setFont(new Font("Segoe UI", Font.PLAIN, 70));

        // Using the same method for subtitle
        JLabel subtitle = new JLabel("Chọn chương trình đào tạo phù hợp với bạn");
        subtitle.setForeground(new Color(255, 255, 255));
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 30));

        // CONSIDER CREATING CUSTOM CLASS FOR TEXT

        // Positioning widgets
        setLayout(null);
        title.setBounds(25, 6, 904, 105);
        subtitle.setBounds(25, 107, 904, 52);

        // Adding components
        add(title);
        add(subtitle);
    }
}
