

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuessCode {
    public GuessCode() throws IOException {
        //INSTACE VARIALBES
        Object[] Buttons = { "1", "2", "Exit" };
        String ques = "Question 1\nQuestion 2";
        JPanel panel = new JPanel();
        JButton exit = new JButton("Exit");
        ImageIcon c = new ImageIcon(getClass().getResource("Final.png"));
        BufferedImage wPic = ImageIO.read(getClass().getResource("Final.png"));
        JLabel wIcon = new JLabel(new ImageIcon(wPic));

        //ADDS ICONS TO A LABEL
        panel.add(wIcon);
        panel.add(exit, "South");

        //CREATES LABEL AT TOP WITH NAME SEATING CHART
        int z = JOptionPane.showOptionDialog(null, ques, "seating chart", -1, -1, c, Buttons, null);

    }
}
