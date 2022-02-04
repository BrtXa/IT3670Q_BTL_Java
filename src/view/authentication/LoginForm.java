package view.authentication;

import javax.swing.*;

import view.components.*;
import view.landing.Root;
import models.User;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.*;

public class LoginForm extends JFrame implements ActionListener {
    public AppBar appBar = new AppBar("Chào mừng", "Đăng nhập");
    public Form nameField = new Form("Nhập MSHV");
    public PasswordForm passwordField = new PasswordForm("Nhập mật khẩu");
    public SideBarButton loginButton = new SideBarButton("Đăng nhập");
    public SideBarButton SignUpButton = new SideBarButton("Đăng ký");

    public void initialize() {
        setTitle("Màn hinh đăng nhập");
        setLayout(null);
        setBackground(Palette.white());
        setBounds(0, 0, 550, 700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Positioning components
        appBar.setBounds(0, 0, 550, 175);
        nameField.setBounds(65, 200, 420, 85);
        passwordField.setBounds(65, 300, 420, 85);
        loginButton.setBounds(75, 425, 400, 100);
        SignUpButton.setBounds(75, 550, 400, 100);

        // Adding listener for button
        loginButton.addActionListener(this);
        SignUpButton.addActionListener(this);

        // Adding components
        add(appBar);
        add(nameField);
        add(passwordField);
        add(loginButton);
        add(SignUpButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String mshv = nameField.getText();
            String password = passwordField.getText();

            // Calling the authentication method
            User user = getUserCredential(mshv, password);

            // If the method return a valid result, login the user
            if (user != null) {
                Root root = new Root();
                root.show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(
                        LoginForm.this,
                        "MSSV hoặc mật khẩu không đúng",
                        "Thử lại",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == SignUpButton) {
            SignUpForm signUpForm = new SignUpForm();
            signUpForm.initialize();
            // dispose();
        }

    }

    // This is the authentication method
    private User getUserCredential(String mshv, String password) {
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost/myschool?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            // Generating SQL query, this will find the user information
            String sql = "SELECT * FROM users WHERE code=? AND password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mshv);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            // If the information provided through the textfields is correct then assign
            // the user information to the User class
            if (resultSet.next()) {
                user = new User();
                User.name = resultSet.getString("name");
                User.code = resultSet.getString("code");
                User.password = resultSet.getString("password");
            }

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return user;
    }
}
