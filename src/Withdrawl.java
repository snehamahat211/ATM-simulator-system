import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    JButton back, withdrawl;
    JTextField amount;
    String pin;

    Withdrawl(String pin) {
        this.pin = pin; // ✅ fix: assign pin
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to deposit: ");
        text.setBounds(200, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("System", Font.BOLD, 22));
        amount.setBounds(190, 350, 300, 30);
        image.add(amount);

        withdrawl = new JButton("Withdraw");
        withdrawl.setBounds(360, 487, 150, 25);
        withdrawl.setFont(new Font("System", Font.BOLD, 16));
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        back = new JButton("Back");
        back.setBounds(360, 520, 150, 25);
        back.setFont(new Font("System", Font.BOLD, 16));
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == withdrawl) {
            String number = amount.getText().trim();
            Date date = new Date();

            if (number.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdrawl");
            } else {
                try {
                    Conn conn = new Conn();

                    // Format date as string
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String formattedDate = sdf.format(date);

                    String query = "INSERT INTO bank(pin, date, type, amount) VALUES(?, ?, ?, ?)";
                    PreparedStatement ps = conn.c.prepareStatement(query);
                    ps.setString(1, pin);
                    ps.setString(2, formattedDate);
                    ps.setString(3, "Withdrawl");
                    ps.setInt(4, Integer.parseInt(number));

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Rs " + number + " Cash Withdrawl successfully");
                    setVisible(false);
                    new Transaction(pin).setVisible(true);

                } catch (Exception ae) {
                    ae.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error: " + ae.getMessage());
                }
            }
        } else if (e.getSource() == back) {
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Withdrawl("");
    }
}
