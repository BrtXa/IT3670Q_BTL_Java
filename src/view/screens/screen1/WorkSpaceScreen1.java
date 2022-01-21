package view.screens.screen1;

import java.awt.*;
import javax.swing.*;

import view.components.*;

public class WorkSpaceScreen1 extends WorkSpace {
    public WorkSpaceScreen1() {
        super();
        // Adding static text first, might change to non-static later
        // Adding texts using JLabel
        JLabel schoolName = new JLabel("Trường: Công nghệ thông tin và Khoa học máy tính");
        schoolName.setForeground(Palette.black());
        schoolName.setFont(new Font("Segoe UI", Font.BOLD, 30));

        JLabel studentMajor = new JLabel("Chuyên ngành: Công nghệ thông tin");
        studentMajor.setForeground(Palette.black());
        studentMajor.setFont(new Font("Segoe UI", Font.BOLD, 30));

        JLabel currentCredits = new JLabel("Số tín chỉ đã đăng ký: 32/164");
        currentCredits.setForeground(Palette.black());
        currentCredits.setFont(new Font("Segoe UI", Font.BOLD, 30));

        JLabel studentService = new JLabel("Dịch vụ sinh viên: Có");
        studentService.setForeground(Palette.black());
        studentService.setFont(new Font("Segoe UI", Font.BOLD, 30));

        // Positioning widgets
        setLayout(null);
        schoolName.setBounds(25, 32, 905, 40);
        studentMajor.setBounds(25, 107, 905, 40);
        currentCredits.setBounds(25, 182, 905, 40);
        studentService.setBounds(25, 257, 905, 40);

        // Adding components
        add(schoolName);
        add(studentMajor);
        add(currentCredits);
        add(studentService);
    }
}
