package view.screens.coresubjects;

// package screens.coresubjects;

import javax.swing.*;

import view.components.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.*;

public class CoreListCsit implements ActionListener {
    public JFrame coreListFrame = new JFrame("CSIT core subjects");
    public AppBar appBarCore = new AppBar("CSIT", "<html>Các môn bắt buộc</html>");
    public JPanel scrollField = new JPanel();
    public JScrollPane scrollPane;
    public SideBarButton closeButton = new SideBarButton("Đóng");

    public CoreListCsit() {
        // List of subject names and codes
        String subjectCode[] = { "CSIT110", "CSIT111", "CSIT112", "CSIT113", "CSIT114", "CSIT115", "CSIT116",
                "CSIT117", "CSIT118", "CSIT119", "CSIT120", "TECH100", "CAP100" };
        String subjectName[] = { "Nhập môn khoa học máy tính", "Toán kỹ thuật", "Vật lý kỹ thuật",
                "Nhập môn lập trình", "Cơ sở dữ liệu", "Lập trình và thiết kế hướng đối tượng", "Tương tác người - máy",
                "Hệ điều hành", "Group Project", "Thiết kế phần mềm", "Cấu trúc dữ liệu và giải thuật",
                "Thực tập kỹ thuật",
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
