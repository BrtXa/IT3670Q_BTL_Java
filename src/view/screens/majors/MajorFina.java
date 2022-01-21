package view.screens.majors;

// package screens.coresubjects;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.*;

import view.components.*;
import view.screens.coresubjects.AppBarCore;
import view.screens.coresubjects.SubjectCard;

public class MajorFina implements ActionListener {
    public JFrame coreListFrame = new JFrame("ECON core subjects");
    public AppBarCore appBarCore = new AppBarCore("Tài chính");
    public JPanel scrollField = new JPanel();
    public JScrollPane scrollPane;
    public SideBarButton closeButton = new SideBarButton("Đóng", 3);

    public MajorFina() {
        // List of subject names and codes
        String subjectCode[] = { "FINA110", "FINA111", "FINA112", "FINA113", "FINA114" };
        String subjectName[] = { "Kế toán tài chính", "Phân tích tài chính", "Quản trị chiến lược",
                "Thị trường chứng khoán", "Quản trị dòng tiền" };

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
