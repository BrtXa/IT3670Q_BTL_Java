package view.components;

import javax.swing.*;

import java.awt.*;

public class Form extends JPanel {
    public JLabel formTitle = new JLabel();
    public JTextField fillArea = new JTextField();

    public Form(String formTitleText) {
        setLayout(new GridLayout(2, 1));

        // Customize font title
        formTitle.setText(formTitleText);
        formTitle.setFont(new Font("Segoe UI", Font.BOLD, 30));
        formTitle.setForeground(Color.BLACK);
        formTitle.setBackground(Color.WHITE);

        // Customeize the fill area
        fillArea.setSize(420, 50);
        fillArea.setBackground(Palette.mainBlue());
        fillArea.setForeground(Palette.white());
        fillArea.setCaretColor(Palette.white());
        fillArea.setFont(new Font("Segoe UI", Font.BOLD, 20));

        // Adding title and the fill area
        add(formTitle);
        add(fillArea);
    }

    // Function to get the text from user
    public String getText() {
        return fillArea.getText();
    }
}
