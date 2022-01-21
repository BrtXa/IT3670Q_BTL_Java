package view.components;

import java.awt.*;
import javax.swing.*;

public class Description extends JLabel {

    public Description(String description) {
        setText(description);
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        setForeground(new Color(255, 255, 255));
        setFont(new Font("Segoe UI", Font.PLAIN, 40));
    }
}
