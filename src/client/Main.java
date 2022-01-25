package client;

import javax.swing.*;

import view.authentication.LoginForm;

public class Main {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginForm loginForm = new LoginForm();
                loginForm.initialize();
            }
        });
    }
}
