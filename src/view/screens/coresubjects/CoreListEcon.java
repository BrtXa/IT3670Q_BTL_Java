package view.screens.coresubjects;

// package screens.coresubjects;

import javax.swing.*;

import view.components.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.*;

public class CoreListEcon implements ActionListener {
    public JFrame coreListFrame = new JFrame("ECON core subjects");
    public AppBarCore appBarCore = new AppBarCore("ECON");
    public JPanel scrollField = new JPanel();
    public JScrollPane scrollPane;
    public SideBarButton closeButton = new SideBarButton("Đóng", 3);

    public CoreListEcon() {
        // List of subject names and codes
        String subjectCode[] = { "ECON110", "ECON111", "ECON112", "ECON113", "ECON114", "ECON115", "ECON116",
                "ECON117", "ECON118", "ECON119", "ECON120", "BUSS100", "CAP101" };
        String subjectName[] = { "Kinh tế vĩ mô", "Kinh tế vi mô", "Toán kinh tế",
                "Pháp luật đại cương", "Quản lý kinh doanh", "Kinh tế lượng", "Nguyên lý kế toán",
                "Lý thuyết tiền tệ", "Kiểm toán căn bản", "Tài chính doanh nghiệp", "Tài chính quốc tế",
                "Thực tập kinh doanh",
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
