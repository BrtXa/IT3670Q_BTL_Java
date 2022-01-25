package view.screens.screen1;

import java.awt.*;
import javax.swing.*;

import models.User;
import view.components.*;

public class WorkSpaceScreen1 extends WorkSpace {
    User user = new User();

    public WorkSpaceScreen1() {
        super();
        // Adding static text first, might change to non-static later
        // Adding texts using JLabel
        JLabel schoolName = new JLabel("Họ và tên: " + User.getName());
        schoolName.setForeground(Palette.black());
        schoolName.setFont(new Font("Segoe UI", Font.BOLD, 30));

        JLabel studentMajor = new JLabel("Mã số học viên: " + User.getCode());
        studentMajor.setForeground(Palette.black());
        studentMajor.setFont(new Font("Segoe UI", Font.BOLD, 30));

        // Positioning widgets
        setLayout(null);
        schoolName.setBounds(25, 32, 905, 40);
        studentMajor.setBounds(25, 107, 905, 40);

        // Adding components
        add(schoolName);
        add(studentMajor);
    }
}
