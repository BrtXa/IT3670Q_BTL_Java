package view.screens.electives;

import javax.swing.*;

import controller.functions.CheckboxCounter;
import controller.functions.TuitionFee;
import view.components.*;

import java.awt.event.*;

public class Electives extends JFrame implements ActionListener {

    public AppBar appBar = new AppBar("Danh sách môn tự chọn",
            "Nhấn để chọn chính xác 05 môn tự chọn ");
    public SideBarButton backButton = new SideBarButton("Quay lại");
    public SideBarButton calculateButton = new SideBarButton("Tính học phí");
    public SideBar sideBar = new SideBar();

    public void backButtonPress() {

    }

    public Electives() {
        // Setup the frame for first screen
        setTitle("Elective choosing screen");
        setLayout(null);
        setBackground(Palette.white());
        setBounds(0, 0, 1300, 760);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Positioning components
        appBar.setBounds(0, 0, 1280, 175);
        backButton.setBounds(0, 175, 350, 100);
        calculateButton.setBounds(0, 280, 350, 100);
        sideBar.setBounds(0, 175, 350, 545);

        // Passing the list of subject for workspace

        // Adding buttons listener
        backButton.addActionListener(this);
        calculateButton.addActionListener(this);

        // Adding components
        add(backButton);
        add(calculateButton);
        add(sideBar);
        add(appBar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            CheckboxCounter.resetCounter();
            backButtonPress();
            dispose();
        } else if (e.getSource() == calculateButton) {
            if (CheckboxCounter.getCheckboxCounter() > 5 || CheckboxCounter.getCheckboxCounter() < 5) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn đúng 5 học phần", "Thông báo",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Học phí của bạn là: " + TuitionFee.getFee() + " VND", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
