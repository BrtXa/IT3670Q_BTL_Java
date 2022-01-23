package view.components;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SideBarButton extends JButton {

    public SideBarButton(String buttonLabel) {
        // Customize the button
        super();
        setText(buttonLabel);
        setFocusable(false);
        setHorizontalTextPosition(JButton.CENTER);
        setVerticalTextPosition(JButton.CENTER);
        setFont(new Font("Segoe UI", Font.BOLD, 40));
        setBorder(null);
        setForeground(Color.WHITE);
        setBackground(new Color(0, 22, 65));

        // Add mouse listener
        addMouseListener(new SideBarButtonMouseClick());
    }

    // Button hovering effects
    private class SideBarButtonMouseClick implements MouseListener {

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
            setForeground(new Color(237, 10, 0));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            setForeground(Color.WHITE);
        }

    }
}
