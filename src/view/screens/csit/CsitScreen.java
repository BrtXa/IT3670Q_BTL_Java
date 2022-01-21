package view.screens.csit;

import javax.swing.*;

import controller.functions.TuitionFee;

import java.awt.event.*;

import view.components.*;
import view.screens.coresubjects.CoreListCsit;
import view.screens.electives.ElectivesCsit;
import view.screens.majors.MajorCscs;
import view.screens.majors.MajorCsds;
import view.screens.screen2.*;

public class CsitScreen implements ActionListener, MouseListener {
    // Create components
    public JFrame csitFrame = new JFrame("CSIT Major Screen");
    public SideBarButton backButton = new SideBarButton("Quay lại", 3);
    public SideBarButton coreSubjectsButton = new SideBarButton(
            "<html>Xem khối kiến<br/>thức nền tảng</html>", 3);
    public SideBarButton majorOneSubjectsButton = new SideBarButton(
            "<html>Xem module<br/>DS&AI</html>", 3);
    public SideBarButton majorTwoSubjectsButton = new SideBarButton(
            "<html>Xem module<br/>An ninh mạng</html>", 3);
    SideBarCsit sideBar = new SideBarCsit();
    AppBarCsit appBar = new AppBarCsit();
    SideBarButton majorButton = new SideBarButton("<html>Module chuyên sâu<br/>DS&AI</html>",
            1);
    SideBarButton majorButton2 = new SideBarButton("<html>Module chuyên sâu<br/>An ninh mạng</html>",
            1);
    SideBarButton electiveButton = new SideBarButton("<html>Danh sách môn<br/>tự chọn</html>", 2);
    Description description = new Description("");

    public CsitScreen() {
        // Setup the frame for first screen
        csitFrame.setLayout(null);
        csitFrame.setBackground(Palette.white());
        csitFrame.setBounds(0, 0, 1300, 760);
        csitFrame.setResizable(false);
        csitFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        csitFrame.setLocationRelativeTo(null);

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
        csitFrame.add(majorButton);
        csitFrame.add(majorButton2);
        csitFrame.add(electiveButton);
        csitFrame.add(backButton);
        csitFrame.add(coreSubjectsButton);
        csitFrame.add(majorOneSubjectsButton);
        csitFrame.add(majorTwoSubjectsButton);
        csitFrame.add(sideBar);
        csitFrame.add(appBar);
        sideBar.add(description);
    }

    public void show() {
        csitFrame.setVisible(true);
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
            csitFrame.dispose();
        } else if (e.getSource() == coreSubjectsButton) {
            CoreListCsit coreListCsit = new CoreListCsit();
            coreListCsit.show();
        } else if (e.getSource() == majorOneSubjectsButton) {
            MajorCsds majorCsds = new MajorCsds();
            majorCsds.show();
        } else if (e.getSource() == majorTwoSubjectsButton) {
            MajorCscs majorCscs = new MajorCscs();
            majorCscs.show();
        } else if (e.getSource() == majorButton) {
            JOptionPane.showMessageDialog(null, "Học phí chuyên ngành khoa học máy tính với module DS&AI là 15.000.000",
                    "Tổng tiền học phí",
                    JOptionPane.INFORMATION_MESSAGE);
            TuitionFee.setFee(15000000);
        } else if (e.getSource() == majorButton2) {
            JOptionPane.showMessageDialog(null,
                    "Học phí chuyên ngành khoa học máy tính với module an ninh mạng là 15.000.000", "Tổng tiền học phí",
                    JOptionPane.INFORMATION_MESSAGE);
            TuitionFee.setFee(15000000);
        } else if (e.getSource() == electiveButton) {
            TuitionFee.setFee(10000000);
            csitFrame.dispose();
            // Electives electives = new Electives();
            // electives.setVisible(true);
            ElectivesCsit electivesCsit = new ElectivesCsit();
            electivesCsit.setVisible(true);
        }

    }
}
