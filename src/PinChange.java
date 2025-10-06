
import javax.swing.*;
import java.awt.*;
public class PinChange extends JFrame {
    String pin;
    JTextField change,change2;

    PinChange(String pin) {
        this.pin=pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text=new JLabel("CHANGE YOUR PIN");
        text.setBounds(235,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        JLabel pintext=new JLabel("New Pin Number:");
        pintext.setBounds(200,340,500,20);
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("System",Font.BOLD,12));
        image.add(pintext);

        change = new JTextField();
        change.setFont(new Font("System", Font.BOLD, 22));
        change.setBounds(380, 340, 130, 26);
        image.add(change);

        JLabel ptext=new JLabel("Confirm New Pin Number:");
        ptext.setBounds(200,380,500,20);
        ptext.setForeground(Color.white);
        ptext.setFont(new Font("System",Font.BOLD,12));
        image.add(ptext);

        change2 = new JTextField();
        change2.setFont(new Font("System", Font.BOLD, 22));
        change2.setBounds(380, 380, 130, 26);
        image.add(change2);

        JButton button = new JButton("Confirm");
        button.setFont(new Font("System", Font.BOLD,12));
        button.setBounds(400,488,110,28);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.white);
        image.add(button);

        JButton button2 = new JButton("Back");
        button2.setFont(new Font("System", Font.BOLD,12));
        button2.setBounds(400,518,110,28);
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.white);
        image.add(button2);








        setSize(900,900);
        setLocation(300,0);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}