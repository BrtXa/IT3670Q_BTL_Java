package view.screens.screen2;

import javax.swing.*;
import java.awt.event.*;

import view.components.*;
import view.landing.*;
import view.screens.csit.*;
import view.screens.econ.EconScreen;
import view.screens.heal.HealScreen;

public class SecondScreen implements ActionListener, MouseListener {
    // Create components
    public JFrame secondScreenFrame = new JFrame("Second Screen");
    public SideBarButton backButton = new SideBarButton("Quay lại");
    SideBar sideBar = new SideBar();
    AppBar appBar = new AppBar("Quản lý học tập", "Hãy chọn một chuyên ngành bạn muốn học");
    SideBarButton topButton = new SideBarButton("<html>Khoa học máy tính và Công<br?>nghệ thông tin (CSIT)</html>");
    SideBarButton middleButton = new SideBarButton("<html>Kinh tế và tài chính<br/>(ECON)</html>");
    SideBarButton bottomButton = new SideBarButton("<html>Khoa học sức khỏe<br/>(HEAL)</html>");
    Description description = new Description("");

    public SecondScreen() {
        // Setup the frame for first screen
        secondScreenFrame.setLayout(null);
        secondScreenFrame.setBackground(Palette.white());
        secondScreenFrame.setBounds(0, 0, 1300, 760);
        secondScreenFrame.setResizable(false);
        secondScreenFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        secondScreenFrame.setLocationRelativeTo(null);

        // Positioning buttons
        topButton.setBounds(370, 207, 540, 130);
        middleButton.setBounds(725, 383, 540, 130);
        bottomButton.setBounds(370, 555, 540, 130);

        // Add listener for buttons to change screen
        topButton.addActionListener(this);
        middleButton.addActionListener(this);
        bottomButton.addActionListener(this);

        // Add hovering information for buttons
        topButton.addMouseListener(this);
        middleButton.addMouseListener(this);
        bottomButton.addMouseListener(this);

        // The comeback button for switching back to the old screen
        backButton.setBounds(0, 115, 350, 101);
        backButton.addActionListener(this);

        // Positioning components
        sideBar.setBounds(0, 0, 350, 720);
        appBar.setBounds(350, 0, 930, 175);

        // Positioning the default description
        description.setBounds(0, 215, 350, 505);

        // Adding components
        secondScreenFrame.add(topButton);
        secondScreenFrame.add(middleButton);
        secondScreenFrame.add(bottomButton);
        secondScreenFrame.add(backButton);
        secondScreenFrame.add(sideBar);
        secondScreenFrame.add(appBar);
        sideBar.add(description);
    }

    public void show() {
        secondScreenFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            Root root = new Root();
            root.show();
            secondScreenFrame.dispose();
        } else if (e.getSource() == topButton) {
            CsitScreen csitScreen = new CsitScreen();
            csitScreen.show();
            secondScreenFrame.dispose();
        } else if (e.getSource() == middleButton) {
            EconScreen econScreen = new EconScreen();
            econScreen.show();
            secondScreenFrame.dispose();
        } else if (e.getSource() == bottomButton) {
            HealScreen healScreen = new HealScreen();
            healScreen.show();
            secondScreenFrame.dispose();
        }
    }

    // Hover effects to change descirption
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
        if (e.getSource() == topButton) {
            description.setText("<html>Học cách giải quyết vấn đề và kiến tạo thế giới kỹ thuật số mới</html>");
        } else if (e.getSource() == middleButton) {
            description.setText("<html>Cảm nhận thị trường và vẽ nên bức tranh tài chính của riêng bạn</html>");
        } else if (e.getSource() == bottomButton) {
            description.setText("<html>Tìm hiểu về con người và cách chăm sóc họ, một cách khoa học<html>");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        description.setText("");
    }

}