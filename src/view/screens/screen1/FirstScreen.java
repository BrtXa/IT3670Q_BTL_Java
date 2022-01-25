package view.screens.screen1;

import javax.swing.*;

import java.awt.event.*;

import view.components.*;
import view.landing.*;

public class FirstScreen implements ActionListener {
    // Create components for the first screen
    public JFrame firstScreenFrame = new JFrame("First Screen");
    public SideBarButton backButton = new SideBarButton("Quay lại");
    public SideBar sideBar = new SideBar();
    public AppBar appBar = new AppBar("Thông tin sinh viên", "Thông tin cá nhân của bạn được hiển thị ở phía dưới");
    public WorkSpaceScreen1 workSpace = new WorkSpaceScreen1();

    public FirstScreen() {
        // Setup the frame for first screen
        firstScreenFrame.setLayout(null);
        firstScreenFrame.setBackground(Palette.white());
        firstScreenFrame.setBounds(0, 0, 1300, 760);
        firstScreenFrame.setResizable(false);
        firstScreenFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        firstScreenFrame.setLocationRelativeTo(null);

        // The comeback button for switching back to the old screen
        backButton.setBounds(0, 115, 350, 101);
        backButton.addActionListener(this);

        // Positioning components
        sideBar.setBounds(0, 0, 350, 720);
        appBar.setBounds(350, 0, 930, 215);
        workSpace.setBounds(350, 215, 930, 505);

        // Adding components
        firstScreenFrame.add(backButton);
        firstScreenFrame.add(sideBar);
        firstScreenFrame.add(appBar);
        firstScreenFrame.add(workSpace);
    }

    public void show() {
        firstScreenFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            Root root = new Root();
            root.show();
            firstScreenFrame.dispose();
        }
    }
}
