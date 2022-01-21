package view.components;

import java.awt.*;

import javax.swing.*;

public class SideBar extends JPanel {
    SideBarButton selectedButton;

    public SideBar(int currentScreen) {
        setBackground(Palette.mainBlue());
        setPreferredSize(new Dimension(350, 720));

        // Create a logo using JLabel and Imageicon
        JLabel homeLogo = new JLabel();
        ImageIcon t2uh = new ImageIcon("t2uh.png");
        homeLogo.setIcon(t2uh);
        homeLogo.setText(null);
        // NOTE: FIXING THE ISSUE WITH THE LOGO NOT APPEARING

        // Create buttons using custom class SideBarButton
        SideBarButton topButton = new SideBarButton("Cá nhân", 1);
        SideBarButton middleButton = new SideBarButton("Quản lý học tập", 2);
        SideBarButton bottomButton = new SideBarButton("Học phí", 3);

        // Verify which screen is chosen
        if (currentScreen == 1) {
            selectedButton = topButton;
        } else if (currentScreen == 2) {
            selectedButton = middleButton;
        } else if (currentScreen == 3) {
            selectedButton = bottomButton;
        }

        // Modifying the selected button
        selectedButton.setBackground(Palette.secondBlue());

        // Positioning widgets
        setLayout(null);
        // homeLogo.setBounds(25, 60, 300, 60);
        homeLogo.setBounds(0, 0, 300, 60);
        topButton.setBounds(0, 300, 350, 101);
        middleButton.setBounds(0, 390, 350, 101);
        bottomButton.setBounds(0, 480, 350, 101);

        // Adding components
        // add(homeLogo);
        add(homeLogo);
    }
}
