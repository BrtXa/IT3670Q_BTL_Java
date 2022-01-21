package client;

import javax.swing.*;

import view.landing.*;

public class Main {
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Root root = new Root();
                root.show();
            }
        });
    }
}
