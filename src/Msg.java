

import javax.swing.JOptionPane;

public class Msg {
    //method that uses ShowMessageDialog to create a popup message
    public static void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    //method that uses showInputDialog to create a popup message that can include an input
    public static String in(Object msg, String title) {
        return JOptionPane.showInputDialog(null, msg, title, -1);
    }

    //method that uses showOptionDialog to create a popup message with options
    public static int opt(Object[] o, Object msg, String ttl) {
        return JOptionPane.showOptionDialog(
                null, msg, ttl,
                -1,
                -1,
                null,
                o,
                Integer.valueOf(0));
    }
}

