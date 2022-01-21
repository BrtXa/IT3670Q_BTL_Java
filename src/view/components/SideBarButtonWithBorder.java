package view.components;

import java.awt.*;
import java.awt.event.*;

//import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.Border;

public class SideBarButtonWithBorder extends JButton {
    public int screenIndex;
    Border whiteLine = BorderFactory.createLineBorder(Palette.white());

    public SideBarButtonWithBorder(String buttonLabel, int screenIndex) {
        // Customize the button
        super();
        setText(buttonLabel);
        setFocusable(false);
        setHorizontalTextPosition(JButton.CENTER);
        setVerticalTextPosition(JButton.CENTER);
        setFont(new Font("Segoe UI", Font.BOLD, 40));
        setBorder(whiteLine);
        setForeground(Color.WHITE);
        setBackground(new Color(0, 22, 65));

        // Add mouse listener
        addMouseListener(new SideBarButtonMouseClick(screenIndex));
    }

    // Button hovering effects
    private class SideBarButtonMouseClick implements MouseListener {
        public int screenIndex;

        public SideBarButtonMouseClick(int screenIndex) {
            this.screenIndex = screenIndex;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Button " + screenIndex + " pressed");
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            setForeground(new Color(237, 10, 0));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            setForeground(Color.WHITE);
        }

    }
}
