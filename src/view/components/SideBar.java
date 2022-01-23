package view.components;

import javax.swing.*;

public class SideBar extends JPanel {

    public SideBar() {
        setBackground(Palette.mainBlue());

        // Create a logo using JLabel and Imageicon
        JLabel homeLogo = new JLabel();
        ImageIcon t2uh = new ImageIcon("t2uh.png");
        homeLogo.setIcon(t2uh);
        // NOTE: FIXING THE ISSUE WITH THE LOGO NOT APPEARING

        // Positioning widgets
        setLayout(null);
        // homeLogo.setBounds(25, 60, 300, 60);
        // Adding components
        add(homeLogo);
    }
}
