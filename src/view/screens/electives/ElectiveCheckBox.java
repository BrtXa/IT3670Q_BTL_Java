package view.screens.electives;

import javax.swing.*;
import javax.swing.border.Border;

import controller.functions.CheckboxCounter;
import controller.functions.TuitionFee;
import view.components.Palette;

import java.awt.event.*;

public class ElectiveCheckBox extends JCheckBox {
    public int subjectType;
    Border blueLine = BorderFactory.createLineBorder(Palette.mainBlue());

    public ElectiveCheckBox(String checkBoxName, int subjectType) {
        this.subjectType = subjectType;
        setText(checkBoxName);
        setSelected(false);
        setBackground(Palette.white());
        setForeground(Palette.mainBlue());
        setBorder(blueLine);

        // Add hovering effect
        addMouseListener(new checkBoxHover());
        addItemListener(new checkBoxTicked());
    }

    private class checkBoxHover implements MouseListener {

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
            setBorderPainted(true);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            setBorderPainted(false);
        }
    }

    private class checkBoxTicked implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            // if (CheckboxCounter.getCheckboxCounter() >= 5) {
            // setEnabled(false);
            // } else {
            // setEnabled(true);
            // }
            if (subjectType == 1) {
                if (e.getStateChange() == 1) {
                    setBackground(Palette.mainBlue());
                    setForeground(Palette.white());
                    CheckboxCounter.increment();
                    TuitionFee.addFee(400000);
                } else {
                    setBackground(Palette.white());
                    setForeground(Palette.mainBlue());
                    CheckboxCounter.decrement();
                    TuitionFee.subtractFee(400000);
                }
            } else if (subjectType == 2) {
                if (e.getStateChange() == 1) {
                    setBackground(Palette.mainBlue());
                    setForeground(Palette.white());
                    CheckboxCounter.increment();
                    TuitionFee.addFee(500000);
                } else {
                    setBackground(Palette.white());
                    setForeground(Palette.mainBlue());
                    CheckboxCounter.decrement();
                    TuitionFee.subtractFee(500000);
                }
            } else if (subjectType == 3) {
                if (e.getStateChange() == 1) {
                    setBackground(Palette.mainBlue());
                    setForeground(Palette.white());
                    CheckboxCounter.increment();
                    TuitionFee.addFee(800000);
                } else {
                    setBackground(Palette.white());
                    setForeground(Palette.mainBlue());
                    CheckboxCounter.decrement();
                    TuitionFee.subtractFee(800000);
                }
            }
        }
    }
}
