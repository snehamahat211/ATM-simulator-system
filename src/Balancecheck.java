import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Balancecheck extends JFrame implements ActionListener {
    JButton back;
    String pin;

    Balancecheck(String pin) {
        this.pin = pin;
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
        image.add(back);

        int balance = 0;

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pin + "'");

            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        JLabel text = new JLabel("Your Current Balance is Rs " + balance);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 400, 400, 30);
        image.add(text);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transaction(pin).setVisible(true);
    }

    public static void main(String[] args) {
        new Balancecheck("").setVisible(true);
    }
}
