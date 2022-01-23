package view.screens.coresubjects;

// package screens.coresubjects;

import javax.swing.*;

import view.components.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.*;

public class CoreListHeal implements ActionListener {
    public JFrame coreListFrame = new JFrame("ECON core subjects");
    public AppBar appBarCore = new AppBar("HEAL", "<html>Các môn bắt buộc</html>");
    public JPanel scrollField = new JPanel();
    public JScrollPane scrollPane;
    public SideBarButton closeButton = new SideBarButton("Đóng");

    public CoreListHeal() {
        // List of subject names and codes
        String subjectCode[] = { "HEAL110", "HEAL111", "HEAL112", "HEAL113", "HEAL114", "HEAL115", "HEAL116",
                "HEAL117", "HEAL118", "HEAL119", "HEAL120", "PRAC100", "CAP102" };
        String subjectName[] = { "Nhập môn tâm lý học", "Sinh học và di truyển", "Giải phẫu",
                "Hoá học", "Sinh lý học", "Hóa sinh", "Sinh học phân tử", "Tâm lý y học và đạo đức y học",
                "Hoá phân tích",
                "Lý Sinh Y học", "Ký sinh trùng",
                "Thực tế tốt nghiệp",
                "Đồ án tốt nghiệp" };

        // Modifying the frame
        coreListFrame.setBackground(Palette.white());
        coreListFrame.setSize(500, 830);
        coreListFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        coreListFrame.setLocationRelativeTo(null);

        // Create the middle area for scroll pane, and create
        // subject cards using for loop
        scrollField.setBackground(Color.WHITE);
        scrollField.setLayout(new GridLayout(13, 1));
        for (int counter = 0; counter < 13; counter++) {
            SubjectCard subject = new SubjectCard(subjectCode[counter],
                    subjectName[counter]);
            scrollField.add(subject);
        }

        // Add the scroll field to the scroll pane
        scrollPane = new JScrollPane(scrollField);

        // Positioning and adding listener for the close button
        closeButton.addActionListener(this);

        // Adding components
        coreListFrame.add(appBarCore, BorderLayout.NORTH);
        coreListFrame.add(scrollPane, BorderLayout.CENTER);
        coreListFrame.add(closeButton, BorderLayout.SOUTH);
    }

    public void show() {
        coreListFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == closeButton) {
            coreListFrame.dispose();
        }
    }
}
