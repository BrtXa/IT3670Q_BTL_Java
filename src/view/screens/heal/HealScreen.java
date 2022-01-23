package view.screens.heal;

import javax.swing.*;

import controller.functions.TuitionFee;

import java.awt.event.*;

import view.components.*;
import view.screens.coresubjects.CoreListHeal;
import view.screens.electives.ElectivesHeal;
import view.screens.majors.MajorNurs;
import view.screens.majors.MajorPbhe;
import view.screens.screen2.*;

public class HealScreen implements ActionListener, MouseListener {
    // Create components
    public JFrame healFrame = new JFrame("Heal Major Screen");
    public SideBarButton backButton = new SideBarButton("Quay lại");
    public SideBarButton coreSubjectsButton = new SideBarButton("<html>Xem khối kiến<br/>thức nền tảng</html>");
    public SideBarButton majorOneSubjectsButton = new SideBarButton(
            "<html>Xem module<br/>Điều dưỡng</html>");
    public SideBarButton majorTwoSubjectsButton = new SideBarButton(
            "<html>Xem module<br/>Y tế cộng đồng</html>");
    SideBar sideBar = new SideBar();
    AppBar appBar = new AppBar("Khoa học sức khỏe", "Chọn một module chuyên sâu hoặc 05 môn tự chọn");
    SideBarButton majorButton = new SideBarButton("<html>Module chuyên sâu<br/>Điều dưỡng</html>");
    SideBarButton majorButton2 = new SideBarButton("<html>Module chuyên sâu<br/>Y tế cộng đồng</html>");
    SideBarButton electiveButton = new SideBarButton("<html>Danh sách môn<br/>tự chọn</html>");
    Description description = new Description("");

    public HealScreen() {
        // Setup the frame for first screen
        healFrame.setLayout(null);
        healFrame.setBackground(Palette.white());
        healFrame.setBounds(0, 0, 1300, 760);
        healFrame.setResizable(false);
        healFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        healFrame.setLocationRelativeTo(null);

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
        healFrame.add(majorButton);
        healFrame.add(majorButton2);
        healFrame.add(electiveButton);
        healFrame.add(backButton);
        healFrame.add(coreSubjectsButton);
        healFrame.add(majorOneSubjectsButton);
        healFrame.add(majorTwoSubjectsButton);
        healFrame.add(sideBar);
        healFrame.add(appBar);
        sideBar.add(description);
    }

    public void show() {
        healFrame.setVisible(true);
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
            healFrame.dispose();
        } else if (e.getSource() == coreSubjectsButton) {
            CoreListHeal coreListHeal = new CoreListHeal();
            coreListHeal.show();
        } else if (e.getSource() == majorOneSubjectsButton) {
            MajorNurs majorNurs = new MajorNurs();
            majorNurs.show();
        } else if (e.getSource() == majorTwoSubjectsButton) {
            MajorPbhe majorPbhe = new MajorPbhe();
            majorPbhe.show();
        } else if (e.getSource() == majorButton) {
            JOptionPane.showMessageDialog(null,
                    "Học phí chuyên ngành khoa học sức khỏe với module Điều dưỡng là 24.000.000",
                    "Tổng tiền học phí",
                    JOptionPane.INFORMATION_MESSAGE);
            TuitionFee.setFee(24000000);
        } else if (e.getSource() == majorButton2) {
            JOptionPane.showMessageDialog(null,
                    "Học phí chuyên ngành khoa học sức khỏe với module Y tế cộng đồng là 24.000.000",
                    "Tổng tiền học phí",
                    JOptionPane.INFORMATION_MESSAGE);
            TuitionFee.setFee(24000000);
        } else if (e.getSource() == electiveButton) {
            TuitionFee.setFee(16000000);
            healFrame.dispose();
            // Electives electives = new Electives();
            // electives.setVisible(true);
            ElectivesHeal electivesHeal = new ElectivesHeal();
            electivesHeal.setVisible(true);
        }

    }
}
