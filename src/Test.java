

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame {
    //INSTANCE VARIABLES
    private JPanel pan = new JPanel(null);
    private JLabel j1;

    //CONSTRUCTOR that was used to intially test creating a panel withc pictures of people
    public Test() throws IOException {
        BufferedImage river = ImageIO.read(getClass().getResource("river.JPG"));
        JLabel riv = new JLabel(new ImageIcon(river));
        riv.setLocation(0, 0);
        this.pan.add(riv);
        setDefaultCloseOperation(3);
        getContentPane().add(this.pan);
        setSize(500, 500);
        setVisible(true);
    }


}
