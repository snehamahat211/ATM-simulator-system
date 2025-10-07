import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Balancecheck extends JFrame implements ActionListener {
    JButton back;
    String pinchange;

    Balancecheck(String pinchange) {
        this.pinchange = pinchange;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        back = new JButton("Back");
        back.setBounds(360, 520, 150, 25);
        back.setFont(new Font("System", Font.BOLD, 16));
        back.addActionListener(this);

        setSize(900,900);
        setLocation(300,0);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {}
    public static void main(String[] args) {
        new Balancecheck("").setVisible(true);
    }
}

