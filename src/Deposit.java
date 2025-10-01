import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.*;


public class Deposit extends JFrame implements ActionListener {
    JButton back,deposit;
    JTextField amount;
    String pin;
    Deposit(String pin) {
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to deposit. ");
        text.setBounds(200, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        amount=new JTextField();
        amount.setFont(new Font("System", Font.BOLD, 22));
        amount.setBounds(190, 350, 300, 22);
        amount.addActionListener(this);
        image.add(amount) ;

        deposit = new JButton("Deposit");
        deposit.setBounds(360,487,150, 25);
        deposit.setFont(new Font("System", Font.BOLD, 16));
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(360,520,150, 25);
        back.setFont(new Font("System", Font.BOLD, 16));
        back.addActionListener(this);
        image.add(back);


        add(image);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==deposit){
            String number = amount.getText();
            Date date = new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            } else {
                try {
                    Conn conn = new Conn();
                    String query = "INSERT INTO bank(pin, date, type, amount) VALUES('"
                            + pin + "','" + date + "','Deposit','" + number + "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs" +number+ "Deposited successfully");
                    setVisible(false);
                    new Transaction(pin).setVisible(true);
            }
                catch (Exception ae){
                    System.out.println(ae);
                }
            }

        }else if(e.getSource()==back){
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }
    }



    public static void main(String args[]) {
        new Deposit("");

    }
}