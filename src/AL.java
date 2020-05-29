

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class AL extends JFrame implements WindowListener, ActionListener {

    //INSTANCE VARIABLES
    static final int pic = (int)(Math.random() * 16.0D);

    int pic2 = pic;

    Button b;

    Icon love = new ImageIcon(getClass().getResource("love.jpg"));

    int cnt = 0;

    ArrayList<JLabel> panelList = new ArrayList<>();

    ArrayList<JLabel> myChangeClass = new ArrayList<>();

    ArrayList<String> myClass = new ArrayList<>();

    ArrayList<String> stringArr = new ArrayList<>();

    ArrayList<String> stringArrC = new ArrayList<>();

    private Icon nick = new ImageIcon(getClass().getResource("spedNick2.jpeg"));

    private Icon river = new ImageIcon(getClass().getResource("spedRiver.png"));

    private Icon pipe = new ImageIcon(getClass().getResource("spedPipe.JPG"));

    private int numClicks = 0;

    private int emptySeat = 1;

    private int emptySeatC = 1;

    boolean adder = false;

    private boolean hasEmptySeat = false;

    String s;

    int addTimes = 0;

    private boolean customMade = false;

    JLabel[] customs = new JLabel[16];

    JPanel pan = new JPanel();

    int changedstrArr = 0;

    int totalEmptySeats = 0;

    int totalEmptySeatsC = 0;

    boolean changedOne = false;

    boolean changedOneC = false;

    JPanel pan2;

    JLabel at;

    JLabel mic;

    JLabel be;

    JLabel cal;

    JLabel pi;

    JLabel riv;

    JLabel tre;

    JLabel seb;

    JLabel nic;

    JLabel lid;

    JLabel eth;

    JLabel kia;

    JLabel dick;

    JLabel cla;

    JLabel ric;

    JLabel ang;


    //MAIN METHOD
    public static void main(String[] args) throws IOException {
        AL myWindow = new AL("Seating Chart");
        myWindow.setSize(1200, 300);
        myWindow.setVisible(true);
    }

    //CONSTRUCTOR
    public AL(String title) throws IOException {
        super(title);
        JOptionPane.showMessageDialog(null, "Welcome to TERRA's new special education program, or more formerly known as TERRA's SPED classes. These special ed clases\nare different than the normal ones you would normally see in your typical school. Instead of containing students that have disabilties,\nthese class contains people who are just downright stupid and can't even complete basic tasks, such as addition or subtraction For instance,\ntake one of our longest standing sutdents, Nick Hartog. Nick has sadly been in the class for over 15 year and stil has issues completing basic motor\n functions such as eating, speaking coherent sentences, and even walking sometimes. We have included a picture of Nick so you can get a good idea of what\nkind of students you may find in this class. Today, you will be working firsthand in the class to learn about and interact with students like this. Once you feel\nconfindent enough working with the childern, you can create your own class that you can control. Have fun today, and enjoy your time with the children!",

                "TERRA's SPED Program", -1, this.nick);
        JOptionPane.showMessageDialog(null, "To create a custom class, add, remove, swap, or move students, just click the button on the screen. You can either use the preloaded class or create your own.");
        createMyClass();
        setLayout(new FlowLayout());
        addWindowListener(this);
        this.b = new Button("Click me to pick actions");
        add(this.pan);
        add(this.b);
        this.b.addActionListener(this);
    }


    //adds all the names to a panel
    public void setUpMyClass() {
        this.myClass.add("Nick L");
        this.myClass.add("Nick H");
        this.myClass.add("Jonah K");
        this.myClass.add("Joel C");
        this.myClass.add("Atlas B");
        this.myClass.add("Ethan D");
        this.myClass.add("Pipe C");
        this.myClass.add("Calvin P");
        this.myClass.add("Kian Z");
        this.myClass.add("Trevor G");
        this.myClass.add("River F");
        this.myClass.add("Donald T");
        this.myClass.add("Bill C");
        this.myClass.add("Chris B");
        this.myClass.add("Ben S");
        this.myClass.add("Jeffrey E");
        this.myClass.add("Harvey W");
        this.myClass.add("Kevin S");
        this.myClass.add("Ivan R");
        this.myClass.add("Marcus A");
        this.myClass.add("Clara J");
        this.myClass.add("O.J S");
        this.myClass.add("Micheal B");
        this.myClass.add("George B");
        this.myClass.add("Ed D");
    }

    //adds the pans to the final image and sets the color and font
    public void createMyClass() {
        setUpMyClass();
        this.pan.setLayout(new GridLayout(5, 10));
        this.pan.setBackground(Color.RED);
        for (int i = 0; i < 25; i++) {
            int rand = (int)(Math.random() * this.myClass.size());
            String temp = this.myClass.get(rand);
            JLabel tempClass = new JLabel(temp);
            tempClass.setFont(new Font("Serif", 2, 30));
            tempClass.setForeground(Color.ORANGE);
            this.myChangeClass.add(tempClass);
            this.pan.add(tempClass);
            this.myClass.remove(rand);
        }
    }

    //Adds back everything to the panel, after the complete removal of everything
    public void addPhotos() throws IOException {
        this.pan.removeAll();
        this.pan.setBackground(Color.ORANGE);
        revalidate();
        int rowCnt = 0;
        int colCnt = 0;
        this.pan.setLayout(new GridLayout(4, 10));
        JOptionPane.showMessageDialog(null, "Type the names of the 16 students you would like to add in the form First name, Last Initial.");
        for (int i = 0; i < 16; i++) {
            int rand = (int)(Math.random() * this.panelList.size());
            String z = JOptionPane.showInputDialog("Enter the name of the student. (Enter in the form First Name, Last Initial");
            JLabel tempText = new JLabel(z);
            tempText.setFont(new Font("Serif", 1, 30));
            tempText.setBackground(Color.RED);
            tempText.setForeground(Color.RED);
            this.customs[i] = tempText;
        }
    }

    //Adds the custom names from the user input into the panel
    public void addCustom() {
        this.pan.add(this.customs[0]);
        this.pan.add(this.customs[4]);
        this.pan.add(this.customs[8]);
        this.pan.add(this.customs[12]);
        this.pan.add(this.customs[1]);
        this.pan.add(this.customs[5]);
        this.pan.add(this.customs[9]);
        this.pan.add(this.customs[13]);
        this.pan.add(this.customs[2]);
        this.pan.add(this.customs[6]);
        this.pan.add(this.customs[10]);
        this.pan.add(this.customs[14]);
        this.pan.add(this.customs[3]);
        this.pan.add(this.customs[7]);
        this.pan.add(this.customs[11]);
        this.pan.add(this.customs[15]);
    }

    //adds the name to the end of the panel with the proper text and
    public void add(String s) {
        JLabel tempText = new JLabel(s);
        tempText.setFont(new Font("Serif", 2, 30));
        tempText.setForeground(Color.BLUE);
        this.addTimes++;
        this.pan.add(tempText);
    }


    //adds to the custom class panel created by the user
    public void addCustom(String s) {
        JLabel tempText = new JLabel(s);
        tempText.setFont(new Font("Serif", 1, 30));
        tempText.setForeground(Color.BLUE);
        if (this.totalEmptySeatsC > 0) {
            int i;
            for (i = 0; i < this.customs.length; i++) {
                if (this.customs[i].getText().contains("Empty Seat")) {
                    this.pan.remove(this.customs[i]);
                    this.customs[i] = new JLabel();
                    this.pan.add(tempText);
                    this.changedOneC = true;
                }
            }
            if (!this.changedOneC)
                for (i = 0; i < this.stringArrC.size(); i++) {
                    if (((String)this.stringArrC.get(i)).contains("Empty Seat")) {
                        JLabel temp = new JLabel(this.stringArrC.get(i));
                        this.pan.remove(temp);
                        this.stringArrC.remove(i);
                        this.changedstrArr++;
                    }
                }
        }
        this.changedOneC = false;
    }

    //adds all the orginal values of the first class back to the panel
    public void addMine(String s) {
        JLabel tempText = new JLabel(s);
        tempText.setFont(new Font("Serif", 2, 30));
        tempText.setForeground(Color.BLUE);
        if (this.totalEmptySeats > 0) {
            int i;
            for (i = 0; i < this.myChangeClass.size(); i++) {
                if (((JLabel)this.myChangeClass.get(i)).getText().contains("Empty Seat")) {
                    this.pan.remove(this.myChangeClass.get(i));
                    this.myChangeClass.remove(i);
                    this.pan.add(tempText);
                    this.changedOne = true;
                }
            }
            if (!this.changedOne)
                for (i = 0; i < this.stringArr.size(); i++) {
                    if (((String)this.stringArr.get(i)).contains("Empty Seat")) {
                        JLabel temp = new JLabel(this.stringArr.get(i));
                        this.pan.remove(temp);
                        this.stringArr.remove(i);
                        this.changedstrArr++;
                        break;
                    }
                }
        }
        this.changedOne = false;
    }

    //searches through the list of names and removes the name, replacing it with "Empty Seat"
    public void remove(String s) {
        int i;
        for (i = 0; i < this.customs.length; i++) {
            if (this.customs[i].getText().equalsIgnoreCase(s)) {
                JLabel temp = new JLabel("Empty Seat " + this.emptySeat++ + "   ");
                temp.setFont(new Font("Serif", 1, 30));
                temp.setForeground(Color.RED);
                this.customs[i] = temp;
            }
            this.pan.removeAll();
            addCustom();
        }
        for (i = 0; i < this.stringArrC.size(); i++) {
            if (((String)this.stringArrC.get(i)).equalsIgnoreCase(s)) {
                String k = "Empty Seat " + this.emptySeatC++ + "   ";
                this.stringArrC.set(i, k);
            }
        }
        this.pan.removeAll();
        addCustom();
        this.hasEmptySeat = true;
        revalidate();
    }

    //searches through my list of names and removes the one that was typed
    public void removeMine(String s) {
        int i;
        for (i = 0; i < this.myChangeClass.size(); i++) {
            if (((JLabel)this.myChangeClass.get(i)).getText().equalsIgnoreCase(s)) {
                JLabel temp = new JLabel("Empty Seat " + this.emptySeatC++ + "   ");
                temp.setForeground(Color.BLUE);
                temp.setFont(new Font("Serif", 2, 30));
                this.myChangeClass.set(i, temp);
            }
        }
        for (i = 0; i < this.stringArr.size(); i++) {
            if (((String)this.stringArr.get(i)).equalsIgnoreCase(s)) {
                String k = "Empty Seat " + this.emptySeatC++ + "   ";
                this.stringArr.set(i, k);
            }
        }
        this.pan.removeAll();
        addAfterRemove();
        revalidate();
    }

    //removes all values from the first class, just loops and removes all from pan
    public void removeAllMine() {
        for (int i = 0; i < this.customs.length; i++) {
            JLabel temp = new JLabel("Empty Seat " + this.emptySeat++ + "   ");
            temp.setFont(new Font("Serif", 1, 30));
            temp.setForeground(Color.RED);
            this.customs[i] = temp;
        }
        this.pan.removeAll();
        addCustom();
        revalidate();
    }

    //adds all values back to the panel
    public void addAfterRemove() {
        for (int i = 0; i < this.myChangeClass.size(); i++)
            this.pan.add(this.myChangeClass.get(i));
    }

    //moves the user inputed student from the custom class to an empty seat within the class by looping through and changing the values
    public void empty() {
        String s = JOptionPane.showInputDialog("Type the first name and last initial of the person you would like to move to an empty seat");
        String t = JOptionPane.showInputDialog("Type the number of the empty seat you would like to move to");
        int x = Integer.parseInt(t);
        String k = "Empty Seat " + x + "   ";
        int i;
        for (i = 0; i < this.customs.length; i++) {
            if (this.customs[i].getText().equalsIgnoreCase(k)) {
                this.customs[i] = new JLabel(s);
                this.customs[i].setFont(new Font("Serif", 1, 30));
                this.customs[i].setForeground(Color.MAGENTA);
            } else if (this.customs[i].getText().equalsIgnoreCase(s)) {
                this.customs[i] = new JLabel("Empty Seat " + x + "   ");
                this.customs[i].setFont(new Font("Serif", 1, 30));
                this.customs[i].setForeground(Color.RED);
            }
        }
        for (i = 0; i < this.stringArrC.size(); i++) {
            if (((String)this.stringArrC.get(i)).equalsIgnoreCase(k)) {
                JLabel temp = new JLabel(s);
                temp.setFont(new Font("Serif", 2, 30));
                temp.setForeground(Color.CYAN);
                this.stringArrC.set(i, s);
            } else if (((String)this.stringArrC.get(i)).equalsIgnoreCase(s)) {
                this.stringArrC.set(i, "Empty Seat " + x + "   ");
            }
        }
        this.pan.removeAll();
        addCustom();
        revalidate();
    }

    //e
    //    //moves the user inputed student from the premade class to an empty seat within the class by looping through and changing the values
    public void emptyMine() {
        String s = JOptionPane.showInputDialog("Type the first name and last initial of the person you would like to move to an empty seat");
        String t = JOptionPane.showInputDialog("Type the number of the empty seat you would like to move to");
        int x = Integer.parseInt(t);
        String k = "Empty Seat " + x + "   ";
        int i;
        for (i = 0; i < this.myChangeClass.size(); i++) {
            if (((JLabel)this.myChangeClass.get(i)).getText().equalsIgnoreCase(k)) {
                this.myChangeClass.set(i, new JLabel(s));
                ((JLabel)this.myChangeClass.get(i)).setFont(new Font("Serif", 2, 30));
                ((JLabel)this.myChangeClass.get(i)).setForeground(Color.CYAN);
            } else if (((JLabel)this.myChangeClass.get(i)).getText().equalsIgnoreCase(s)) {
                this.myChangeClass.set(i, new JLabel("Empty Seat " + x + "   "));
                ((JLabel)this.myChangeClass.get(i)).setFont(new Font("Serif", 2, 30));
                ((JLabel)this.myChangeClass.get(i)).setForeground(Color.BLUE);
            }
        }
        for (i = 0; i < this.stringArr.size(); i++) {
            if (((String)this.stringArr.get(i)).equalsIgnoreCase(k)) {
                JLabel temp = new JLabel(s);
                temp.setFont(new Font("Serif", 2, 30));
                temp.setForeground(Color.CYAN);
                this.stringArr.set(i, s);
            } else if (((String)this.stringArr.get(i)).equalsIgnoreCase(s)) {
                this.stringArr.set(i, "Empty Seat " + x + "   ");
            }
        }
        this.pan.removeAll();
        addAfterRemove();
        revalidate();
    }

    //swaps the postion of two student, in the custom made class
    public void swap() {
        String s = JOptionPane.showInputDialog("Type the first name and last initial of the person you would like to swap");
        String t = JOptionPane.showInputDialog("Type the first and and last intial of another person you would like to swap");
        int i;
        for (i = 0; i < this.customs.length; i++) {
            if (this.customs[i].getText().equalsIgnoreCase(t)) {
                this.customs[i] = new JLabel(s);
                this.customs[i].setFont(new Font("Serif", 1, 30));
                this.customs[i].setForeground(Color.MAGENTA);
            } else if (this.customs[i].getText().equalsIgnoreCase(s)) {
                this.customs[i] = new JLabel(t);
                this.customs[i].setFont(new Font("Serif", 1, 30));
                this.customs[i].setForeground(Color.MAGENTA);
            }
        }
        for (i = 0; i < this.stringArrC.size(); i++) {
            if (((String)this.stringArrC.get(i)).equalsIgnoreCase(t)) {
                JLabel temp = new JLabel(s);
                temp.setFont(new Font("Serif", 2, 30));
                temp.setForeground(Color.CYAN);
                this.stringArrC.set(i, s);
            } else if (((String)this.stringArrC.get(i)).equalsIgnoreCase(s)) {
                this.stringArrC.set(i, t);
            }
        }
        this.pan.removeAll();
        addCustom();
        revalidate();
    }


    //swaps the places of two students in the premade class by using a basic switch metthod
    public void swapMine() {
        String s = JOptionPane.showInputDialog("Type the first name and last initial of the person you would like to swap");
        String t = JOptionPane.showInputDialog("Type the first and and last intial of another person you would like to swap");
        int i;
        for (i = 0; i < this.myChangeClass.size(); i++) {
            if (((JLabel)this.myChangeClass.get(i)).getText().equalsIgnoreCase(t)) {
                JLabel temp = new JLabel(s);
                temp.setFont(new Font("Serif", 2, 30));
                temp.setForeground(Color.CYAN);
                this.myChangeClass.set(i, temp);
            } else if (((JLabel)this.myChangeClass.get(i)).getText().equalsIgnoreCase(s)) {
                this.myChangeClass.set(i, new JLabel(t));
                ((JLabel)this.myChangeClass.get(i)).setFont(new Font("Serif", 2, 30));
                ((JLabel)this.myChangeClass.get(i)).setForeground(Color.CYAN);
            }
        }
        for (i = 0; i < this.stringArr.size(); i++) {
            if (((String)this.stringArr.get(i)).equalsIgnoreCase(t)) {
                JLabel temp = new JLabel(s);
                temp.setFont(new Font("Serif", 2, 30));
                temp.setForeground(Color.CYAN);
                this.stringArr.set(i, s);
            } else if (((String)this.stringArr.get(i)).equalsIgnoreCase(s)) {
                this.stringArr.set(i, t);
            }
        }
        this.pan.removeAll();
        addAfterRemove();
        revalidate();
    }

    ///removes all values from the premade class and revlaideades it after adding back
    public void test(String s) {
        removeMine(s);
        for (int i = 0; i < this.stringArr.size(); i++) {
            add(this.stringArr.get(i));
            revalidate();
        }
    }

    ///removes all values from the custom class and revlaideades it after adding back

    public void testC(String s) {
        remove(s);
        for (int i = 0; i < this.stringArrC.size(); i++) {
            add(this.stringArrC.get(i));
            revalidate();
        }
    }


    //based on which button is clicked, the student is either removed, swapped or moved to an emoty seat, or added to the panel, this is where all methods are finally used
    public void actionPerformed(ActionEvent e) {
        String k = "";
        String[] opt = { "Create Custom", "Add Student", "Remove Student", "Move to Empty Seat", "Swap Students" };
        int z = JOptionPane.showOptionDialog(null, "Pick what you want to do ", " Pick ", -1, -1, null, (Object[])opt, null);
        if (z == 0) {
            JOptionPane.showMessageDialog(null, "Be careful about who you add to your custom clas. In the past, there have been cases where people have formed a class that they feel mixed well togther and excelled but issues have occured.\nFor instance, once a teacher added a student by the name of River to their class. River was orginally added due to his very low IQ and his lack of an ability to do any math or science problems.\nWhen he was added to the class, he brought down the intelligance of all the other members. Students who orginally were progressing instead reverted back in evolution to apes. They lost all possible motor\nfunctions and even lost thier opposable thumbs. May this serve as a warning to be careful who you add to your class and to always make sure they're not too SPED. I've included a picture so you can get an idea of who to avoid.",

                    "Beware Who You Add", -1, this.river);
            try {
                addPhotos();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            addCustom();
            revalidate();
            this.customMade = true;
        } else if (z == 1) {
            if (!this.adder) {
                JOptionPane.showMessageDialog(null, "Hopefully the next person you add doesn't turn out like our most recent added student, Pipe. He started out as a smart student who just had a few issues\nwith communciating with other people and breathing. Recently though, he has devlpoped a crippling addiction to many things such as calclus, asthma inhalers, what he calls power\nNow, after spending a few weeks with some of the other challnged students, he has fallen to their level. For instance, now, like our student River, he believes that Africa is a country.\nSadly, soon Pipe will have to be removed from the course as his lust for power scares many educators. When you add the new student, hopefully they will turn out better than Pipe and\ngrow in the class, rather than absorb the ideas of their fellow SPED students.",

                        "Add", -1, this.pipe);
                this.adder = true;
            }
            this.s = JOptionPane.showInputDialog("Enter the first name and last intial of the person you would like to add");
            if (this.customMade) {
                if (this.totalEmptySeatsC > 0) {
                    addCustom(this.s);
                    this.totalEmptySeatsC--;
                } else {
                    add(this.s);
                }
                this.stringArrC.add(this.s);
                testC("");
            } else {
                if (this.totalEmptySeats > 0) {
                    addMine(this.s);
                    this.totalEmptySeats--;
                } else {
                    add(this.s);
                }
                this.stringArr.add(this.s);
                test("");
            }
            revalidate();
        } else if (z == 2) {
            String s = JOptionPane.showInputDialog("Give the First name and last intial of the person you want to remove");
            if (this.customMade) {
                testC(s);
            } else {
                test(s);
            }
            this.totalEmptySeatsC++;
            this.totalEmptySeats++;
        } else if (z == 3) {
            if (this.totalEmptySeats > 0 || this.totalEmptySeatsC > 0) {
                if (this.customMade) {
                    empty();
                    for (int i = 0; i < this.stringArrC.size(); i++) {
                        add(this.stringArrC.get(i));
                        revalidate();
                    }
                } else {
                    emptyMine();
                    for (int i = 0; i < this.stringArr.size(); i++) {
                        add(this.stringArr.get(i));
                        revalidate();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "There are no empty seats in the class, remove someone to get an empty seat");
            }
        } else if (z == 4) {
            if (this.customMade) {
                swap();
                for (int i = 0; i < this.stringArrC.size(); i++) {
                    add(this.stringArrC.get(i));
                    revalidate();
                }
            } else {
                swapMine();
                for (int i = 0; i < this.stringArr.size(); i++) {
                    add(this.stringArr.get(i));
                    revalidate();
                }
            }
        }
        if (z == 5 &&
                this.customMade)
            removeAllMine();
    }


    //disposes of the window
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }


    //other required methods with a windowEvent
    public void windowOpened(WindowEvent e) {}

    public void windowActivated(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {}

    public void windowDeiconified(WindowEvent e) {}

    public void windowDeactivated(WindowEvent e) {}

    public void windowClosed(WindowEvent e) {}
}
