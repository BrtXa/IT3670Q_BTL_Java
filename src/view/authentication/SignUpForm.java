package view.authentication;

import javax.swing.*;

import view.components.*;
import models.User;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.*;

public class SignUpForm extends JFrame implements ActionListener {
    public AppBar appBar = new AppBar("Chào mừng", "Đăng ký");
    public Form nameField = new Form("Nhập tên");
    public PasswordForm passwordField = new PasswordForm("Nhập mật khẩu");
    public PasswordForm passwordConfirmField = new PasswordForm("Nhập lại mật khẩu");
    public SideBarButton loginButton = new SideBarButton("Đăng ký");

    public void initialize() {
        setTitle("Màn hình đăng ký");
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
        passwordConfirmField.setBounds(65, 400, 420, 85);
        loginButton.setBounds(75, 550, 400, 100);

        // Adding listener for button
        loginButton.addActionListener(this);

        // Adding components
        add(appBar);
        add(nameField);
        add(passwordField);
        add(passwordConfirmField);
        add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String password = passwordField.getText();
        String confirmedPassword = passwordConfirmField.getText();

        // Check for user's inputs, all must be valid
        if (name.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Vui lòng nhập đầy đủ thông tin vào chỗ trống",
                    "Thiếu thông tin",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prompt users to input the password again if the confirmed password is
        // different from the password
        if (!password.equals(confirmedPassword)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Vui lòng xác nhận lại mật khẩu",
                    "Sai mật khẩu xác thực",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Calling the method to create a new row in the database
        User user = createNewUser(name, password);

        // If there are no error, dispose the sign-up screen and allow user to login
        if (user != null) {
            dispose();
        } else {
            JOptionPane.showMessageDialog(
                    SignUpForm.this,
                    "MSSV hoặc mật khẩu không đúng",
                    "Thử lại",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // This is the method to create new row in database
    private User createNewUser(String name, String password) {
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost/myschool?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            // Insert to a new row in the database using the information provided through
            // the textfields
            String sql = "INSERT INTO users (name, password)" + "VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);

            // If the action is completed successfully, assign the values of the User class
            // with the provided information
            int addedRow = preparedStatement.executeUpdate();
            if (addedRow > 0) {
                user = new User();
                User.name = name;
                User.password = password;
            }

            // Compare the new data from the User class to check if it exists in the
            // database
            String fetchCode = "SELECT code FROM users WHERE name=? AND password=?";
            PreparedStatement getCodeStatement = connection.prepareStatement(fetchCode);
            getCodeStatement.setString(1, name);
            getCodeStatement.setString(2, password);

            // If the data exists, illustrates the login code, which is taken from the
            // database
            ResultSet resultSet = getCodeStatement.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Dùng mã: " + resultSet.getString("code") + " để đăng nhập",
                        "Mã số học viên của người dùng",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return user;
    }
}
