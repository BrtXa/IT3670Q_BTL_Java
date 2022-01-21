package view.screens.econ;

import javax.swing.*;

import controller.functions.TuitionFee;

import java.awt.event.*;

import view.components.*;
import view.screens.coresubjects.CoreListEcon;
import view.screens.electives.ElectivesEcon;
import view.screens.majors.MajorFina;
import view.screens.majors.MajorMark;
import view.screens.screen2.*;

public class EconScreen implements ActionListener, MouseListener {
    // Create components
    public JFrame econFrame = new JFrame("Econ Major Screen");
    public SideBarButton backButton = new SideBarButton("Quay lại", 3);
    public SideBarButton coreSubjectsButton = new SideBarButton("<html>Xem khối kiến<br/>thức nền tảng</html>", 3);
    public SideBarButton majorOneSubjectsButton = new SideBarButton(
            "<html>Xem module<br/>Tài chính</html>", 3);
    public SideBarButton majorTwoSubjectsButton = new SideBarButton(
            "<html>Xem module<br/>Marketing</html>", 3);
    SideBarEcon sideBar = new SideBarEcon();
    AppBarEcon appBar = new AppBarEcon();
    SideBarButton majorButton = new SideBarButton("<html>Module chuyên sâu<br/>Tài chính</html>",
            1);
    SideBarButton majorButton2 = new SideBarButton("<html>Module chuyên sâu<br/>Marketing</html>",
            1);
    SideBarButton electiveButton = new SideBarButton("<html>Danh sách môn<br/>tự chọn</html>", 2);
    Description description = new Description("");

    public EconScreen() {
        // Setup the frame for first screen
        econFrame.setLayout(null);
        econFrame.setBackground(Palette.white());
        econFrame.setBounds(0, 0, 1300, 760);
        econFrame.setResizable(false);
        econFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        econFrame.setLocationRelativeTo(null);

        // Positioning buttons
        majorButton.setBounds(360, 195, 450, 130);
        majorButton2.setBounds(815, 195, 450, 130);
        electiveButton.setBounds(550, 330, 450, 130);

        // Add listener for buttons to change screen
        majorButton.addActionListener(this);
        majorButton2.addActionListener(this);
        electiveButton.addActionListener(this);

        // The comeback button for switching back to the old screen
        backButton.setBounds(0, 115, 350, 101);
        backButton.addActionListener(this);

        // The button for viewing core subjects
        coreSubjectsButton.setBounds(0, 215, 350, 101);
        coreSubjectsButton.addActionListener(this);
        majorOneSubjectsButton.setBounds(0, 320, 350, 101);
        majorOneSubjectsButton.addActionListener(this);
        majorTwoSubjectsButton.setBounds(0, 425, 350, 101);
        majorTwoSubjectsButton.addActionListener(this);

        // Positioning components
        sideBar.setBounds(0, 0, 350, 720);
        appBar.setBounds(350, 0, 930, 175);

        // Positioning the default description
        description.setBounds(0, 215, 350, 505);

        // Adding components
        econFrame.add(majorButton);
        econFrame.add(majorButton2);
        econFrame.add(electiveButton);
        econFrame.add(backButton);
        econFrame.add(coreSubjectsButton);
        econFrame.add(majorOneSubjectsButton);
        econFrame.add(majorTwoSubjectsButton);
        econFrame.add(sideBar);
        econFrame.add(appBar);
        sideBar.add(description);
    }

    public void show() {
        econFrame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            SecondScreen secondScreen = new SecondScreen();
            secondScreen.show();
            econFrame.dispose();
        } else if (e.getSource() == coreSubjectsButton) {
            CoreListEcon coreListEcon = new CoreListEcon();
            coreListEcon.show();
        } else if (e.getSource() == majorOneSubjectsButton) {
            MajorFina majorFina = new MajorFina();
            majorFina.show();
        } else if (e.getSource() == majorTwoSubjectsButton) {
            MajorMark majorMark = new MajorMark();
            majorMark.show();
        } else if (e.getSource() == majorButton) {
            JOptionPane.showMessageDialog(null, "Học phí chuyên ngành kinh tế với module Tài chính là 12.000.000",
                    "Tổng tiền học phí",
                    JOptionPane.INFORMATION_MESSAGE);
            TuitionFee.setFee(12000000);
        } else if (e.getSource() == majorButton2) {
            JOptionPane.showMessageDialog(null,
                    "Học phí chuyên ngành kinh tế với module Marketing là 12.000.000", "Tổng tiền học phí",
                    JOptionPane.INFORMATION_MESSAGE);
            TuitionFee.setFee(12000000);
        } else if (e.getSource() == electiveButton) {
            TuitionFee.setFee(8000000);
            econFrame.dispose();
            // Electives electives = new Electives();
            // electives.setVisible(true);
            ElectivesEcon electivesEcon = new ElectivesEcon();
            electivesEcon.setVisible(true);
        }

    }
}
