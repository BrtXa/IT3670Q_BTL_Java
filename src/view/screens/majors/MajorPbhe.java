package view.screens.majors;

// package screens.coresubjects;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import view.components.*;
import view.screens.coresubjects.SubjectCard;

public class MajorPbhe implements ActionListener {
    public JFrame coreListFrame = new JFrame("HEAL core subjects");
    public AppBar appBarCore = new AppBar("Điều dưỡng", "");
    public JPanel scrollField = new JPanel();
    public JScrollPane scrollPane;
    public SideBarButton closeButton = new SideBarButton("Đóng");

    public MajorPbhe() {
        // List of subject names and codes
        String subjectCode[] = { "PBHE110", "PBHE111", "PBHE112", "PBHE113", "PBHE114" };
        String subjectName[] = { "Sức khỏe toàn cầu", "Nhân học và xã hội học y tế", "Phòng chống thảm họa",
                "Dịch tễ học ứng dụng trong YTCC", "Phát triển bản thân và tính chuyên nghiệp" };

        // Modifying the frame
        coreListFrame.setBackground(Palette.white());
        coreListFrame.setSize(500, 830);
        coreListFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        coreListFrame.setLocationRelativeTo(null);

        // Create the middle area for scroll pane, and create
        // subject cards using for loop
        scrollField.setBackground(Color.WHITE);
        scrollField.setLayout(new GridLayout(5, 1));
        for (int counter = 0; counter < 5; counter++) {
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
