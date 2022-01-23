package view.screens.screen3;

import javax.swing.*;

import controller.functions.TuitionFee;

import java.awt.*;
import java.awt.event.*;

import view.components.*;
import view.landing.*;

public class ThirdScreen implements ActionListener {
    // Create components for the first screen
    public JFrame thirdScreenFrame = new JFrame("Third Screen");
    public SideBarButton backButton = new SideBarButton("Quay lại");
    public SideBar sideBar = new SideBar();
    public AppBar appBar = new AppBar("Thông tin công nợ học phí", "");
    public JLabel currentFeeText = new JLabel();
    public JLabel tuitionFeeText = new JLabel();

    JPanel tuitionFeeContainer = new JPanel();

    public ThirdScreen() {
        // Setup the frame for first screen
        thirdScreenFrame.setLayout(null);
        thirdScreenFrame.setBackground(Palette.white());
        thirdScreenFrame.setBounds(0, 0, 1300, 760);
        thirdScreenFrame.setResizable(false);
        thirdScreenFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        thirdScreenFrame.setLocationRelativeTo(null);

        // The comeback button for switching back to the old screen
        backButton.setBounds(0, 115, 350, 101);
        backButton.addActionListener(this);

        tuitionFeeContainer.setBackground(Palette.mainRed());

        // Set the messages
        currentFeeText.setText("Số học phí hiện tại bạn cần đóng là");
        tuitionFeeText.setText(TuitionFee.getFee() + " VND");

        // Styling the messages
        currentFeeText.setFont(new Font("Segoe UI", Font.BOLD, 30));
        currentFeeText.setForeground(Color.BLACK);

        tuitionFeeText.setFont(new Font("Segoe UI", Font.BOLD, 40));
        tuitionFeeText.setForeground(Color.WHITE);

        // Positioning components
        sideBar.setBounds(0, 0, 350, 720);
        appBar.setBounds(350, 0, 930, 215);
        currentFeeText.setBounds(570, 254, 925, 40);
        tuitionFeeText.setBounds(12, 18, 515, 23);
        tuitionFeeContainer.setBounds(545, 312, 540, 60);

        // Adding components
        thirdScreenFrame.add(backButton);
        thirdScreenFrame.add(sideBar);
        thirdScreenFrame.add(appBar);
        thirdScreenFrame.add(currentFeeText);
        tuitionFeeContainer.add(tuitionFeeText);
        thirdScreenFrame.add(tuitionFeeContainer);
    }

    public void show() {
        thirdScreenFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            Root root = new Root();
            root.show();
            thirdScreenFrame.dispose();
        }
    }
}
