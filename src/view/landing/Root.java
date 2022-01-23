package view.landing;

import java.awt.event.*;
import javax.swing.*;

import view.components.*;
import view.screens.screen1.FirstScreen;
import view.screens.screen2.SecondScreen;
import view.screens.screen3.ThirdScreen;

public class Root implements ActionListener, MouseListener {
    // Creating components
    JFrame root;
    SideBarButton topButton = new SideBarButton("Cá nhân");
    SideBarButton middleButton = new SideBarButton("<html>Quản lý<br/>học tập</html>");
    SideBarButton bottomButton = new SideBarButton("Học phí");
    AppBar appBarLanding = new AppBar("Trang chủ", "Chọn chương trình đào tạo phù hợp với bạn");
    SideBar sideBarLanding = new SideBar();
    Description description = new Description("");

    public Root() {
        // This is the application window
        root = new JFrame();
        root.setTitle("Group 1");
        root.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        root.setSize(1300, 760);
        root.setLocationRelativeTo(null);
        root.setResizable(false);
        root.setLayout(null);

        // Positioning buttons
        topButton.setBounds(507, 251, 200, 200);
        middleButton.setBounds(507, 487, 200, 200);
        bottomButton.setBounds(827, 251, 200, 200);

        // Add listener for buttons to change screen
        topButton.addActionListener(this);
        middleButton.addActionListener(this);
        bottomButton.addActionListener(this);

        // Add hovering information for buttons
        topButton.addMouseListener(this);
        middleButton.addMouseListener(this);
        bottomButton.addMouseListener(this);

        // Positioning Components
        appBarLanding.setBounds(350, 0, 930, 175);
        sideBarLanding.setBounds(0, 0, 350, 720);

        // Positioning the default description
        description.setBounds(0, 215, 350, 505);

        // Add buttons and componets to the root
        root.add(topButton);
        root.add(middleButton);
        root.add(bottomButton);
        root.add(appBarLanding);
        root.add(sideBarLanding);
        sideBarLanding.add(description);
    }

    public void show() {
        root.setVisible(true);
    }

    // Listener for buttons to change to new screen
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == topButton) {
            root.dispose();
            FirstScreen firstScreen = new FirstScreen();
            firstScreen.show();
        } else if (e.getSource() == middleButton) {
            root.dispose();
            SecondScreen secondScreen = new SecondScreen();
            secondScreen.show();
        } else if (e.getSource() == bottomButton) {
            root.dispose();
            ThirdScreen thirdScreen = new ThirdScreen();
            thirdScreen.show();
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
            description.setText("<html>Xem thông tin cá</br> nhân của bạn</html>");
        } else if (e.getSource() == middleButton) {
            description.setText("<html>Xây dựng chương</br> trình học của bạn</html>");
        } else if (e.getSource() == bottomButton) {
            description.setText("<html>Xem thông tin</br> học phí của bạn<html>");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        description.setText("");
    }

}
