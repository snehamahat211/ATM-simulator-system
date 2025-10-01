import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Deposit extends JFrame {
    JButton back,deposit;
    JTextField amount;
    Deposit() {
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
        image.add(amount) ;

        deposit = new JButton("Deposit");
        deposit.setBounds(360,487,150, 25);
        deposit.setFont(new Font("System", Font.BOLD, 16));
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(360,520,150, 25);
        back.setFont(new Font("System", Font.BOLD, 16));
        image.add(back);


        add(image);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);



    }


    public static void main(String args[]) {
        new Deposit();

    }
}