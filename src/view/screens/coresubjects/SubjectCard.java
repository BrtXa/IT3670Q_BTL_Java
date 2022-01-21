package view.screens.coresubjects;

import javax.swing.*;
import javax.swing.border.Border;

import view.components.Palette;

import java.awt.*;

public class SubjectCard extends JPanel {
    Border blueline = BorderFactory.createLineBorder(Palette.mainBlue());

    public SubjectCard(String subjectCode, String subjectName) {
        setBackground(Palette.white());
        setSize(430, 100);

        // The subject code and name using JLabel
        JLabel subjectCodes = new JLabel(subjectCode, SwingConstants.CENTER);
        subjectCodes.setForeground(Palette.mainBlue());
        subjectCodes.setFont(new Font("Segoe UI", Font.BOLD, 20));

        JLabel subjectNames = new JLabel(subjectName, SwingConstants.CENTER);
        subjectNames.setForeground(Palette.mainBlue());
        subjectNames.setFont(new Font("Segoe UI", Font.BOLD, 20));

        // Postitioning them and add the border
        setLayout(new GridLayout(2, 1));
        setBorder(blueline);

        // Adding components
        add(subjectCodes);
        add(subjectNames);
    }
}
